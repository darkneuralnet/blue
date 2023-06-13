package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdTaskKind;
import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.constant.MapPinBadge;
import co.bird.android.model.constant.NestPurpose;
import co.bird.android.model.constant.PartnerBirdState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Source;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
@Metadata(m28433d1 = {"\u0000¥\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u00ad\u0001\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u0086\u00022\u00020\u0001:\u0002\u0086\u0002Bá\u0005\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0010\u0012\b\b\u0002\u0010\"\u001a\u00020\u0010\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010,\u001a\u00020\u0010\u0012\b\b\u0002\u0010-\u001a\u00020\u0010\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u00100\u001a\u00020\u0010\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u00105\u001a\u00020\u0010\u0012\b\b\u0002\u00106\u001a\u00020\u0010\u0012\b\b\u0002\u00107\u001a\u00020\u0010\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010=\u001a\u00020\u0010\u0012\b\b\u0002\u0010>\u001a\u00020\u0010\u0012\b\b\u0002\u0010?\u001a\u00020@\u0012\b\b\u0002\u0010A\u001a\u00020\u0010\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010K\u001a\u00020L\u0012\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u001c\u0012\b\b\u0002\u0010O\u001a\u00020\u0010\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010Q\u001a\u00020\u0010\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010VJ\n\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u001aHÆ\u0003J\u0010\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010lJ\n\u0010Å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010È\u0001\u001a\u00020$HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020'HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u000104HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0010HÆ\u0003J\u0011\u0010á\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010lJ\n\u0010â\u0001\u001a\u00020@HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010ä\u0001\u001a\u0004\u0018\u00010CHÆ\u0003J\f\u0010å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u00010GHÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010IHÆ\u0003J\f\u0010é\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\n\u0010ê\u0001\u001a\u00020LHÆ\u0003J\u0010\u0010ë\u0001\u001a\b\u0012\u0004\u0012\u00020N0\u001cHÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010ð\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jì\u0005\u0010÷\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010,\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00102\n\b\u0002\u0010.\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010)2\b\b\u0002\u00100\u001a\u00020\u00102\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u00020\u00102\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u00020\u00102\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010=\u001a\u00020\u00102\b\b\u0002\u0010>\u001a\u00020\u00102\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020\u00102\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010K\u001a\u00020L2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u001c2\b\b\u0002\u0010O\u001a\u00020\u00102\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010Q\u001a\u00020\u00102\n\b\u0002\u0010R\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010ø\u0001J\n\u0010ù\u0001\u001a\u00020\u0007HÖ\u0001J\u0016\u0010ú\u0001\u001a\u00020\u00102\n\u0010û\u0001\u001a\u0005\u0018\u00010ü\u0001HÖ\u0003J\n\u0010ý\u0001\u001a\u00020\u0007HÖ\u0001J\u0010\u0010þ\u0001\u001a\u00020\u00102\u0007\u0010û\u0001\u001a\u00020\u0000J\u0010\u0010ÿ\u0001\u001a\u00020\u00102\u0007\u0010û\u0001\u001a\u00020\u0000J\t\u0010\u0080\u0002\u001a\u00020\u0003H\u0016J\u001e\u0010\u0081\u0002\u001a\u00030\u0082\u00022\b\u0010\u0083\u0002\u001a\u00030\u0084\u00022\u0007\u0010\u0085\u0002\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0018\u0010D\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0016\u00100\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010XR\u0016\u0010K\u001a\u00020L8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0018\u0010S\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\\R\u0016\u0010,\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010XR\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010\\R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010\\R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010\\R\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0016\u0010!\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010XR\u0016\u0010\"\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010XR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010m\u001a\u0004\bk\u0010lR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010ZR\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010\\R\u0016\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010XR\u0016\u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010XR\u0018\u0010T\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010\\R\u0016\u0010-\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010XR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010\\R\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010XR\u0016\u0010>\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010XR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010XR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010aR\u0016\u00106\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010XR\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0018\u0010P\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010\\R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010m\u001a\u0004\b}\u0010lR\u0013\u0010U\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\\R\u0018\u0010E\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010\\R\u0019\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010{R\u0017\u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010XR\u0017\u0010Q\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010XR\u0017\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010\\R\u0019\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010\\R\u0011\u0010O\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bO\u0010XR\u0018\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010:\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010{R\u001a\u0010B\u001a\u0004\u0018\u00010C8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010?\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010R\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010{R\u0017\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010XR\u0017\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010XR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010\\R-\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u0002040\u001c8FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u0012\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010ZR\u0017\u00107\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010XR\u0019\u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010\\R\u001a\u0010F\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010A\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010XR\u001a\u0010;\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u00108\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010\\R\u0017\u0010=\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010XR\"\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0012\n\u0000\u0012\u0006\b¡\u0001\u0010\u0094\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R/\u0010¤\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u001c8FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\b§\u0001\u0010\u0097\u0001\u0012\u0006\b¥\u0001\u0010\u0094\u0001\u001a\u0005\b¦\u0001\u0010ZR\u0017\u00105\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010XR\u001a\u0010H\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010J\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b«\u0001\u0010{R\u0017\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010\\R\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010{R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010\\R\u0017\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010XR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010\\R\u0018\u0010&\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b±\u0001\u0010²\u0001R\u0019\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010\\R\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010{¨\u0006\u0087\u0002²\u0006\u000b\u0010\u0088\u0002\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u000b\u0010\u0089\u0002\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u000b\u0010\u008a\u0002\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u000b\u0010\u008b\u0002\u001a\u00020\u0010X\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "Landroid/os/Parcelable;", "id", "", RequestHeadersFactory.MODEL, "taskId", "batteryLevel", "", "estimatedRange", "distance", "location", "Lco/bird/android/model/wire/WireLocation;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "stickerId", "serialNumber", "disconnected", "", "collect", "submerged", "lost", "locked", "ackLocked", "captive", "gpsFix", "broken", "label", "Lco/bird/android/model/wire/WireBirdLabel;", "actions", "", "Lco/bird/android/model/constant/BirdAction;", "bountyId", "bountyPrice", "bountyCurrency", "bountyLost", "bountyOverdue", "bountyKind", "Lco/bird/android/model/constant/BountyKind;", "brandName", "taskKind", "Lco/bird/android/model/constant/BirdTaskKind;", "gpsAt", "Lorg/joda/time/DateTime;", "trackedAt", "token", "bluetooth", "cellular", "startedAt", "dueAt", "asleep", "imei", "boardProtocol", "physicalLock", "Lco/bird/android/model/wire/WirePhysicalLock;", "priorityCollect", "down", "needsInspection", "partnerId", "nestId", "lastRideEndedAt", "partnerBirdState", "Lco/bird/android/model/constant/PartnerBirdState;", "peril", "deliverable", "lifecycle", "Lco/bird/android/model/wire/WireLifecycle;", "offline", "license", "Lco/bird/android/model/wire/WireBirdLicenseView;", "areaKey", "fleetId", "nestPurpose", "Lco/bird/android/model/constant/NestPurpose;", "privateBird", "Lco/bird/android/model/wire/WirePrivateBird;", "scannedAt", "badgeType", "Lco/bird/android/model/constant/MapPinBadge;", "bountyReasons", "Lco/bird/android/model/wire/WireBountyReason;", "isScanlessRideEligible", "ephemeralId", "hasHelmet", "locationUpdatedAt", "bleMacAddress", "cellId", "externalFeedType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAckLocked", "()Z", "getActions", "()Ljava/util/List;", "getAreaKey", "()Ljava/lang/String;", "getAsleep", "getBadgeType", "()Lco/bird/android/model/constant/MapPinBadge;", "getBatteryLevel", "()I", "getBleMacAddress", "getBluetooth", "getBoardProtocol", "getBountyCurrency", "getBountyId", "getBountyKind", "()Lco/bird/android/model/constant/BountyKind;", "getBountyLost", "getBountyOverdue", "getBountyPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBountyReasons", "getBrandName", "getBroken", "getCaptive", "getCellId", "getCellular", "getCode", "getCollect", "getDeliverable", "getDisconnected", "getDistance", "getDown", "getDueAt", "()Lorg/joda/time/DateTime;", "getEphemeralId", "getEstimatedRange", "getExternalFeedType", "getFleetId", "getGpsAt", "getGpsFix", "getHasHelmet", "getId", "getImei", "getLabel", "()Lco/bird/android/model/wire/WireBirdLabel;", "getLastRideEndedAt", "getLicense", "()Lco/bird/android/model/wire/WireBirdLicenseView;", "getLifecycle", "()Lco/bird/android/model/wire/WireLifecycle;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getLocationUpdatedAt", "getLocked", "getLost", "getModel", "modelSpecificPhysicalLocks", "getModelSpecificPhysicalLocks$annotations", "()V", "getModelSpecificPhysicalLocks", "modelSpecificPhysicalLocks$delegate", "Lkotlin/Lazy;", "getNeedsInspection", "getNestId", "getNestPurpose", "()Lco/bird/android/model/constant/NestPurpose;", "getOffline", "getPartnerBirdState", "()Lco/bird/android/model/constant/PartnerBirdState;", "getPartnerId", "getPeril", "getPhysicalLock$annotations", "getPhysicalLock", "()Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLocks", "getPhysicalLocks$annotations", "getPhysicalLocks", "physicalLocks$delegate", "getPriorityCollect", "getPrivateBird", "()Lco/bird/android/model/wire/WirePrivateBird;", "getScannedAt", "getSerialNumber", "getStartedAt", "getStickerId", "getSubmerged", "getTaskId", "getTaskKind", "()Lco/bird/android/model/constant/BirdTaskKind;", "getToken", "getTrackedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireBird;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "isProbablySame", "isSame", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "model-wire_release", "idMatches", "codeMatches", "serialMatches", "imeiMatches"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBird implements Parcelable {
    private static final String DEFAULT_DUE_TIME_HOUR;
    public static final String ZIG_ZAG_EXTERNAL_FEED_TYPE = "zigzag";
    @JsonProperty("ack_locked")
    @InterfaceC41208ft5("ack_locked")
    private final boolean ackLocked;
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<BirdAction> actions;
    @JsonProperty("area_key")
    @InterfaceC41208ft5("area_key")
    private final String areaKey;
    @JsonProperty("asleep")
    @InterfaceC41208ft5("asleep")
    private final boolean asleep;
    @JsonProperty("badge_type")
    @InterfaceC41208ft5("badge_type")
    private final MapPinBadge badgeType;
    @JsonProperty("battery_level")
    @InterfaceC41208ft5("battery_level")
    private final int batteryLevel;
    @JsonProperty("ble_mac_address")
    @InterfaceC41208ft5("ble_mac_address")
    private final String bleMacAddress;
    @JsonProperty("bluetooth")
    @InterfaceC41208ft5("bluetooth")
    private final boolean bluetooth;
    @JsonProperty("board_protocol")
    @InterfaceC41208ft5("board_protocol")
    private final String boardProtocol;
    @JsonProperty("bounty_currency")
    @InterfaceC41208ft5("bounty_currency")
    private final String bountyCurrency;
    @JsonProperty("bounty_id")
    @InterfaceC41208ft5("bounty_id")
    private final String bountyId;
    @JsonProperty("bounty_kind")
    @InterfaceC41208ft5("bounty_kind")
    private final BountyKind bountyKind;
    @JsonProperty("bounty_lost")
    @InterfaceC41208ft5("bounty_lost")
    private final boolean bountyLost;
    @JsonProperty("bounty_overdue")
    @InterfaceC41208ft5("bounty_overdue")
    private final boolean bountyOverdue;
    @JsonProperty("bounty_price")
    @InterfaceC41208ft5("bounty_price")
    private final Integer bountyPrice;
    @JsonProperty("bounty_reasons")
    @InterfaceC41208ft5("bounty_reasons")
    private final List<WireBountyReason> bountyReasons;
    @JsonProperty("brand_name")
    @InterfaceC41208ft5("brand_name")
    private final String brandName;
    @JsonProperty("broken")
    @InterfaceC41208ft5("broken")
    private final boolean broken;
    @JsonProperty("captive")
    @InterfaceC41208ft5("captive")
    private final boolean captive;
    @JsonProperty("cell_id")
    @InterfaceC41208ft5("cell_id")
    private final String cellId;
    @JsonProperty("cellular")
    @InterfaceC41208ft5("cellular")
    private final boolean cellular;
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("accident")
    @InterfaceC41208ft5("accident")
    private final boolean collect;
    @JsonProperty("deliverable")
    @InterfaceC41208ft5("deliverable")
    private final boolean deliverable;
    @JsonProperty("disconnected")
    @InterfaceC41208ft5("disconnected")
    private final boolean disconnected;
    @JsonProperty("distance")
    @InterfaceC41208ft5("distance")
    private final int distance;
    @JsonProperty("down")
    @InterfaceC41208ft5("down")
    private final boolean down;
    @JsonProperty("due_at")
    @InterfaceC41208ft5("due_at")
    private final DateTime dueAt;
    @JsonProperty("ephemeral_id")
    @InterfaceC41208ft5("ephemeral_id")
    private final String ephemeralId;
    @JsonProperty("estimated_range")
    @InterfaceC41208ft5("estimated_range")
    private final Integer estimatedRange;
    private final String externalFeedType;
    @JsonProperty("fleet_id")
    @InterfaceC41208ft5("fleet_id")
    private final String fleetId;
    @JsonProperty("gps_at")
    @InterfaceC41208ft5("gps_at")
    private final DateTime gpsAt;
    @JsonProperty("gps_fix")
    @InterfaceC41208ft5("gps_fix")
    private final boolean gpsFix;
    @JsonProperty("has_helmet")
    @InterfaceC41208ft5("has_helmet")
    private final boolean hasHelmet;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66717id;
    @JsonProperty("imei")
    @InterfaceC41208ft5("imei")
    private final String imei;
    private final boolean isScanlessRideEligible;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final WireBirdLabel label;
    @JsonProperty("last_ride_ended_at")
    @InterfaceC41208ft5("last_ride_ended_at")
    private final DateTime lastRideEndedAt;
    @JsonProperty("license")
    @InterfaceC41208ft5("license")
    private final WireBirdLicenseView license;
    @JsonProperty("lifecycle")
    @InterfaceC41208ft5("lifecycle")
    private final WireLifecycle lifecycle;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("location_updated_at")
    @InterfaceC41208ft5("location_updated_at")
    private final DateTime locationUpdatedAt;
    @JsonProperty("locked")
    @InterfaceC41208ft5("locked")
    private final boolean locked;
    @JsonProperty("lost")
    @InterfaceC41208ft5("lost")
    private final boolean lost;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final String model;
    private final transient Lazy modelSpecificPhysicalLocks$delegate;
    @JsonProperty("needs_inspection")
    @InterfaceC41208ft5("needs_inspection")
    private final boolean needsInspection;
    @JsonProperty("nest_id")
    @InterfaceC41208ft5("nest_id")
    private final String nestId;
    @JsonProperty("nest_purpose")
    @InterfaceC41208ft5("nest_purpose")
    private final NestPurpose nestPurpose;
    @JsonProperty("offline")
    @InterfaceC41208ft5("offline")
    private final boolean offline;
    @JsonProperty("partner_bird_state")
    @InterfaceC41208ft5("partner_bird_state")
    private final PartnerBirdState partnerBirdState;
    @JsonProperty("partner_id")
    @InterfaceC41208ft5("partner_id")
    private final String partnerId;
    @JsonProperty("peril")
    @InterfaceC41208ft5("peril")
    private final boolean peril;
    @JsonProperty("physical_lock")
    @InterfaceC41208ft5("physical_lock")
    private final WirePhysicalLock physicalLock;
    private final transient Lazy physicalLocks$delegate;
    @JsonProperty("priority_collect")
    @InterfaceC41208ft5("priority_collect")
    private final boolean priorityCollect;
    @JsonProperty("private_bird")
    @InterfaceC41208ft5("private_bird")
    private final WirePrivateBird privateBird;
    @JsonProperty("scanned_at")
    @InterfaceC41208ft5("scanned_at")
    private final DateTime scannedAt;
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;
    @JsonProperty("started_at")
    @InterfaceC41208ft5("started_at")
    private final DateTime startedAt;
    @JsonProperty("sticker_id")
    @InterfaceC41208ft5("sticker_id")
    private final String stickerId;
    @JsonProperty("submerged")
    @InterfaceC41208ft5("submerged")
    private final boolean submerged;
    @JsonProperty("task_id")
    @InterfaceC41208ft5("task_id")
    private final String taskId;
    @JsonProperty("task_kind")
    @InterfaceC41208ft5("task_kind")
    private final BirdTaskKind taskKind;
    @JsonProperty("token")
    @InterfaceC41208ft5("token")
    private final String token;
    @JsonProperty("tracked_at")
    @InterfaceC41208ft5("tracked_at")
    private final DateTime trackedAt;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<WireBird> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird$Companion;", "", "()V", "DEFAULT_DUE_TIME_HOUR", "", "getDEFAULT_DUE_TIME_HOUR", "()Ljava/lang/String;", "ZIG_ZAG_EXTERNAL_FEED_TYPE", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getDEFAULT_DUE_TIME_HOUR() {
            return WireBird.DEFAULT_DUE_TIME_HOUR;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireBird> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBird createFromParcel(Parcel parcel) {
            String readString;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int readInt2 = parcel.readInt();
            WireLocation createFromParcel = WireLocation.CREATOR.createFromParcel(parcel);
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            boolean z8 = parcel.readInt() != 0;
            boolean z9 = parcel.readInt() != 0;
            WireBirdLabel createFromParcel2 = WireBirdLabel.CREATOR.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (true) {
                readString = parcel.readString();
                if (i == readInt3) {
                    break;
                }
                arrayList.add(BirdAction.valueOf(readString));
                i++;
                readInt3 = readInt3;
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString8 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            BountyKind valueOf3 = BountyKind.valueOf(parcel.readString());
            String readString9 = parcel.readString();
            BirdTaskKind valueOf4 = BirdTaskKind.valueOf(parcel.readString());
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            String readString10 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            DateTime dateTime4 = (DateTime) parcel.readSerializable();
            boolean z14 = parcel.readInt() != 0;
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            WirePhysicalLock createFromParcel3 = parcel.readInt() == 0 ? null : WirePhysicalLock.CREATOR.createFromParcel(parcel);
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            DateTime dateTime5 = (DateTime) parcel.readSerializable();
            PartnerBirdState valueOf5 = parcel.readInt() == 0 ? null : PartnerBirdState.valueOf(parcel.readString());
            boolean z18 = parcel.readInt() != 0;
            boolean z19 = parcel.readInt() != 0;
            WireLifecycle createFromParcel4 = WireLifecycle.CREATOR.createFromParcel(parcel);
            boolean z20 = parcel.readInt() != 0;
            WireBirdLicenseView createFromParcel5 = parcel.readInt() == 0 ? null : WireBirdLicenseView.CREATOR.createFromParcel(parcel);
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            NestPurpose valueOf6 = parcel.readInt() == 0 ? null : NestPurpose.valueOf(parcel.readString());
            WirePrivateBird createFromParcel6 = parcel.readInt() == 0 ? null : WirePrivateBird.CREATOR.createFromParcel(parcel);
            DateTime dateTime6 = (DateTime) parcel.readSerializable();
            MapPinBadge valueOf7 = MapPinBadge.valueOf(parcel.readString());
            int readInt4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt4);
            int i2 = 0;
            while (i2 != readInt4) {
                arrayList2.add(WireBountyReason.CREATOR.createFromParcel(parcel));
                i2++;
                readInt4 = readInt4;
            }
            return new WireBird(readString2, readString3, readString4, readInt, valueOf, readInt2, createFromParcel, readString5, readString6, readString7, z, z2, z3, z4, z5, z6, z7, z8, z9, createFromParcel2, arrayList, readString, valueOf2, readString8, z10, z11, valueOf3, readString9, valueOf4, dateTime, dateTime2, readString10, z12, z13, dateTime3, dateTime4, z14, readString11, readString12, createFromParcel3, z15, z16, z17, readString13, readString14, dateTime5, valueOf5, z18, z19, createFromParcel4, z20, createFromParcel5, readString15, readString16, valueOf6, createFromParcel6, dateTime6, valueOf7, arrayList2, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBird[] newArray(int i) {
            return new WireBird[i];
        }
    }

    static {
        String print = DateTimeFormat.forStyle("-S").print(new LocalTime(7, 0));
        Intrinsics.checkNotNullExpressionValue(print, "forStyle(\"-S\").print(LocalTime(7, 0))");
        DEFAULT_DUE_TIME_HOUR = print;
    }

    public WireBird() {
        this(null, null, null, 0, null, 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -1, -1, 3, null);
    }

    public static /* synthetic */ void getModelSpecificPhysicalLocks$annotations() {
    }

    @Deprecated(message = "use physicalLocks")
    public static /* synthetic */ void getPhysicalLock$annotations() {
    }

    public static /* synthetic */ void getPhysicalLocks$annotations() {
    }

    private static final boolean isProbablySame$lambda$0(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    private static final boolean isProbablySame$lambda$1(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    private static final boolean isProbablySame$lambda$2(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    private static final boolean isProbablySame$lambda$3(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    public final String component1() {
        return this.f66717id;
    }

    public final String component10() {
        return this.serialNumber;
    }

    public final boolean component11() {
        return this.disconnected;
    }

    public final boolean component12() {
        return this.collect;
    }

    public final boolean component13() {
        return this.submerged;
    }

    public final boolean component14() {
        return this.lost;
    }

    public final boolean component15() {
        return this.locked;
    }

    public final boolean component16() {
        return this.ackLocked;
    }

    public final boolean component17() {
        return this.captive;
    }

    public final boolean component18() {
        return this.gpsFix;
    }

    public final boolean component19() {
        return this.broken;
    }

    public final String component2() {
        return this.model;
    }

    public final WireBirdLabel component20() {
        return this.label;
    }

    public final List<BirdAction> component21() {
        return this.actions;
    }

    public final String component22() {
        return this.bountyId;
    }

    public final Integer component23() {
        return this.bountyPrice;
    }

    public final String component24() {
        return this.bountyCurrency;
    }

    public final boolean component25() {
        return this.bountyLost;
    }

    public final boolean component26() {
        return this.bountyOverdue;
    }

    public final BountyKind component27() {
        return this.bountyKind;
    }

    public final String component28() {
        return this.brandName;
    }

    public final BirdTaskKind component29() {
        return this.taskKind;
    }

    public final String component3() {
        return this.taskId;
    }

    public final DateTime component30() {
        return this.gpsAt;
    }

    public final DateTime component31() {
        return this.trackedAt;
    }

    public final String component32() {
        return this.token;
    }

    public final boolean component33() {
        return this.bluetooth;
    }

    public final boolean component34() {
        return this.cellular;
    }

    public final DateTime component35() {
        return this.startedAt;
    }

    public final DateTime component36() {
        return this.dueAt;
    }

    public final boolean component37() {
        return this.asleep;
    }

    public final String component38() {
        return this.imei;
    }

    public final String component39() {
        return this.boardProtocol;
    }

    public final int component4() {
        return this.batteryLevel;
    }

    public final WirePhysicalLock component40() {
        return this.physicalLock;
    }

    public final boolean component41() {
        return this.priorityCollect;
    }

    public final boolean component42() {
        return this.down;
    }

    public final boolean component43() {
        return this.needsInspection;
    }

    public final String component44() {
        return this.partnerId;
    }

    public final String component45() {
        return this.nestId;
    }

    public final DateTime component46() {
        return this.lastRideEndedAt;
    }

    public final PartnerBirdState component47() {
        return this.partnerBirdState;
    }

    public final boolean component48() {
        return this.peril;
    }

    public final boolean component49() {
        return this.deliverable;
    }

    public final Integer component5() {
        return this.estimatedRange;
    }

    public final WireLifecycle component50() {
        return this.lifecycle;
    }

    public final boolean component51() {
        return this.offline;
    }

    public final WireBirdLicenseView component52() {
        return this.license;
    }

    public final String component53() {
        return this.areaKey;
    }

    public final String component54() {
        return this.fleetId;
    }

    public final NestPurpose component55() {
        return this.nestPurpose;
    }

    public final WirePrivateBird component56() {
        return this.privateBird;
    }

    public final DateTime component57() {
        return this.scannedAt;
    }

    public final MapPinBadge component58() {
        return this.badgeType;
    }

    public final List<WireBountyReason> component59() {
        return this.bountyReasons;
    }

    public final int component6() {
        return this.distance;
    }

    public final boolean component60() {
        return this.isScanlessRideEligible;
    }

    public final String component61() {
        return this.ephemeralId;
    }

    public final boolean component62() {
        return this.hasHelmet;
    }

    public final DateTime component63() {
        return this.locationUpdatedAt;
    }

    public final String component64() {
        return this.bleMacAddress;
    }

    public final String component65() {
        return this.cellId;
    }

    public final String component66() {
        return this.externalFeedType;
    }

    public final WireLocation component7() {
        return this.location;
    }

    public final String component8() {
        return this.code;
    }

    public final String component9() {
        return this.stickerId;
    }

    public final WireBird copy(String id, String str, String str2, int i, Integer num, int i2, WireLocation location, String code, String str3, String serialNumber, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, WireBirdLabel label, List<? extends BirdAction> actions, String str4, Integer num2, String bountyCurrency, boolean z10, boolean z11, BountyKind bountyKind, String str5, BirdTaskKind taskKind, DateTime dateTime, DateTime dateTime2, String str6, boolean z12, boolean z13, DateTime dateTime3, DateTime dateTime4, boolean z14, String str7, String str8, WirePhysicalLock wirePhysicalLock, boolean z15, boolean z16, boolean z17, String str9, String str10, DateTime dateTime5, PartnerBirdState partnerBirdState, boolean z18, boolean z19, WireLifecycle lifecycle, boolean z20, WireBirdLicenseView wireBirdLicenseView, String str11, String str12, NestPurpose nestPurpose, WirePrivateBird wirePrivateBird, DateTime dateTime6, MapPinBadge badgeType, List<WireBountyReason> bountyReasons, boolean z21, String str13, boolean z22, DateTime dateTime7, String str14, String str15, String str16) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(bountyCurrency, "bountyCurrency");
        Intrinsics.checkNotNullParameter(bountyKind, "bountyKind");
        Intrinsics.checkNotNullParameter(taskKind, "taskKind");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        Intrinsics.checkNotNullParameter(bountyReasons, "bountyReasons");
        return new WireBird(id, str, str2, i, num, i2, location, code, str3, serialNumber, z, z2, z3, z4, z5, z6, z7, z8, z9, label, actions, str4, num2, bountyCurrency, z10, z11, bountyKind, str5, taskKind, dateTime, dateTime2, str6, z12, z13, dateTime3, dateTime4, z14, str7, str8, wirePhysicalLock, z15, z16, z17, str9, str10, dateTime5, partnerBirdState, z18, z19, lifecycle, z20, wireBirdLicenseView, str11, str12, nestPurpose, wirePrivateBird, dateTime6, badgeType, bountyReasons, z21, str13, z22, dateTime7, str14, str15, str16);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBird) {
            WireBird wireBird = (WireBird) obj;
            return Intrinsics.areEqual(this.f66717id, wireBird.f66717id) && Intrinsics.areEqual(this.model, wireBird.model) && Intrinsics.areEqual(this.taskId, wireBird.taskId) && this.batteryLevel == wireBird.batteryLevel && Intrinsics.areEqual(this.estimatedRange, wireBird.estimatedRange) && this.distance == wireBird.distance && Intrinsics.areEqual(this.location, wireBird.location) && Intrinsics.areEqual(this.code, wireBird.code) && Intrinsics.areEqual(this.stickerId, wireBird.stickerId) && Intrinsics.areEqual(this.serialNumber, wireBird.serialNumber) && this.disconnected == wireBird.disconnected && this.collect == wireBird.collect && this.submerged == wireBird.submerged && this.lost == wireBird.lost && this.locked == wireBird.locked && this.ackLocked == wireBird.ackLocked && this.captive == wireBird.captive && this.gpsFix == wireBird.gpsFix && this.broken == wireBird.broken && Intrinsics.areEqual(this.label, wireBird.label) && Intrinsics.areEqual(this.actions, wireBird.actions) && Intrinsics.areEqual(this.bountyId, wireBird.bountyId) && Intrinsics.areEqual(this.bountyPrice, wireBird.bountyPrice) && Intrinsics.areEqual(this.bountyCurrency, wireBird.bountyCurrency) && this.bountyLost == wireBird.bountyLost && this.bountyOverdue == wireBird.bountyOverdue && this.bountyKind == wireBird.bountyKind && Intrinsics.areEqual(this.brandName, wireBird.brandName) && this.taskKind == wireBird.taskKind && Intrinsics.areEqual(this.gpsAt, wireBird.gpsAt) && Intrinsics.areEqual(this.trackedAt, wireBird.trackedAt) && Intrinsics.areEqual(this.token, wireBird.token) && this.bluetooth == wireBird.bluetooth && this.cellular == wireBird.cellular && Intrinsics.areEqual(this.startedAt, wireBird.startedAt) && Intrinsics.areEqual(this.dueAt, wireBird.dueAt) && this.asleep == wireBird.asleep && Intrinsics.areEqual(this.imei, wireBird.imei) && Intrinsics.areEqual(this.boardProtocol, wireBird.boardProtocol) && Intrinsics.areEqual(this.physicalLock, wireBird.physicalLock) && this.priorityCollect == wireBird.priorityCollect && this.down == wireBird.down && this.needsInspection == wireBird.needsInspection && Intrinsics.areEqual(this.partnerId, wireBird.partnerId) && Intrinsics.areEqual(this.nestId, wireBird.nestId) && Intrinsics.areEqual(this.lastRideEndedAt, wireBird.lastRideEndedAt) && this.partnerBirdState == wireBird.partnerBirdState && this.peril == wireBird.peril && this.deliverable == wireBird.deliverable && Intrinsics.areEqual(this.lifecycle, wireBird.lifecycle) && this.offline == wireBird.offline && Intrinsics.areEqual(this.license, wireBird.license) && Intrinsics.areEqual(this.areaKey, wireBird.areaKey) && Intrinsics.areEqual(this.fleetId, wireBird.fleetId) && this.nestPurpose == wireBird.nestPurpose && Intrinsics.areEqual(this.privateBird, wireBird.privateBird) && Intrinsics.areEqual(this.scannedAt, wireBird.scannedAt) && this.badgeType == wireBird.badgeType && Intrinsics.areEqual(this.bountyReasons, wireBird.bountyReasons) && this.isScanlessRideEligible == wireBird.isScanlessRideEligible && Intrinsics.areEqual(this.ephemeralId, wireBird.ephemeralId) && this.hasHelmet == wireBird.hasHelmet && Intrinsics.areEqual(this.locationUpdatedAt, wireBird.locationUpdatedAt) && Intrinsics.areEqual(this.bleMacAddress, wireBird.bleMacAddress) && Intrinsics.areEqual(this.cellId, wireBird.cellId) && Intrinsics.areEqual(this.externalFeedType, wireBird.externalFeedType);
        }
        return false;
    }

    public final boolean getAckLocked() {
        return this.ackLocked;
    }

    public final List<BirdAction> getActions() {
        return this.actions;
    }

    public final String getAreaKey() {
        return this.areaKey;
    }

    public final boolean getAsleep() {
        return this.asleep;
    }

    public final MapPinBadge getBadgeType() {
        return this.badgeType;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getBleMacAddress() {
        return this.bleMacAddress;
    }

    public final boolean getBluetooth() {
        return this.bluetooth;
    }

    public final String getBoardProtocol() {
        return this.boardProtocol;
    }

    public final String getBountyCurrency() {
        return this.bountyCurrency;
    }

    public final String getBountyId() {
        return this.bountyId;
    }

    public final BountyKind getBountyKind() {
        return this.bountyKind;
    }

    public final boolean getBountyLost() {
        return this.bountyLost;
    }

    public final boolean getBountyOverdue() {
        return this.bountyOverdue;
    }

    public final Integer getBountyPrice() {
        return this.bountyPrice;
    }

    public final List<WireBountyReason> getBountyReasons() {
        return this.bountyReasons;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final boolean getBroken() {
        return this.broken;
    }

    public final boolean getCaptive() {
        return this.captive;
    }

    public final String getCellId() {
        return this.cellId;
    }

    public final boolean getCellular() {
        return this.cellular;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getCollect() {
        return this.collect;
    }

    public final boolean getDeliverable() {
        return this.deliverable;
    }

    public final boolean getDisconnected() {
        return this.disconnected;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final DateTime getDueAt() {
        return this.dueAt;
    }

    public final String getEphemeralId() {
        return this.ephemeralId;
    }

    public final Integer getEstimatedRange() {
        return this.estimatedRange;
    }

    public final String getExternalFeedType() {
        return this.externalFeedType;
    }

    public final String getFleetId() {
        return this.fleetId;
    }

    public final DateTime getGpsAt() {
        return this.gpsAt;
    }

    public final boolean getGpsFix() {
        return this.gpsFix;
    }

    public final boolean getHasHelmet() {
        return this.hasHelmet;
    }

    public final String getId() {
        return this.f66717id;
    }

    public final String getImei() {
        return this.imei;
    }

    public final WireBirdLabel getLabel() {
        return this.label;
    }

    public final DateTime getLastRideEndedAt() {
        return this.lastRideEndedAt;
    }

    public final WireBirdLicenseView getLicense() {
        return this.license;
    }

    public final WireLifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final DateTime getLocationUpdatedAt() {
        return this.locationUpdatedAt;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final boolean getLost() {
        return this.lost;
    }

    public final String getModel() {
        return this.model;
    }

    public final List<WirePhysicalLock> getModelSpecificPhysicalLocks() {
        return (List) this.modelSpecificPhysicalLocks$delegate.getValue();
    }

    public final boolean getNeedsInspection() {
        return this.needsInspection;
    }

    public final String getNestId() {
        return this.nestId;
    }

    public final NestPurpose getNestPurpose() {
        return this.nestPurpose;
    }

    public final boolean getOffline() {
        return this.offline;
    }

    public final PartnerBirdState getPartnerBirdState() {
        return this.partnerBirdState;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final boolean getPeril() {
        return this.peril;
    }

    public final WirePhysicalLock getPhysicalLock() {
        return this.physicalLock;
    }

    public final List<WirePhysicalLock> getPhysicalLocks() {
        return (List) this.physicalLocks$delegate.getValue();
    }

    public final boolean getPriorityCollect() {
        return this.priorityCollect;
    }

    public final WirePrivateBird getPrivateBird() {
        return this.privateBird;
    }

    public final DateTime getScannedAt() {
        return this.scannedAt;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final boolean getSubmerged() {
        return this.submerged;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final BirdTaskKind getTaskKind() {
        return this.taskKind;
    }

    public final String getToken() {
        return this.token;
    }

    public final DateTime getTrackedAt() {
        return this.trackedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66717id.hashCode() * 31;
        String str = this.model;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taskId;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.batteryLevel)) * 31;
        Integer num = this.estimatedRange;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.distance)) * 31) + this.location.hashCode()) * 31) + this.code.hashCode()) * 31;
        String str3 = this.stickerId;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.serialNumber.hashCode()) * 31;
        boolean z = this.disconnected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z2 = this.collect;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.submerged;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.lost;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.locked;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.ackLocked;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.captive;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z8 = this.gpsFix;
        int i15 = z8;
        if (z8 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z9 = this.broken;
        int i17 = z9;
        if (z9 != 0) {
            i17 = 1;
        }
        int hashCode6 = (((((i16 + i17) * 31) + this.label.hashCode()) * 31) + this.actions.hashCode()) * 31;
        String str4 = this.bountyId;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.bountyPrice;
        int hashCode8 = (((hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.bountyCurrency.hashCode()) * 31;
        boolean z10 = this.bountyLost;
        int i18 = z10;
        if (z10 != 0) {
            i18 = 1;
        }
        int i19 = (hashCode8 + i18) * 31;
        boolean z11 = this.bountyOverdue;
        int i20 = z11;
        if (z11 != 0) {
            i20 = 1;
        }
        int hashCode9 = (((i19 + i20) * 31) + this.bountyKind.hashCode()) * 31;
        String str5 = this.brandName;
        int hashCode10 = (((hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.taskKind.hashCode()) * 31;
        DateTime dateTime = this.gpsAt;
        int hashCode11 = (hashCode10 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.trackedAt;
        int hashCode12 = (hashCode11 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str6 = this.token;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z12 = this.bluetooth;
        int i21 = z12;
        if (z12 != 0) {
            i21 = 1;
        }
        int i22 = (hashCode13 + i21) * 31;
        boolean z13 = this.cellular;
        int i23 = z13;
        if (z13 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        DateTime dateTime3 = this.startedAt;
        int hashCode14 = (i24 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.dueAt;
        int hashCode15 = (hashCode14 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        boolean z14 = this.asleep;
        int i25 = z14;
        if (z14 != 0) {
            i25 = 1;
        }
        int i26 = (hashCode15 + i25) * 31;
        String str7 = this.imei;
        int hashCode16 = (i26 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.boardProtocol;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        WirePhysicalLock wirePhysicalLock = this.physicalLock;
        int hashCode18 = (hashCode17 + (wirePhysicalLock == null ? 0 : wirePhysicalLock.hashCode())) * 31;
        boolean z15 = this.priorityCollect;
        int i27 = z15;
        if (z15 != 0) {
            i27 = 1;
        }
        int i28 = (hashCode18 + i27) * 31;
        boolean z16 = this.down;
        int i29 = z16;
        if (z16 != 0) {
            i29 = 1;
        }
        int i30 = (i28 + i29) * 31;
        boolean z17 = this.needsInspection;
        int i31 = z17;
        if (z17 != 0) {
            i31 = 1;
        }
        int i32 = (i30 + i31) * 31;
        String str9 = this.partnerId;
        int hashCode19 = (i32 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.nestId;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        DateTime dateTime5 = this.lastRideEndedAt;
        int hashCode21 = (hashCode20 + (dateTime5 == null ? 0 : dateTime5.hashCode())) * 31;
        PartnerBirdState partnerBirdState = this.partnerBirdState;
        int hashCode22 = (hashCode21 + (partnerBirdState == null ? 0 : partnerBirdState.hashCode())) * 31;
        boolean z18 = this.peril;
        int i33 = z18;
        if (z18 != 0) {
            i33 = 1;
        }
        int i34 = (hashCode22 + i33) * 31;
        boolean z19 = this.deliverable;
        int i35 = z19;
        if (z19 != 0) {
            i35 = 1;
        }
        int hashCode23 = (((i34 + i35) * 31) + this.lifecycle.hashCode()) * 31;
        boolean z20 = this.offline;
        int i36 = z20;
        if (z20 != 0) {
            i36 = 1;
        }
        int i37 = (hashCode23 + i36) * 31;
        WireBirdLicenseView wireBirdLicenseView = this.license;
        int hashCode24 = (i37 + (wireBirdLicenseView == null ? 0 : wireBirdLicenseView.hashCode())) * 31;
        String str11 = this.areaKey;
        int hashCode25 = (hashCode24 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fleetId;
        int hashCode26 = (hashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
        NestPurpose nestPurpose = this.nestPurpose;
        int hashCode27 = (hashCode26 + (nestPurpose == null ? 0 : nestPurpose.hashCode())) * 31;
        WirePrivateBird wirePrivateBird = this.privateBird;
        int hashCode28 = (hashCode27 + (wirePrivateBird == null ? 0 : wirePrivateBird.hashCode())) * 31;
        DateTime dateTime6 = this.scannedAt;
        int hashCode29 = (((((hashCode28 + (dateTime6 == null ? 0 : dateTime6.hashCode())) * 31) + this.badgeType.hashCode()) * 31) + this.bountyReasons.hashCode()) * 31;
        boolean z21 = this.isScanlessRideEligible;
        int i38 = z21;
        if (z21 != 0) {
            i38 = 1;
        }
        int i39 = (hashCode29 + i38) * 31;
        String str13 = this.ephemeralId;
        int hashCode30 = (i39 + (str13 == null ? 0 : str13.hashCode())) * 31;
        boolean z22 = this.hasHelmet;
        int i40 = (hashCode30 + (z22 ? 1 : z22 ? 1 : 0)) * 31;
        DateTime dateTime7 = this.locationUpdatedAt;
        int hashCode31 = (i40 + (dateTime7 == null ? 0 : dateTime7.hashCode())) * 31;
        String str14 = this.bleMacAddress;
        int hashCode32 = (hashCode31 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cellId;
        int hashCode33 = (hashCode32 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.externalFeedType;
        return hashCode33 + (str16 != null ? str16.hashCode() : 0);
    }

    public final boolean isProbablySame(WireBird other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Lazy lazy = LazyKt.lazy(new WireBird$isProbablySame$idMatches$2(this, other));
        Lazy lazy2 = LazyKt.lazy(new WireBird$isProbablySame$codeMatches$2(this, other));
        Lazy lazy3 = LazyKt.lazy(new WireBird$isProbablySame$serialMatches$2(this, other));
        Lazy lazy4 = LazyKt.lazy(new WireBird$isProbablySame$imeiMatches$2(this, other));
        if (!isProbablySame$lambda$0(lazy) && !isProbablySame$lambda$1(lazy2) && !isProbablySame$lambda$2(lazy3)) {
            return isProbablySame$lambda$3(lazy4);
        }
        return true;
    }

    public final boolean isSame(WireBird other) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z6 = true;
        if (this.f66717id.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (other.f66717id.length() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (Intrinsics.areEqual(this.f66717id, other.f66717id) || Intrinsics.areEqual(this.f66717id, other.ephemeralId) || Intrinsics.areEqual(this.ephemeralId, other.f66717id)) {
                    return true;
                }
                return false;
            }
        }
        if (this.code.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (other.code.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return Intrinsics.areEqual(this.code, other.code);
            }
        }
        if (this.serialNumber.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (other.serialNumber.length() <= 0) {
                z6 = false;
            }
            if (z6) {
                return Intrinsics.areEqual(this.serialNumber, other.serialNumber);
            }
        }
        return false;
    }

    public final boolean isScanlessRideEligible() {
        return this.isScanlessRideEligible;
    }

    public String toString() {
        String str = this.f66717id;
        String str2 = this.code;
        String str3 = this.model;
        int i = this.batteryLevel;
        Integer num = this.estimatedRange;
        int i2 = this.distance;
        WireLocation wireLocation = this.location;
        String str4 = this.stickerId;
        String str5 = this.serialNumber;
        DateTime dateTime = this.gpsAt;
        DateTime dateTime2 = this.trackedAt;
        boolean z = this.bluetooth;
        boolean z2 = this.cellular;
        boolean z3 = this.locked;
        boolean z4 = this.ackLocked;
        WirePhysicalLock wirePhysicalLock = this.physicalLock;
        List<WirePhysicalLock> physicalLocks = getPhysicalLocks();
        boolean z5 = this.down;
        String str6 = this.partnerId;
        String str7 = this.nestId;
        DateTime dateTime3 = this.lastRideEndedAt;
        WireLifecycle wireLifecycle = this.lifecycle;
        String str8 = this.areaKey;
        WirePrivateBird wirePrivateBird = this.privateBird;
        DateTime dateTime4 = this.scannedAt;
        MapPinBadge mapPinBadge = this.badgeType;
        String str9 = this.ephemeralId;
        boolean z6 = this.hasHelmet;
        DateTime dateTime5 = this.locationUpdatedAt;
        String str10 = this.bleMacAddress;
        String str11 = this.externalFeedType;
        return "WireBird(id=" + str + ", code=" + str2 + ", model=" + str3 + ", batteryLevel=" + i + ", estimatedRange=" + num + ", distance=" + i2 + ", location=" + wireLocation + ", stickerId=" + str4 + ", serialNumber=" + str5 + ", gpsAt=" + dateTime + ", trackedAt=" + dateTime2 + ", bluetooth=" + z + ", cellular=" + z2 + ", locked=" + z3 + ", ackLocked=" + z4 + ", physicalLock=" + wirePhysicalLock + ", physicalLocks=" + physicalLocks + ", down=" + z5 + ", partnerId=" + str6 + ", nestId=" + str7 + ", lastRideEndedAt=" + dateTime3 + ", lifecycle=" + wireLifecycle + ", areaKey=" + str8 + ", privateBird=" + wirePrivateBird + ", scannedAt=" + dateTime4 + ", badgeType=" + mapPinBadge + ", ephemeralId=" + str9 + ", hasHelmet=" + z6 + ", locationUpdatedAt=" + dateTime5 + ", bleMacAddress=" + str10 + ", externalFeedType=" + str11 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66717id);
        out.writeString(this.model);
        out.writeString(this.taskId);
        out.writeInt(this.batteryLevel);
        Integer num = this.estimatedRange;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeInt(this.distance);
        this.location.writeToParcel(out, i);
        out.writeString(this.code);
        out.writeString(this.stickerId);
        out.writeString(this.serialNumber);
        out.writeInt(this.disconnected ? 1 : 0);
        out.writeInt(this.collect ? 1 : 0);
        out.writeInt(this.submerged ? 1 : 0);
        out.writeInt(this.lost ? 1 : 0);
        out.writeInt(this.locked ? 1 : 0);
        out.writeInt(this.ackLocked ? 1 : 0);
        out.writeInt(this.captive ? 1 : 0);
        out.writeInt(this.gpsFix ? 1 : 0);
        out.writeInt(this.broken ? 1 : 0);
        this.label.writeToParcel(out, i);
        List<BirdAction> list = this.actions;
        out.writeInt(list.size());
        for (BirdAction birdAction : list) {
            out.writeString(birdAction.name());
        }
        out.writeString(this.bountyId);
        Integer num2 = this.bountyPrice;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.bountyCurrency);
        out.writeInt(this.bountyLost ? 1 : 0);
        out.writeInt(this.bountyOverdue ? 1 : 0);
        out.writeString(this.bountyKind.name());
        out.writeString(this.brandName);
        out.writeString(this.taskKind.name());
        out.writeSerializable(this.gpsAt);
        out.writeSerializable(this.trackedAt);
        out.writeString(this.token);
        out.writeInt(this.bluetooth ? 1 : 0);
        out.writeInt(this.cellular ? 1 : 0);
        out.writeSerializable(this.startedAt);
        out.writeSerializable(this.dueAt);
        out.writeInt(this.asleep ? 1 : 0);
        out.writeString(this.imei);
        out.writeString(this.boardProtocol);
        WirePhysicalLock wirePhysicalLock = this.physicalLock;
        if (wirePhysicalLock == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wirePhysicalLock.writeToParcel(out, i);
        }
        out.writeInt(this.priorityCollect ? 1 : 0);
        out.writeInt(this.down ? 1 : 0);
        out.writeInt(this.needsInspection ? 1 : 0);
        out.writeString(this.partnerId);
        out.writeString(this.nestId);
        out.writeSerializable(this.lastRideEndedAt);
        PartnerBirdState partnerBirdState = this.partnerBirdState;
        if (partnerBirdState == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(partnerBirdState.name());
        }
        out.writeInt(this.peril ? 1 : 0);
        out.writeInt(this.deliverable ? 1 : 0);
        this.lifecycle.writeToParcel(out, i);
        out.writeInt(this.offline ? 1 : 0);
        WireBirdLicenseView wireBirdLicenseView = this.license;
        if (wireBirdLicenseView == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireBirdLicenseView.writeToParcel(out, i);
        }
        out.writeString(this.areaKey);
        out.writeString(this.fleetId);
        NestPurpose nestPurpose = this.nestPurpose;
        if (nestPurpose == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(nestPurpose.name());
        }
        WirePrivateBird wirePrivateBird = this.privateBird;
        if (wirePrivateBird == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wirePrivateBird.writeToParcel(out, i);
        }
        out.writeSerializable(this.scannedAt);
        out.writeString(this.badgeType.name());
        List<WireBountyReason> list2 = this.bountyReasons;
        out.writeInt(list2.size());
        for (WireBountyReason wireBountyReason : list2) {
            wireBountyReason.writeToParcel(out, i);
        }
        out.writeInt(this.isScanlessRideEligible ? 1 : 0);
        out.writeString(this.ephemeralId);
        out.writeInt(this.hasHelmet ? 1 : 0);
        out.writeSerializable(this.locationUpdatedAt);
        out.writeString(this.bleMacAddress);
        out.writeString(this.cellId);
        out.writeString(this.externalFeedType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireBird(String id, String str, String str2, int i, Integer num, int i2, WireLocation location, String code, String str3, String serialNumber, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, WireBirdLabel label, List<? extends BirdAction> actions, String str4, Integer num2, String bountyCurrency, boolean z10, boolean z11, BountyKind bountyKind, String str5, BirdTaskKind taskKind, DateTime dateTime, DateTime dateTime2, String str6, boolean z12, boolean z13, DateTime dateTime3, DateTime dateTime4, boolean z14, String str7, String str8, WirePhysicalLock wirePhysicalLock, boolean z15, boolean z16, boolean z17, String str9, String str10, DateTime dateTime5, PartnerBirdState partnerBirdState, boolean z18, boolean z19, WireLifecycle lifecycle, boolean z20, WireBirdLicenseView wireBirdLicenseView, String str11, String str12, NestPurpose nestPurpose, WirePrivateBird wirePrivateBird, DateTime dateTime6, MapPinBadge badgeType, List<WireBountyReason> bountyReasons, boolean z21, String str13, boolean z22, DateTime dateTime7, String str14, String str15, String str16) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(bountyCurrency, "bountyCurrency");
        Intrinsics.checkNotNullParameter(bountyKind, "bountyKind");
        Intrinsics.checkNotNullParameter(taskKind, "taskKind");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        Intrinsics.checkNotNullParameter(bountyReasons, "bountyReasons");
        this.f66717id = id;
        this.model = str;
        this.taskId = str2;
        this.batteryLevel = i;
        this.estimatedRange = num;
        this.distance = i2;
        this.location = location;
        this.code = code;
        this.stickerId = str3;
        this.serialNumber = serialNumber;
        this.disconnected = z;
        this.collect = z2;
        this.submerged = z3;
        this.lost = z4;
        this.locked = z5;
        this.ackLocked = z6;
        this.captive = z7;
        this.gpsFix = z8;
        this.broken = z9;
        this.label = label;
        this.actions = actions;
        this.bountyId = str4;
        this.bountyPrice = num2;
        this.bountyCurrency = bountyCurrency;
        this.bountyLost = z10;
        this.bountyOverdue = z11;
        this.bountyKind = bountyKind;
        this.brandName = str5;
        this.taskKind = taskKind;
        this.gpsAt = dateTime;
        this.trackedAt = dateTime2;
        this.token = str6;
        this.bluetooth = z12;
        this.cellular = z13;
        this.startedAt = dateTime3;
        this.dueAt = dateTime4;
        this.asleep = z14;
        this.imei = str7;
        this.boardProtocol = str8;
        this.physicalLock = wirePhysicalLock;
        this.priorityCollect = z15;
        this.down = z16;
        this.needsInspection = z17;
        this.partnerId = str9;
        this.nestId = str10;
        this.lastRideEndedAt = dateTime5;
        this.partnerBirdState = partnerBirdState;
        this.peril = z18;
        this.deliverable = z19;
        this.lifecycle = lifecycle;
        this.offline = z20;
        this.license = wireBirdLicenseView;
        this.areaKey = str11;
        this.fleetId = str12;
        this.nestPurpose = nestPurpose;
        this.privateBird = wirePrivateBird;
        this.scannedAt = dateTime6;
        this.badgeType = badgeType;
        this.bountyReasons = bountyReasons;
        this.isScanlessRideEligible = z21;
        this.ephemeralId = str13;
        this.hasHelmet = z22;
        this.locationUpdatedAt = dateTime7;
        this.bleMacAddress = str14;
        this.cellId = str15;
        this.externalFeedType = str16;
        this.physicalLocks$delegate = LazyKt.lazy(new WireBird$physicalLocks$2(this));
        this.modelSpecificPhysicalLocks$delegate = LazyKt.lazy(new WireBird$modelSpecificPhysicalLocks$2(this));
    }

    public /* synthetic */ WireBird(String str, String str2, String str3, int i, Integer num, int i2, WireLocation wireLocation, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, WireBirdLabel wireBirdLabel, List list, String str7, Integer num2, String str8, boolean z10, boolean z11, BountyKind bountyKind, String str9, BirdTaskKind birdTaskKind, DateTime dateTime, DateTime dateTime2, String str10, boolean z12, boolean z13, DateTime dateTime3, DateTime dateTime4, boolean z14, String str11, String str12, WirePhysicalLock wirePhysicalLock, boolean z15, boolean z16, boolean z17, String str13, String str14, DateTime dateTime5, PartnerBirdState partnerBirdState, boolean z18, boolean z19, WireLifecycle wireLifecycle, boolean z20, WireBirdLicenseView wireBirdLicenseView, String str15, String str16, NestPurpose nestPurpose, WirePrivateBird wirePrivateBird, DateTime dateTime6, MapPinBadge mapPinBadge, List list2, boolean z21, String str17, boolean z22, DateTime dateTime7, String str18, String str19, String str20, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 508, null) : wireLocation, (i3 & 128) != 0 ? "" : str4, (i3 & 256) != 0 ? null : str5, (i3 & 512) == 0 ? str6 : "", (i3 & 1024) != 0 ? false : z, (i3 & 2048) != 0 ? false : z2, (i3 & 4096) != 0 ? false : z3, (i3 & 8192) != 0 ? false : z4, (i3 & 16384) != 0 ? true : z5, (i3 & DateUtils.FORMAT_ABBREV_WEEKDAY) == 0 ? z6 : true, (i3 & 65536) != 0 ? false : z7, (i3 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? false : z8, (i3 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? false : z9, (i3 & 524288) != 0 ? new WireBirdLabel(null, 0, null, null, null, 31, null) : wireBirdLabel, (i3 & 1048576) != 0 ? CollectionsKt.emptyList() : list, (i3 & 2097152) != 0 ? null : str7, (i3 & 4194304) != 0 ? null : num2, (i3 & 8388608) != 0 ? Source.USD : str8, (i3 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z10, (i3 & 33554432) != 0 ? false : z11, (i3 & 67108864) != 0 ? BountyKind.UNKNOWN : bountyKind, (i3 & 134217728) != 0 ? null : str9, (i3 & 268435456) != 0 ? BirdTaskKind.UNKNOWN : birdTaskKind, (i3 & 536870912) != 0 ? null : dateTime, (i3 & 1073741824) != 0 ? null : dateTime2, (i3 & Integer.MIN_VALUE) != 0 ? null : str10, (i4 & 1) != 0 ? false : z12, (i4 & 2) != 0 ? false : z13, (i4 & 4) != 0 ? null : dateTime3, (i4 & 8) != 0 ? null : dateTime4, (i4 & 16) != 0 ? false : z14, (i4 & 32) != 0 ? null : str11, (i4 & 64) != 0 ? null : str12, (i4 & 128) != 0 ? null : wirePhysicalLock, (i4 & 256) != 0 ? false : z15, (i4 & 512) != 0 ? false : z16, (i4 & 1024) != 0 ? false : z17, (i4 & 2048) != 0 ? null : str13, (i4 & 4096) != 0 ? null : str14, (i4 & 8192) != 0 ? null : dateTime5, (i4 & 16384) != 0 ? PartnerBirdState.UNKNOWN : partnerBirdState, (i4 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? false : z18, (i4 & 65536) != 0 ? false : z19, (i4 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? new WireLifecycle(null, null, null, null, 15, null) : wireLifecycle, (i4 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? false : z20, (i4 & 524288) != 0 ? null : wireBirdLicenseView, (i4 & 1048576) != 0 ? null : str15, (i4 & 2097152) != 0 ? null : str16, (i4 & 4194304) != 0 ? null : nestPurpose, (i4 & 8388608) != 0 ? null : wirePrivateBird, (i4 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : dateTime6, (i4 & 33554432) != 0 ? MapPinBadge.UNKNOWN : mapPinBadge, (i4 & 67108864) != 0 ? CollectionsKt.emptyList() : list2, (i4 & 134217728) != 0 ? false : z21, (i4 & 268435456) != 0 ? null : str17, (i4 & 536870912) != 0 ? false : z22, (i4 & 1073741824) != 0 ? null : dateTime7, (i4 & Integer.MIN_VALUE) != 0 ? null : str18, (i5 & 1) != 0 ? null : str19, (i5 & 2) != 0 ? null : str20);
    }
}
