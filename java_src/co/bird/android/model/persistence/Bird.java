package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdTaskKind;
import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.constant.MapPinBadge;
import co.bird.android.model.constant.NestPurpose;
import co.bird.android.model.constant.PartnerBirdState;
import co.bird.android.model.persistence.nestedstructures.BirdLabel;
import co.bird.android.model.persistence.nestedstructures.BirdLicenseView;
import co.bird.android.model.persistence.nestedstructures.BountyReason;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.Lifecycle;
import co.bird.android.model.persistence.nestedstructures.PhysicalLock;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b§\u0001\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0010\u0012\u0006\u0010\"\u001a\u00020\u0010\u0012\u0006\u0010#\u001a\u00020$\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010&\u001a\u00020'\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010,\u001a\u00020\u0010\u0012\u0006\u0010-\u001a\u00020\u0010\u0012\b\u0010.\u001a\u0004\u0018\u00010)\u0012\b\u0010/\u001a\u0004\u0018\u00010)\u0012\u0006\u00100\u001a\u00020\u0010\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u000104\u0012\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u001c\u0012\u0006\u00106\u001a\u00020\u0010\u0012\u0006\u00107\u001a\u00020\u0010\u0012\u0006\u00108\u001a\u00020\u0010\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010)\u0012\b\u0010<\u001a\u0004\u0018\u00010=\u0012\u0006\u0010>\u001a\u00020\u0010\u0012\u0006\u0010?\u001a\u00020\u0010\u0012\u0006\u0010@\u001a\u00020A\u0012\u0006\u0010B\u001a\u00020\u0010\u0012\b\u0010C\u001a\u0004\u0018\u00010D\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010F\u001a\u0004\u0018\u00010G\u0012\b\u0010H\u001a\u0004\u0018\u00010I\u0012\b\u0010J\u001a\u0004\u0018\u00010)\u0012\u0006\u0010K\u001a\u00020L\u0012\f\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u001c\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010R\u001a\u0004\u0018\u00010)¢\u0006\u0002\u0010SJ\n\u0010°\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u001aHÆ\u0003J\u0010\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¿\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010iJ\n\u0010À\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020$HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Å\u0001\u001a\u00020'HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u000104HÆ\u0003J\u0012\u0010Ó\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u001cHÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010=HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0010HÆ\u0003J\u0011\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010iJ\n\u0010Ý\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020AHÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010DHÆ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010â\u0001\u001a\u0004\u0018\u00010GHÆ\u0003J\f\u0010ã\u0001\u001a\u0004\u0018\u00010IHÆ\u0003J\f\u0010ä\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\n\u0010å\u0001\u001a\u00020LHÆ\u0003J\u0010\u0010æ\u0001\u001a\b\u0012\u0004\u0012\u00020N0\u001cHÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010é\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010ê\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010}J\f\u0010ë\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÒ\u0005\u0010ï\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010,\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00102\n\b\u0002\u0010.\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010)2\b\b\u0002\u00100\u001a\u00020\u00102\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u001c2\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u00020\u00102\b\b\u0002\u00108\u001a\u00020\u00102\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\b\b\u0002\u0010>\u001a\u00020\u00102\b\b\u0002\u0010?\u001a\u00020\u00102\b\b\u0002\u0010@\u001a\u00020A2\b\b\u0002\u0010B\u001a\u00020\u00102\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010K\u001a\u00020L2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u001c2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010R\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0003\u0010ð\u0001J\u0015\u0010ñ\u0001\u001a\u00020\u00102\t\u0010ò\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010ó\u0001\u001a\u00020\u0007HÖ\u0001J\n\u0010ô\u0001\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0018\u0010E\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0016\u00100\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010UR\u0016\u0010K\u001a\u00020L8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0018\u0010P\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010YR\u0016\u0010,\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010UR\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010YR\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010YR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010YR\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0016\u0010!\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010UR\u0016\u0010\"\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010UR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010j\u001a\u0004\bh\u0010iR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010WR\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010YR\u0016\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010UR\u0016\u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010UR\u0016\u0010-\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010UR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010YR\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010UR\u0016\u0010?\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010UR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010UR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010^R\u0016\u00107\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010UR\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0018\u0010O\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010YR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010j\u001a\u0004\by\u0010iR\u0018\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010wR\u0016\u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010UR\u001a\u0010Q\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010~\u001a\u0004\b|\u0010}R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010YR\u0019\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010YR\"\u0010\u0081\u0001\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0081\u0001\u0010U\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010;\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010wR\u001a\u0010C\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010@\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R&\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0002\u0010~\u001a\u0005\b\u008c\u0001\u0010}\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010R\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010wR\u0017\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010UR\u0017\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010UR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010YR\u0017\u00108\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010UR\u0019\u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010YR\u001a\u0010F\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010B\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010UR\u001a\u0010<\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010YR\u0017\u0010>\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010UR\"\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0012\n\u0000\u0012\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u001f\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010WR\u0017\u00106\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010UR\u001a\u0010H\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0019\u0010J\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010wR\u0017\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010YR\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010wR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b©\u0001\u0010YR\u0017\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010UR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b«\u0001\u0010YR\u0018\u0010&\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010YR\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010w¨\u0006õ\u0001"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "", "id", "", RequestHeadersFactory.MODEL, "taskId", "batteryLevel", "", "estimatedRange", "distance", "location", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "stickerId", "serialNumber", "disconnected", "", "collect", "submerged", "lost", "locked", "ackLocked", "captive", "gpsFix", "broken", "label", "Lco/bird/android/model/persistence/nestedstructures/BirdLabel;", "actions", "", "Lco/bird/android/model/constant/BirdAction;", "bountyId", "bountyPrice", "bountyCurrency", "bountyLost", "bountyOverdue", "bountyKind", "Lco/bird/android/model/constant/BountyKind;", "brandName", "taskKind", "Lco/bird/android/model/constant/BirdTaskKind;", "gpsAt", "Lorg/joda/time/DateTime;", "trackedAt", "token", "bluetooth", "cellular", "startedAt", "dueAt", "asleep", "imei", "boardProtocol", "physicalLock", "Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;", "physicalLocks", "priorityCollect", "down", "needsInspection", "partnerId", "nestId", "lastRideEndedAt", "partnerBirdState", "Lco/bird/android/model/constant/PartnerBirdState;", "peril", "deliverable", "lifecycle", "Lco/bird/android/model/persistence/nestedstructures/Lifecycle;", "offline", "license", "Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;", "areaKey", "nestPurpose", "Lco/bird/android/model/constant/NestPurpose;", "privateBird", "Lco/bird/android/model/persistence/nestedstructures/PrivateBird;", "scannedAt", "badgeType", "Lco/bird/android/model/constant/MapPinBadge;", "bountyReasons", "Lco/bird/android/model/persistence/nestedstructures/BountyReason;", "ephemeralId", "bleMacAddress", "hasHelmet", "locationUpdatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V", "getAckLocked", "()Z", "getActions", "()Ljava/util/List;", "getAreaKey", "()Ljava/lang/String;", "getAsleep", "getBadgeType", "()Lco/bird/android/model/constant/MapPinBadge;", "getBatteryLevel", "()I", "getBleMacAddress", "getBluetooth", "getBoardProtocol", "getBountyCurrency", "getBountyId", "getBountyKind", "()Lco/bird/android/model/constant/BountyKind;", "getBountyLost", "getBountyOverdue", "getBountyPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBountyReasons", "getBrandName", "getBroken", "getCaptive", "getCellular", "getCode", "getCollect", "getDeliverable", "getDisconnected", "getDistance", "getDown", "getDueAt", "()Lorg/joda/time/DateTime;", "getEphemeralId", "getEstimatedRange", "getGpsAt", "getGpsFix", "getHasHelmet", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "getImei", "isScanlessRideEligible", "setScanlessRideEligible", "(Z)V", "getLabel", "()Lco/bird/android/model/persistence/nestedstructures/BirdLabel;", "getLastRideEndedAt", "getLicense", "()Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;", "getLifecycle", "()Lco/bird/android/model/persistence/nestedstructures/Lifecycle;", "lightOn", "getLightOn", "setLightOn", "(Ljava/lang/Boolean;)V", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "getLocationUpdatedAt", "getLocked", "getLost", "getModel", "getNeedsInspection", "getNestId", "getNestPurpose", "()Lco/bird/android/model/constant/NestPurpose;", "getOffline", "getPartnerBirdState", "()Lco/bird/android/model/constant/PartnerBirdState;", "getPartnerId", "getPeril", "getPhysicalLock$annotations", "()V", "getPhysicalLock", "()Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;", "getPhysicalLocks", "getPriorityCollect", "getPrivateBird", "()Lco/bird/android/model/persistence/nestedstructures/PrivateBird;", "getScannedAt", "getSerialNumber", "getStartedAt", "getStickerId", "getSubmerged", "getTaskId", "getTaskKind", "()Lco/bird/android/model/constant/BirdTaskKind;", "getToken", "getTrackedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/Bird;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Bird {
    private final boolean ackLocked;
    private final List<BirdAction> actions;
    private final String areaKey;
    private final boolean asleep;
    private final MapPinBadge badgeType;
    private final int batteryLevel;
    private final String bleMacAddress;
    private final boolean bluetooth;
    private final String boardProtocol;
    private final String bountyCurrency;
    private final String bountyId;
    private final BountyKind bountyKind;
    private final boolean bountyLost;
    private final boolean bountyOverdue;
    private final Integer bountyPrice;
    private final List<BountyReason> bountyReasons;
    private final String brandName;
    private final boolean broken;
    private final boolean captive;
    private final boolean cellular;
    private final String code;
    private final boolean collect;
    private final boolean deliverable;
    private final boolean disconnected;
    private final int distance;
    private final boolean down;
    private final DateTime dueAt;
    private final String ephemeralId;
    private final Integer estimatedRange;
    private final DateTime gpsAt;
    private final boolean gpsFix;
    private final Boolean hasHelmet;

    /* renamed from: id */
    private final String f66670id;
    private final String imei;
    private boolean isScanlessRideEligible;
    private final BirdLabel label;
    private final DateTime lastRideEndedAt;
    private final BirdLicenseView license;
    private final Lifecycle lifecycle;
    private Boolean lightOn;
    private final Geolocation location;
    private final DateTime locationUpdatedAt;
    private final boolean locked;
    private final boolean lost;
    private final String model;
    private final boolean needsInspection;
    private final String nestId;
    private final NestPurpose nestPurpose;
    private final boolean offline;
    private final PartnerBirdState partnerBirdState;
    private final String partnerId;
    private final boolean peril;
    private final PhysicalLock physicalLock;
    private final List<PhysicalLock> physicalLocks;
    private final boolean priorityCollect;
    private final PrivateBird privateBird;
    private final DateTime scannedAt;
    private final String serialNumber;
    private final DateTime startedAt;
    private final String stickerId;
    private final boolean submerged;
    private final String taskId;
    private final BirdTaskKind taskKind;
    private final String token;
    private final DateTime trackedAt;

    /* JADX WARN: Multi-variable type inference failed */
    public Bird(String id, String str, String str2, int i, Integer num, int i2, Geolocation location, String code, String str3, String serialNumber, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, BirdLabel label, List<? extends BirdAction> actions, String str4, Integer num2, String bountyCurrency, boolean z10, boolean z11, BountyKind bountyKind, String str5, BirdTaskKind taskKind, DateTime dateTime, DateTime dateTime2, String str6, boolean z12, boolean z13, DateTime dateTime3, DateTime dateTime4, boolean z14, String str7, String str8, PhysicalLock physicalLock, List<PhysicalLock> list, boolean z15, boolean z16, boolean z17, String str9, String str10, DateTime dateTime5, PartnerBirdState partnerBirdState, boolean z18, boolean z19, Lifecycle lifecycle, boolean z20, BirdLicenseView birdLicenseView, String str11, NestPurpose nestPurpose, PrivateBird privateBird, DateTime dateTime6, MapPinBadge badgeType, List<BountyReason> bountyReasons, String str12, String str13, Boolean bool, DateTime dateTime7) {
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
        this.f66670id = id;
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
        this.physicalLock = physicalLock;
        this.physicalLocks = list;
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
        this.license = birdLicenseView;
        this.areaKey = str11;
        this.nestPurpose = nestPurpose;
        this.privateBird = privateBird;
        this.scannedAt = dateTime6;
        this.badgeType = badgeType;
        this.bountyReasons = bountyReasons;
        this.ephemeralId = str12;
        this.bleMacAddress = str13;
        this.hasHelmet = bool;
        this.locationUpdatedAt = dateTime7;
    }

    @Deprecated(message = "use physicalLocks")
    public static /* synthetic */ void getPhysicalLock$annotations() {
    }

    public final String component1() {
        return this.f66670id;
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

    public final BirdLabel component20() {
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

    public final PhysicalLock component40() {
        return this.physicalLock;
    }

    public final List<PhysicalLock> component41() {
        return this.physicalLocks;
    }

    public final boolean component42() {
        return this.priorityCollect;
    }

    public final boolean component43() {
        return this.down;
    }

    public final boolean component44() {
        return this.needsInspection;
    }

    public final String component45() {
        return this.partnerId;
    }

    public final String component46() {
        return this.nestId;
    }

    public final DateTime component47() {
        return this.lastRideEndedAt;
    }

    public final PartnerBirdState component48() {
        return this.partnerBirdState;
    }

    public final boolean component49() {
        return this.peril;
    }

    public final Integer component5() {
        return this.estimatedRange;
    }

    public final boolean component50() {
        return this.deliverable;
    }

    public final Lifecycle component51() {
        return this.lifecycle;
    }

    public final boolean component52() {
        return this.offline;
    }

    public final BirdLicenseView component53() {
        return this.license;
    }

    public final String component54() {
        return this.areaKey;
    }

    public final NestPurpose component55() {
        return this.nestPurpose;
    }

    public final PrivateBird component56() {
        return this.privateBird;
    }

    public final DateTime component57() {
        return this.scannedAt;
    }

    public final MapPinBadge component58() {
        return this.badgeType;
    }

    public final List<BountyReason> component59() {
        return this.bountyReasons;
    }

    public final int component6() {
        return this.distance;
    }

    public final String component60() {
        return this.ephemeralId;
    }

    public final String component61() {
        return this.bleMacAddress;
    }

    public final Boolean component62() {
        return this.hasHelmet;
    }

    public final DateTime component63() {
        return this.locationUpdatedAt;
    }

    public final Geolocation component7() {
        return this.location;
    }

    public final String component8() {
        return this.code;
    }

    public final String component9() {
        return this.stickerId;
    }

    public final Bird copy(String id, String str, String str2, int i, Integer num, int i2, Geolocation location, String code, String str3, String serialNumber, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, BirdLabel label, List<? extends BirdAction> actions, String str4, Integer num2, String bountyCurrency, boolean z10, boolean z11, BountyKind bountyKind, String str5, BirdTaskKind taskKind, DateTime dateTime, DateTime dateTime2, String str6, boolean z12, boolean z13, DateTime dateTime3, DateTime dateTime4, boolean z14, String str7, String str8, PhysicalLock physicalLock, List<PhysicalLock> list, boolean z15, boolean z16, boolean z17, String str9, String str10, DateTime dateTime5, PartnerBirdState partnerBirdState, boolean z18, boolean z19, Lifecycle lifecycle, boolean z20, BirdLicenseView birdLicenseView, String str11, NestPurpose nestPurpose, PrivateBird privateBird, DateTime dateTime6, MapPinBadge badgeType, List<BountyReason> bountyReasons, String str12, String str13, Boolean bool, DateTime dateTime7) {
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
        return new Bird(id, str, str2, i, num, i2, location, code, str3, serialNumber, z, z2, z3, z4, z5, z6, z7, z8, z9, label, actions, str4, num2, bountyCurrency, z10, z11, bountyKind, str5, taskKind, dateTime, dateTime2, str6, z12, z13, dateTime3, dateTime4, z14, str7, str8, physicalLock, list, z15, z16, z17, str9, str10, dateTime5, partnerBirdState, z18, z19, lifecycle, z20, birdLicenseView, str11, nestPurpose, privateBird, dateTime6, badgeType, bountyReasons, str12, str13, bool, dateTime7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Bird) {
            Bird bird = (Bird) obj;
            return Intrinsics.areEqual(this.f66670id, bird.f66670id) && Intrinsics.areEqual(this.model, bird.model) && Intrinsics.areEqual(this.taskId, bird.taskId) && this.batteryLevel == bird.batteryLevel && Intrinsics.areEqual(this.estimatedRange, bird.estimatedRange) && this.distance == bird.distance && Intrinsics.areEqual(this.location, bird.location) && Intrinsics.areEqual(this.code, bird.code) && Intrinsics.areEqual(this.stickerId, bird.stickerId) && Intrinsics.areEqual(this.serialNumber, bird.serialNumber) && this.disconnected == bird.disconnected && this.collect == bird.collect && this.submerged == bird.submerged && this.lost == bird.lost && this.locked == bird.locked && this.ackLocked == bird.ackLocked && this.captive == bird.captive && this.gpsFix == bird.gpsFix && this.broken == bird.broken && Intrinsics.areEqual(this.label, bird.label) && Intrinsics.areEqual(this.actions, bird.actions) && Intrinsics.areEqual(this.bountyId, bird.bountyId) && Intrinsics.areEqual(this.bountyPrice, bird.bountyPrice) && Intrinsics.areEqual(this.bountyCurrency, bird.bountyCurrency) && this.bountyLost == bird.bountyLost && this.bountyOverdue == bird.bountyOverdue && this.bountyKind == bird.bountyKind && Intrinsics.areEqual(this.brandName, bird.brandName) && this.taskKind == bird.taskKind && Intrinsics.areEqual(this.gpsAt, bird.gpsAt) && Intrinsics.areEqual(this.trackedAt, bird.trackedAt) && Intrinsics.areEqual(this.token, bird.token) && this.bluetooth == bird.bluetooth && this.cellular == bird.cellular && Intrinsics.areEqual(this.startedAt, bird.startedAt) && Intrinsics.areEqual(this.dueAt, bird.dueAt) && this.asleep == bird.asleep && Intrinsics.areEqual(this.imei, bird.imei) && Intrinsics.areEqual(this.boardProtocol, bird.boardProtocol) && Intrinsics.areEqual(this.physicalLock, bird.physicalLock) && Intrinsics.areEqual(this.physicalLocks, bird.physicalLocks) && this.priorityCollect == bird.priorityCollect && this.down == bird.down && this.needsInspection == bird.needsInspection && Intrinsics.areEqual(this.partnerId, bird.partnerId) && Intrinsics.areEqual(this.nestId, bird.nestId) && Intrinsics.areEqual(this.lastRideEndedAt, bird.lastRideEndedAt) && this.partnerBirdState == bird.partnerBirdState && this.peril == bird.peril && this.deliverable == bird.deliverable && Intrinsics.areEqual(this.lifecycle, bird.lifecycle) && this.offline == bird.offline && Intrinsics.areEqual(this.license, bird.license) && Intrinsics.areEqual(this.areaKey, bird.areaKey) && this.nestPurpose == bird.nestPurpose && Intrinsics.areEqual(this.privateBird, bird.privateBird) && Intrinsics.areEqual(this.scannedAt, bird.scannedAt) && this.badgeType == bird.badgeType && Intrinsics.areEqual(this.bountyReasons, bird.bountyReasons) && Intrinsics.areEqual(this.ephemeralId, bird.ephemeralId) && Intrinsics.areEqual(this.bleMacAddress, bird.bleMacAddress) && Intrinsics.areEqual(this.hasHelmet, bird.hasHelmet) && Intrinsics.areEqual(this.locationUpdatedAt, bird.locationUpdatedAt);
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

    public final List<BountyReason> getBountyReasons() {
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

    public final DateTime getGpsAt() {
        return this.gpsAt;
    }

    public final boolean getGpsFix() {
        return this.gpsFix;
    }

    public final Boolean getHasHelmet() {
        return this.hasHelmet;
    }

    public final String getId() {
        return this.f66670id;
    }

    public final String getImei() {
        return this.imei;
    }

    public final BirdLabel getLabel() {
        return this.label;
    }

    public final DateTime getLastRideEndedAt() {
        return this.lastRideEndedAt;
    }

    public final BirdLicenseView getLicense() {
        return this.license;
    }

    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final Boolean getLightOn() {
        return this.lightOn;
    }

    public final Geolocation getLocation() {
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

    public final PhysicalLock getPhysicalLock() {
        return this.physicalLock;
    }

    public final List<PhysicalLock> getPhysicalLocks() {
        return this.physicalLocks;
    }

    public final boolean getPriorityCollect() {
        return this.priorityCollect;
    }

    public final PrivateBird getPrivateBird() {
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
        int hashCode = this.f66670id.hashCode() * 31;
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
        PhysicalLock physicalLock = this.physicalLock;
        int hashCode18 = (hashCode17 + (physicalLock == null ? 0 : physicalLock.hashCode())) * 31;
        List<PhysicalLock> list = this.physicalLocks;
        int hashCode19 = (hashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z15 = this.priorityCollect;
        int i27 = z15;
        if (z15 != 0) {
            i27 = 1;
        }
        int i28 = (hashCode19 + i27) * 31;
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
        int hashCode20 = (i32 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.nestId;
        int hashCode21 = (hashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        DateTime dateTime5 = this.lastRideEndedAt;
        int hashCode22 = (hashCode21 + (dateTime5 == null ? 0 : dateTime5.hashCode())) * 31;
        PartnerBirdState partnerBirdState = this.partnerBirdState;
        int hashCode23 = (hashCode22 + (partnerBirdState == null ? 0 : partnerBirdState.hashCode())) * 31;
        boolean z18 = this.peril;
        int i33 = z18;
        if (z18 != 0) {
            i33 = 1;
        }
        int i34 = (hashCode23 + i33) * 31;
        boolean z19 = this.deliverable;
        int i35 = z19;
        if (z19 != 0) {
            i35 = 1;
        }
        int hashCode24 = (((i34 + i35) * 31) + this.lifecycle.hashCode()) * 31;
        boolean z20 = this.offline;
        int i36 = (hashCode24 + (z20 ? 1 : z20 ? 1 : 0)) * 31;
        BirdLicenseView birdLicenseView = this.license;
        int hashCode25 = (i36 + (birdLicenseView == null ? 0 : birdLicenseView.hashCode())) * 31;
        String str11 = this.areaKey;
        int hashCode26 = (hashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
        NestPurpose nestPurpose = this.nestPurpose;
        int hashCode27 = (hashCode26 + (nestPurpose == null ? 0 : nestPurpose.hashCode())) * 31;
        PrivateBird privateBird = this.privateBird;
        int hashCode28 = (hashCode27 + (privateBird == null ? 0 : privateBird.hashCode())) * 31;
        DateTime dateTime6 = this.scannedAt;
        int hashCode29 = (((((hashCode28 + (dateTime6 == null ? 0 : dateTime6.hashCode())) * 31) + this.badgeType.hashCode()) * 31) + this.bountyReasons.hashCode()) * 31;
        String str12 = this.ephemeralId;
        int hashCode30 = (hashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.bleMacAddress;
        int hashCode31 = (hashCode30 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.hasHelmet;
        int hashCode32 = (hashCode31 + (bool == null ? 0 : bool.hashCode())) * 31;
        DateTime dateTime7 = this.locationUpdatedAt;
        return hashCode32 + (dateTime7 != null ? dateTime7.hashCode() : 0);
    }

    public final boolean isScanlessRideEligible() {
        return this.isScanlessRideEligible;
    }

    public final void setLightOn(Boolean bool) {
        this.lightOn = bool;
    }

    public final void setScanlessRideEligible(boolean z) {
        this.isScanlessRideEligible = z;
    }

    public String toString() {
        String str = this.f66670id;
        String str2 = this.model;
        String str3 = this.taskId;
        int i = this.batteryLevel;
        Integer num = this.estimatedRange;
        int i2 = this.distance;
        Geolocation geolocation = this.location;
        String str4 = this.code;
        String str5 = this.stickerId;
        String str6 = this.serialNumber;
        boolean z = this.disconnected;
        boolean z2 = this.collect;
        boolean z3 = this.submerged;
        boolean z4 = this.lost;
        boolean z5 = this.locked;
        boolean z6 = this.ackLocked;
        boolean z7 = this.captive;
        boolean z8 = this.gpsFix;
        boolean z9 = this.broken;
        BirdLabel birdLabel = this.label;
        List<BirdAction> list = this.actions;
        String str7 = this.bountyId;
        Integer num2 = this.bountyPrice;
        String str8 = this.bountyCurrency;
        boolean z10 = this.bountyLost;
        boolean z11 = this.bountyOverdue;
        BountyKind bountyKind = this.bountyKind;
        String str9 = this.brandName;
        BirdTaskKind birdTaskKind = this.taskKind;
        DateTime dateTime = this.gpsAt;
        DateTime dateTime2 = this.trackedAt;
        String str10 = this.token;
        boolean z12 = this.bluetooth;
        boolean z13 = this.cellular;
        DateTime dateTime3 = this.startedAt;
        DateTime dateTime4 = this.dueAt;
        boolean z14 = this.asleep;
        String str11 = this.imei;
        String str12 = this.boardProtocol;
        PhysicalLock physicalLock = this.physicalLock;
        List<PhysicalLock> list2 = this.physicalLocks;
        boolean z15 = this.priorityCollect;
        boolean z16 = this.down;
        boolean z17 = this.needsInspection;
        String str13 = this.partnerId;
        String str14 = this.nestId;
        DateTime dateTime5 = this.lastRideEndedAt;
        PartnerBirdState partnerBirdState = this.partnerBirdState;
        boolean z18 = this.peril;
        boolean z19 = this.deliverable;
        Lifecycle lifecycle = this.lifecycle;
        boolean z20 = this.offline;
        BirdLicenseView birdLicenseView = this.license;
        String str15 = this.areaKey;
        NestPurpose nestPurpose = this.nestPurpose;
        PrivateBird privateBird = this.privateBird;
        DateTime dateTime6 = this.scannedAt;
        MapPinBadge mapPinBadge = this.badgeType;
        List<BountyReason> list3 = this.bountyReasons;
        String str16 = this.ephemeralId;
        String str17 = this.bleMacAddress;
        Boolean bool = this.hasHelmet;
        DateTime dateTime7 = this.locationUpdatedAt;
        return "Bird(id=" + str + ", model=" + str2 + ", taskId=" + str3 + ", batteryLevel=" + i + ", estimatedRange=" + num + ", distance=" + i2 + ", location=" + geolocation + ", code=" + str4 + ", stickerId=" + str5 + ", serialNumber=" + str6 + ", disconnected=" + z + ", collect=" + z2 + ", submerged=" + z3 + ", lost=" + z4 + ", locked=" + z5 + ", ackLocked=" + z6 + ", captive=" + z7 + ", gpsFix=" + z8 + ", broken=" + z9 + ", label=" + birdLabel + ", actions=" + list + ", bountyId=" + str7 + ", bountyPrice=" + num2 + ", bountyCurrency=" + str8 + ", bountyLost=" + z10 + ", bountyOverdue=" + z11 + ", bountyKind=" + bountyKind + ", brandName=" + str9 + ", taskKind=" + birdTaskKind + ", gpsAt=" + dateTime + ", trackedAt=" + dateTime2 + ", token=" + str10 + ", bluetooth=" + z12 + ", cellular=" + z13 + ", startedAt=" + dateTime3 + ", dueAt=" + dateTime4 + ", asleep=" + z14 + ", imei=" + str11 + ", boardProtocol=" + str12 + ", physicalLock=" + physicalLock + ", physicalLocks=" + list2 + ", priorityCollect=" + z15 + ", down=" + z16 + ", needsInspection=" + z17 + ", partnerId=" + str13 + ", nestId=" + str14 + ", lastRideEndedAt=" + dateTime5 + ", partnerBirdState=" + partnerBirdState + ", peril=" + z18 + ", deliverable=" + z19 + ", lifecycle=" + lifecycle + ", offline=" + z20 + ", license=" + birdLicenseView + ", areaKey=" + str15 + ", nestPurpose=" + nestPurpose + ", privateBird=" + privateBird + ", scannedAt=" + dateTime6 + ", badgeType=" + mapPinBadge + ", bountyReasons=" + list3 + ", ephemeralId=" + str16 + ", bleMacAddress=" + str17 + ", hasHelmet=" + bool + ", locationUpdatedAt=" + dateTime7 + ")";
    }
}
