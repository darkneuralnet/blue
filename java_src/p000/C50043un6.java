package p000;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.constant.BirdLocationSource;
import co.bird.android.model.constant.BirdModel;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bS\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020'\u0012\b\b\u0002\u0010*\u001a\u00020'\u0012\b\b\u0002\u0010+\u001a\u00020'\u0012\b\b\u0002\u0010,\u001a\u00020'\u0012\b\b\u0002\u0010-\u001a\u00020'\u0012\b\b\u0002\u0010.\u001a\u00020'\u0012\b\b\u0002\u0010/\u001a\u00020'\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bx\u0010yJÒ\u0003\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020'2\b\b\u0002\u0010-\u001a\u00020'2\b\b\u0002\u0010.\u001a\u00020'2\b\b\u0002\u0010/\u001a\u00020'2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b1\u00102J\t\u00103\u001a\u00020\u0012HÖ\u0001J\t\u00104\u001a\u00020\u0004HÖ\u0001J\u0013\u00106\u001a\u00020'2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u00109R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u00109R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u00107\u001a\u0004\bF\u00109R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bH\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bJ\u0010VR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b>\u0010YR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bZ\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bR\u0010U\u001a\u0004\b[\u0010VR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u00107\u001a\u0004\b\\\u00109R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b[\u0010;\u001a\u0004\b]\u0010=R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u00109R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bD\u0010U\u001a\u0004\bK\u0010VR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bI\u0010;\u001a\u0004\b^\u0010=R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bG\u0010U\u001a\u0004\b@\u0010VR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b_\u0010=R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\\\u00107\u001a\u0004\bL\u00109R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b]\u0010;\u001a\u0004\bP\u0010=R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u00107\u001a\u0004\bT\u00109R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b<\u0010`\u001a\u0004\bW\u0010aR\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u00107\u001a\u0004\bb\u00109R\u0019\u0010$\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bc\u0010;\u001a\u0004\bc\u0010=R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bd\u00107\u001a\u0004\bd\u00109R\u0019\u0010&\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\be\u0010;\u001a\u0004\be\u0010=R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010)\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bj\u0010g\u001a\u0004\bk\u0010iR\u0017\u0010*\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bl\u0010g\u001a\u0004\bm\u0010iR\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bn\u0010g\u001a\u0004\bo\u0010iR\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bX\u0010g\u001a\u0004\bp\u0010iR\u0017\u0010-\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bq\u0010g\u001a\u0004\br\u0010iR\u0017\u0010.\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bs\u0010g\u001a\u0004\bt\u0010iR\u0017\u0010/\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bu\u0010g\u001a\u0004\bv\u0010iR\u0019\u00100\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bw\u0010U\u001a\u0004\bZ\u0010V¨\u0006z"}, m28432d2 = {"Lun6;", "", "", "title", "", "titleTextColor", "statusTitle", "statusDescription", "Landroid/graphics/drawable/Drawable;", "statusIcon", "statusIconColor", "statusIconBackgroundTint", "caption", "captionTextColor", "Lco/bird/android/model/MobilePartner;", "partner", "Lco/bird/android/model/constant/BirdModel;", RequestHeadersFactory.MODEL, "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "batteryLevel", "battery", "ratingAverage", "time", "timeTextColor", AccountRangeJsonParser.FIELD_BRAND, "condition", "conditionTextColor", "brainState", "brainStateTextColor", "lastCellularTrack", "lastCellularTrackTextColor", "lastLocatedAt", "Lco/bird/android/model/constant/BirdLocationSource;", "lastLocatedSource", "value1", "value1TextColor", "value2", "value2TextColor", "", "titleVisible", "captionVisible", "partnerAndModelVisible", "batteryVisible", "timeVisible", "lastCellularVisible", "value1Visible", "value2Visible", "markerLabel", C17296a.f69688o, "(Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;Lco/bird/android/model/MobilePartner;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;ILjava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Lco/bird/android/model/constant/BirdLocationSource;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;ZZZZZZZZLjava/lang/String;)Lun6;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/CharSequence;", "y", "()Ljava/lang/CharSequence;", "b", "Ljava/lang/Integer;", "z", "()Ljava/lang/Integer;", "c", "v", DateTokenConverter.CONVERTER_KEY, "r", "e", "Landroid/graphics/drawable/Drawable;", "s", "()Landroid/graphics/drawable/Drawable;", "f", "u", "g", "t", "h", "i", "j", "Lco/bird/android/model/MobilePartner;", "p", "()Lco/bird/android/model/MobilePartner;", "k", "Lco/bird/android/model/constant/BirdModel;", "o", "()Lco/bird/android/model/constant/BirdModel;", "l", "Ljava/lang/String;", "()Ljava/lang/String;", "m", "I", "()I", "n", "q", "w", "x", "getConditionTextColor", "getBrainStateTextColor", "Lco/bird/android/model/constant/BirdLocationSource;", "()Lco/bird/android/model/constant/BirdLocationSource;", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", "Z", "getTitleVisible", "()Z", "F", "getCaptionVisible", "G", "getPartnerAndModelVisible", "H", "getBatteryVisible", "getTimeVisible", "J", "getLastCellularVisible", "K", "getValue1Visible", "L", "getValue2Visible", "M", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;Lco/bird/android/model/MobilePartner;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;ILjava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Lco/bird/android/model/constant/BirdLocationSource;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;ZZZZZZZZLjava/lang/String;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: un6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50043un6 {

    /* renamed from: A */
    public final CharSequence f112956A;

    /* renamed from: B */
    public final Integer f112957B;

    /* renamed from: C */
    public final CharSequence f112958C;

    /* renamed from: D */
    public final Integer f112959D;

    /* renamed from: E */
    public final boolean f112960E;

    /* renamed from: F */
    public final boolean f112961F;

    /* renamed from: G */
    public final boolean f112962G;

    /* renamed from: H */
    public final boolean f112963H;

    /* renamed from: I */
    public final boolean f112964I;

    /* renamed from: J */
    public final boolean f112965J;

    /* renamed from: K */
    public final boolean f112966K;

    /* renamed from: L */
    public final boolean f112967L;

    /* renamed from: M */
    public final String f112968M;

    /* renamed from: a */
    public final CharSequence f112969a;

    /* renamed from: b */
    public final Integer f112970b;

    /* renamed from: c */
    public final CharSequence f112971c;

    /* renamed from: d */
    public final CharSequence f112972d;

    /* renamed from: e */
    public final Drawable f112973e;

    /* renamed from: f */
    public final Integer f112974f;

    /* renamed from: g */
    public final Integer f112975g;

    /* renamed from: h */
    public final CharSequence f112976h;

    /* renamed from: i */
    public final Integer f112977i;

    /* renamed from: j */
    public final MobilePartner f112978j;

    /* renamed from: k */
    public final BirdModel f112979k;

    /* renamed from: l */
    public final String f112980l;

    /* renamed from: m */
    public final int f112981m;

    /* renamed from: n */
    public final CharSequence f112982n;

    /* renamed from: o */
    public final String f112983o;

    /* renamed from: p */
    public final CharSequence f112984p;

    /* renamed from: q */
    public final Integer f112985q;

    /* renamed from: r */
    public final CharSequence f112986r;

    /* renamed from: s */
    public final String f112987s;

    /* renamed from: t */
    public final Integer f112988t;

    /* renamed from: u */
    public final String f112989u;

    /* renamed from: v */
    public final Integer f112990v;

    /* renamed from: w */
    public final CharSequence f112991w;

    /* renamed from: x */
    public final Integer f112992x;

    /* renamed from: y */
    public final CharSequence f112993y;

    /* renamed from: z */
    public final BirdLocationSource f112994z;

    public C50043un6() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, -1, 127, null);
    }

    /* renamed from: A */
    public final CharSequence m9766A() {
        return this.f112956A;
    }

    /* renamed from: B */
    public final Integer m9765B() {
        return this.f112957B;
    }

    /* renamed from: C */
    public final CharSequence m9764C() {
        return this.f112958C;
    }

    /* renamed from: D */
    public final Integer m9763D() {
        return this.f112959D;
    }

    /* renamed from: a */
    public final C50043un6 m9762a(CharSequence charSequence, Integer num, CharSequence charSequence2, CharSequence charSequence3, Drawable drawable, Integer num2, Integer num3, CharSequence charSequence4, Integer num4, MobilePartner mobilePartner, BirdModel birdModel, String str, int i, CharSequence charSequence5, String str2, CharSequence charSequence6, Integer num5, CharSequence charSequence7, String str3, Integer num6, String str4, Integer num7, CharSequence charSequence8, Integer num8, CharSequence charSequence9, BirdLocationSource birdLocationSource, CharSequence charSequence10, Integer num9, CharSequence charSequence11, Integer num10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str5) {
        return new C50043un6(charSequence, num, charSequence2, charSequence3, drawable, num2, num3, charSequence4, num4, mobilePartner, birdModel, str, i, charSequence5, str2, charSequence6, num5, charSequence7, str3, num6, str4, num7, charSequence8, num8, charSequence9, birdLocationSource, charSequence10, num9, charSequence11, num10, z, z2, z3, z4, z5, z6, z7, z8, str5);
    }

    /* renamed from: b */
    public final CharSequence m9761b() {
        return this.f112982n;
    }

    /* renamed from: c */
    public final int m9760c() {
        return this.f112981m;
    }

    /* renamed from: d */
    public final String m9759d() {
        return this.f112989u;
    }

    /* renamed from: e */
    public final CharSequence m9758e() {
        return this.f112986r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50043un6) {
            C50043un6 c50043un6 = (C50043un6) obj;
            return Intrinsics.areEqual(this.f112969a, c50043un6.f112969a) && Intrinsics.areEqual(this.f112970b, c50043un6.f112970b) && Intrinsics.areEqual(this.f112971c, c50043un6.f112971c) && Intrinsics.areEqual(this.f112972d, c50043un6.f112972d) && Intrinsics.areEqual(this.f112973e, c50043un6.f112973e) && Intrinsics.areEqual(this.f112974f, c50043un6.f112974f) && Intrinsics.areEqual(this.f112975g, c50043un6.f112975g) && Intrinsics.areEqual(this.f112976h, c50043un6.f112976h) && Intrinsics.areEqual(this.f112977i, c50043un6.f112977i) && Intrinsics.areEqual(this.f112978j, c50043un6.f112978j) && this.f112979k == c50043un6.f112979k && Intrinsics.areEqual(this.f112980l, c50043un6.f112980l) && this.f112981m == c50043un6.f112981m && Intrinsics.areEqual(this.f112982n, c50043un6.f112982n) && Intrinsics.areEqual(this.f112983o, c50043un6.f112983o) && Intrinsics.areEqual(this.f112984p, c50043un6.f112984p) && Intrinsics.areEqual(this.f112985q, c50043un6.f112985q) && Intrinsics.areEqual(this.f112986r, c50043un6.f112986r) && Intrinsics.areEqual(this.f112987s, c50043un6.f112987s) && Intrinsics.areEqual(this.f112988t, c50043un6.f112988t) && Intrinsics.areEqual(this.f112989u, c50043un6.f112989u) && Intrinsics.areEqual(this.f112990v, c50043un6.f112990v) && Intrinsics.areEqual(this.f112991w, c50043un6.f112991w) && Intrinsics.areEqual(this.f112992x, c50043un6.f112992x) && Intrinsics.areEqual(this.f112993y, c50043un6.f112993y) && this.f112994z == c50043un6.f112994z && Intrinsics.areEqual(this.f112956A, c50043un6.f112956A) && Intrinsics.areEqual(this.f112957B, c50043un6.f112957B) && Intrinsics.areEqual(this.f112958C, c50043un6.f112958C) && Intrinsics.areEqual(this.f112959D, c50043un6.f112959D) && this.f112960E == c50043un6.f112960E && this.f112961F == c50043un6.f112961F && this.f112962G == c50043un6.f112962G && this.f112963H == c50043un6.f112963H && this.f112964I == c50043un6.f112964I && this.f112965J == c50043un6.f112965J && this.f112966K == c50043un6.f112966K && this.f112967L == c50043un6.f112967L && Intrinsics.areEqual(this.f112968M, c50043un6.f112968M);
        }
        return false;
    }

    /* renamed from: f */
    public final CharSequence m9757f() {
        return this.f112976h;
    }

    /* renamed from: g */
    public final Integer m9756g() {
        return this.f112977i;
    }

    /* renamed from: h */
    public final String m9755h() {
        return this.f112980l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        CharSequence charSequence = this.f112969a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Integer num = this.f112970b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        CharSequence charSequence2 = this.f112971c;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f112972d;
        int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Drawable drawable = this.f112973e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num2 = this.f112974f;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f112975g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        CharSequence charSequence4 = this.f112976h;
        int hashCode8 = (hashCode7 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        Integer num4 = this.f112977i;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        MobilePartner mobilePartner = this.f112978j;
        int hashCode10 = (hashCode9 + (mobilePartner == null ? 0 : mobilePartner.hashCode())) * 31;
        BirdModel birdModel = this.f112979k;
        int hashCode11 = (hashCode10 + (birdModel == null ? 0 : birdModel.hashCode())) * 31;
        String str = this.f112980l;
        int hashCode12 = (((hashCode11 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f112981m)) * 31;
        CharSequence charSequence5 = this.f112982n;
        int hashCode13 = (hashCode12 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        String str2 = this.f112983o;
        int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence6 = this.f112984p;
        int hashCode15 = (hashCode14 + (charSequence6 == null ? 0 : charSequence6.hashCode())) * 31;
        Integer num5 = this.f112985q;
        int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        CharSequence charSequence7 = this.f112986r;
        int hashCode17 = (hashCode16 + (charSequence7 == null ? 0 : charSequence7.hashCode())) * 31;
        String str3 = this.f112987s;
        int hashCode18 = (hashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num6 = this.f112988t;
        int hashCode19 = (hashCode18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str4 = this.f112989u;
        int hashCode20 = (hashCode19 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num7 = this.f112990v;
        int hashCode21 = (hashCode20 + (num7 == null ? 0 : num7.hashCode())) * 31;
        CharSequence charSequence8 = this.f112991w;
        int hashCode22 = (hashCode21 + (charSequence8 == null ? 0 : charSequence8.hashCode())) * 31;
        Integer num8 = this.f112992x;
        int hashCode23 = (hashCode22 + (num8 == null ? 0 : num8.hashCode())) * 31;
        CharSequence charSequence9 = this.f112993y;
        int hashCode24 = (hashCode23 + (charSequence9 == null ? 0 : charSequence9.hashCode())) * 31;
        BirdLocationSource birdLocationSource = this.f112994z;
        int hashCode25 = (hashCode24 + (birdLocationSource == null ? 0 : birdLocationSource.hashCode())) * 31;
        CharSequence charSequence10 = this.f112956A;
        int hashCode26 = (hashCode25 + (charSequence10 == null ? 0 : charSequence10.hashCode())) * 31;
        Integer num9 = this.f112957B;
        int hashCode27 = (hashCode26 + (num9 == null ? 0 : num9.hashCode())) * 31;
        CharSequence charSequence11 = this.f112958C;
        int hashCode28 = (hashCode27 + (charSequence11 == null ? 0 : charSequence11.hashCode())) * 31;
        Integer num10 = this.f112959D;
        int hashCode29 = (hashCode28 + (num10 == null ? 0 : num10.hashCode())) * 31;
        boolean z = this.f112960E;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode29 + i) * 31;
        boolean z2 = this.f112961F;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f112962G;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.f112963H;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.f112964I;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.f112965J;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.f112966K;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z8 = this.f112967L;
        int i15 = (i14 + (z8 ? 1 : z8 ? 1 : 0)) * 31;
        String str5 = this.f112968M;
        return i15 + (str5 != null ? str5.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m9754i() {
        return this.f112987s;
    }

    /* renamed from: j */
    public final CharSequence m9753j() {
        return this.f112991w;
    }

    /* renamed from: k */
    public final Integer m9752k() {
        return this.f112992x;
    }

    /* renamed from: l */
    public final CharSequence m9751l() {
        return this.f112993y;
    }

    /* renamed from: m */
    public final BirdLocationSource m9750m() {
        return this.f112994z;
    }

    /* renamed from: n */
    public final String m9749n() {
        return this.f112968M;
    }

    /* renamed from: o */
    public final BirdModel m9748o() {
        return this.f112979k;
    }

    /* renamed from: p */
    public final MobilePartner m9747p() {
        return this.f112978j;
    }

    /* renamed from: q */
    public final String m9746q() {
        return this.f112983o;
    }

    /* renamed from: r */
    public final CharSequence m9745r() {
        return this.f112972d;
    }

    /* renamed from: s */
    public final Drawable m9744s() {
        return this.f112973e;
    }

    /* renamed from: t */
    public final Integer m9743t() {
        return this.f112975g;
    }

    public String toString() {
        CharSequence charSequence = this.f112969a;
        Integer num = this.f112970b;
        CharSequence charSequence2 = this.f112971c;
        CharSequence charSequence3 = this.f112972d;
        Drawable drawable = this.f112973e;
        Integer num2 = this.f112974f;
        Integer num3 = this.f112975g;
        CharSequence charSequence4 = this.f112976h;
        Integer num4 = this.f112977i;
        MobilePartner mobilePartner = this.f112978j;
        BirdModel birdModel = this.f112979k;
        String str = this.f112980l;
        int i = this.f112981m;
        CharSequence charSequence5 = this.f112982n;
        String str2 = this.f112983o;
        CharSequence charSequence6 = this.f112984p;
        Integer num5 = this.f112985q;
        CharSequence charSequence7 = this.f112986r;
        String str3 = this.f112987s;
        Integer num6 = this.f112988t;
        String str4 = this.f112989u;
        Integer num7 = this.f112990v;
        CharSequence charSequence8 = this.f112991w;
        Integer num8 = this.f112992x;
        CharSequence charSequence9 = this.f112993y;
        BirdLocationSource birdLocationSource = this.f112994z;
        CharSequence charSequence10 = this.f112956A;
        Integer num9 = this.f112957B;
        CharSequence charSequence11 = this.f112958C;
        Integer num10 = this.f112959D;
        boolean z = this.f112960E;
        boolean z2 = this.f112961F;
        boolean z3 = this.f112962G;
        boolean z4 = this.f112963H;
        boolean z5 = this.f112964I;
        boolean z6 = this.f112965J;
        boolean z7 = this.f112966K;
        boolean z8 = this.f112967L;
        String str5 = this.f112968M;
        return "VehicleSummaryViewModel(title=" + ((Object) charSequence) + ", titleTextColor=" + num + ", statusTitle=" + ((Object) charSequence2) + ", statusDescription=" + ((Object) charSequence3) + ", statusIcon=" + drawable + ", statusIconColor=" + num2 + ", statusIconBackgroundTint=" + num3 + ", caption=" + ((Object) charSequence4) + ", captionTextColor=" + num4 + ", partner=" + mobilePartner + ", model=" + birdModel + ", code=" + str + ", batteryLevel=" + i + ", battery=" + ((Object) charSequence5) + ", ratingAverage=" + str2 + ", time=" + ((Object) charSequence6) + ", timeTextColor=" + num5 + ", brand=" + ((Object) charSequence7) + ", condition=" + str3 + ", conditionTextColor=" + num6 + ", brainState=" + str4 + ", brainStateTextColor=" + num7 + ", lastCellularTrack=" + ((Object) charSequence8) + ", lastCellularTrackTextColor=" + num8 + ", lastLocatedAt=" + ((Object) charSequence9) + ", lastLocatedSource=" + birdLocationSource + ", value1=" + ((Object) charSequence10) + ", value1TextColor=" + num9 + ", value2=" + ((Object) charSequence11) + ", value2TextColor=" + num10 + ", titleVisible=" + z + ", captionVisible=" + z2 + ", partnerAndModelVisible=" + z3 + ", batteryVisible=" + z4 + ", timeVisible=" + z5 + ", lastCellularVisible=" + z6 + ", value1Visible=" + z7 + ", value2Visible=" + z8 + ", markerLabel=" + str5 + ")";
    }

    /* renamed from: u */
    public final Integer m9742u() {
        return this.f112974f;
    }

    /* renamed from: v */
    public final CharSequence m9741v() {
        return this.f112971c;
    }

    /* renamed from: w */
    public final CharSequence m9740w() {
        return this.f112984p;
    }

    /* renamed from: x */
    public final Integer m9739x() {
        return this.f112985q;
    }

    /* renamed from: y */
    public final CharSequence m9738y() {
        return this.f112969a;
    }

    /* renamed from: z */
    public final Integer m9737z() {
        return this.f112970b;
    }

    public C50043un6(CharSequence charSequence, Integer num, CharSequence charSequence2, CharSequence charSequence3, Drawable drawable, Integer num2, Integer num3, CharSequence charSequence4, Integer num4, MobilePartner mobilePartner, BirdModel birdModel, String str, int i, CharSequence charSequence5, String str2, CharSequence charSequence6, Integer num5, CharSequence charSequence7, String str3, Integer num6, String str4, Integer num7, CharSequence charSequence8, Integer num8, CharSequence charSequence9, BirdLocationSource birdLocationSource, CharSequence charSequence10, Integer num9, CharSequence charSequence11, Integer num10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str5) {
        this.f112969a = charSequence;
        this.f112970b = num;
        this.f112971c = charSequence2;
        this.f112972d = charSequence3;
        this.f112973e = drawable;
        this.f112974f = num2;
        this.f112975g = num3;
        this.f112976h = charSequence4;
        this.f112977i = num4;
        this.f112978j = mobilePartner;
        this.f112979k = birdModel;
        this.f112980l = str;
        this.f112981m = i;
        this.f112982n = charSequence5;
        this.f112983o = str2;
        this.f112984p = charSequence6;
        this.f112985q = num5;
        this.f112986r = charSequence7;
        this.f112987s = str3;
        this.f112988t = num6;
        this.f112989u = str4;
        this.f112990v = num7;
        this.f112991w = charSequence8;
        this.f112992x = num8;
        this.f112993y = charSequence9;
        this.f112994z = birdLocationSource;
        this.f112956A = charSequence10;
        this.f112957B = num9;
        this.f112958C = charSequence11;
        this.f112959D = num10;
        this.f112960E = z;
        this.f112961F = z2;
        this.f112962G = z3;
        this.f112963H = z4;
        this.f112964I = z5;
        this.f112965J = z6;
        this.f112966K = z7;
        this.f112967L = z8;
        this.f112968M = str5;
    }

    public /* synthetic */ C50043un6(CharSequence charSequence, Integer num, CharSequence charSequence2, CharSequence charSequence3, Drawable drawable, Integer num2, Integer num3, CharSequence charSequence4, Integer num4, MobilePartner mobilePartner, BirdModel birdModel, String str, int i, CharSequence charSequence5, String str2, CharSequence charSequence6, Integer num5, CharSequence charSequence7, String str3, Integer num6, String str4, Integer num7, CharSequence charSequence8, Integer num8, CharSequence charSequence9, BirdLocationSource birdLocationSource, CharSequence charSequence10, Integer num9, CharSequence charSequence11, Integer num10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : charSequence, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : charSequence2, (i2 & 8) != 0 ? null : charSequence3, (i2 & 16) != 0 ? null : drawable, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : num3, (i2 & 128) != 0 ? null : charSequence4, (i2 & 256) != 0 ? null : num4, (i2 & 512) != 0 ? null : mobilePartner, (i2 & 1024) != 0 ? null : birdModel, (i2 & 2048) != 0 ? null : str, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) != 0 ? null : charSequence5, (i2 & 16384) != 0 ? null : str2, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : charSequence6, (i2 & 65536) != 0 ? null : num5, (i2 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : charSequence7, (i2 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : str3, (i2 & 524288) != 0 ? null : num6, (i2 & 1048576) != 0 ? null : str4, (i2 & 2097152) != 0 ? null : num7, (i2 & 4194304) != 0 ? null : charSequence8, (i2 & 8388608) != 0 ? null : num8, (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : charSequence9, (i2 & 33554432) != 0 ? null : birdLocationSource, (i2 & 67108864) != 0 ? null : charSequence10, (i2 & 134217728) != 0 ? null : num9, (i2 & 268435456) != 0 ? null : charSequence11, (i2 & 536870912) != 0 ? null : num10, (i2 & 1073741824) != 0 ? true : z, (i2 & Integer.MIN_VALUE) != 0 ? true : z2, (i3 & 1) != 0 ? true : z3, (i3 & 2) != 0 ? true : z4, (i3 & 4) != 0 ? true : z5, (i3 & 8) != 0 ? true : z6, (i3 & 16) != 0 ? true : z7, (i3 & 32) == 0 ? z8 : true, (i3 & 64) != 0 ? null : str5);
    }
}
