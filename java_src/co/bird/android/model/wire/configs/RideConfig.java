package co.bird.android.model.wire.configs;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.Level;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bÅ\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u000e\u0012\b\b\u0002\u0010!\u001a\u00020\u000e\u0012\b\b\u0002\u0010\"\u001a\u00020\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\u000e\u0012\b\b\u0002\u0010$\u001a\u00020\u000e\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010(\u001a\u00020\u000e\u0012\b\b\u0002\u0010)\u001a\u00020\f\u0012\b\b\u0002\u0010*\u001a\u00020\f\u0012\b\b\u0002\u0010+\u001a\u00020\u000e\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010/\u001a\u00020\u000e\u0012\b\b\u0002\u00100\u001a\u00020\u000e\u0012\b\b\u0002\u00101\u001a\u00020\u000e\u0012\b\b\u0002\u00102\u001a\u00020\u000e\u0012\b\b\u0002\u00103\u001a\u00020\u000e\u0012\b\b\u0002\u00104\u001a\u00020\u000e\u0012\b\b\u0002\u00105\u001a\u00020\f\u0012\b\b\u0002\u00106\u001a\u00020\f\u0012\b\b\u0002\u00107\u001a\u00020\u000e\u0012\b\b\u0002\u00108\u001a\u00020\u000e\u0012\b\b\u0002\u00109\u001a\u00020\f\u0012\b\b\u0002\u0010:\u001a\u00020\u000e\u0012\b\b\u0002\u0010;\u001a\u00020\u000e\u0012\b\b\u0002\u0010<\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\b\b\u0002\u0010>\u001a\u00020\u000e\u0012\b\b\u0002\u0010?\u001a\u00020\u000e\u0012\b\b\u0002\u0010@\u001a\u00020\u000e\u0012\b\b\u0002\u0010A\u001a\u00020\u000e\u0012\b\b\u0002\u0010B\u001a\u00020\f\u0012\b\b\u0002\u0010C\u001a\u00020\f\u0012\b\b\u0002\u0010D\u001a\u00020\f\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010F\u001a\u00020\u000e\u0012\b\b\u0002\u0010G\u001a\u00020\u000e\u0012\b\b\u0002\u0010H\u001a\u00020\u000e\u0012\b\b\u0002\u0010I\u001a\u00020\u000e\u0012\b\b\u0002\u0010J\u001a\u00020\u000e\u0012\b\b\u0002\u0010K\u001a\u00020\f\u0012\b\b\u0002\u0010L\u001a\u00020\f\u0012\b\b\u0002\u0010M\u001a\u00020\u000e\u0012\b\b\u0002\u0010N\u001a\u00020\u000e\u0012\b\b\u0002\u0010O\u001a\u00020\u000e\u0012\b\b\u0002\u0010P\u001a\u00020\f\u0012\b\b\u0002\u0010Q\u001a\u00020\f\u0012\b\b\u0002\u0010R\u001a\u00020S\u0012\b\b\u0002\u0010T\u001a\u00020U\u0012\b\b\u0002\u0010V\u001a\u00020W\u0012\b\b\u0002\u0010X\u001a\u00020\u000e\u0012\b\b\u0002\u0010Y\u001a\u00020\u000e\u0012\b\b\u0002\u0010Z\u001a\u00020[\u0012\b\b\u0002\u0010\\\u001a\u00020\u000e\u0012\b\b\u0002\u0010]\u001a\u00020\u000e\u0012\b\b\u0002\u0010^\u001a\u00020_\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010a\u0012\b\b\u0002\u0010b\u001a\u00020c\u0012\b\b\u0002\u0010d\u001a\u00020e\u0012\b\b\u0002\u0010f\u001a\u00020\f\u0012\b\b\u0002\u0010g\u001a\u00020\u000e¢\u0006\u0002\u0010hJ\n\u0010Ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\fHÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\fHÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u000eHÆ\u0003J\u0012\u0010Õ\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\fHÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u001fHÆ\u0003J\n\u0010à\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010á\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010â\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010å\u0001\u001a\u00020&HÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ç\u0001\u001a\u00020&HÆ\u0003J\n\u0010è\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010é\u0001\u001a\u00020\fHÆ\u0003J\n\u0010ê\u0001\u001a\u00020\fHÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010ì\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ò\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ö\u0001\u001a\u00020\fHÆ\u0003J\n\u0010÷\u0001\u001a\u00020\fHÆ\u0003J\n\u0010ø\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ú\u0001\u001a\u00020\fHÆ\u0003J\n\u0010û\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ý\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010þ\u0001\u001a\u00020\u000eHÆ\u0003J\u0010\u0010ÿ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014HÆ\u0003J\n\u0010\u0080\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0081\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0082\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0083\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0084\u0002\u001a\u00020\fHÆ\u0003J\n\u0010\u0085\u0002\u001a\u00020\fHÆ\u0003J\n\u0010\u0086\u0002\u001a\u00020\fHÆ\u0003J\n\u0010\u0087\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0089\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u008a\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u008b\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u008c\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u008d\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u008e\u0002\u001a\u00020\fHÆ\u0003J\n\u0010\u008f\u0002\u001a\u00020\fHÆ\u0003J\n\u0010\u0090\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0091\u0002\u001a\u00020\u000eHÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0093\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u0094\u0002\u001a\u00020\fHÆ\u0003J\n\u0010\u0095\u0002\u001a\u00020\fHÆ\u0003J\n\u0010\u0096\u0002\u001a\u00020SHÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020UHÆ\u0003J\n\u0010\u0098\u0002\u001a\u00020WHÆ\u0003J\n\u0010\u0099\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u009a\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u009b\u0002\u001a\u00020[HÆ\u0003J\n\u0010\u009c\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u009d\u0002\u001a\u00020\fHÆ\u0003J\n\u0010\u009e\u0002\u001a\u00020\u000eHÆ\u0003J\n\u0010\u009f\u0002\u001a\u00020_HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010aHÆ\u0003J\n\u0010¡\u0002\u001a\u00020cHÆ\u0003J\n\u0010¢\u0002\u001a\u00020eHÆ\u0003J\n\u0010£\u0002\u001a\u00020\fHÆ\u0003J\n\u0010¤\u0002\u001a\u00020\u000eHÆ\u0003J\u0011\u0010¥\u0002\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010|J\u008e\u0007\u0010¦\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020\f2\b\b\u0002\u0010+\u001a\u00020\u000e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010/\u001a\u00020\u000e2\b\b\u0002\u00100\u001a\u00020\u000e2\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e2\b\b\u0002\u00104\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u00020\f2\b\b\u0002\u00107\u001a\u00020\u000e2\b\b\u0002\u00108\u001a\u00020\u000e2\b\b\u0002\u00109\u001a\u00020\f2\b\b\u0002\u0010:\u001a\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020\u000e2\b\b\u0002\u0010<\u001a\u00020\u000e2\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\b\u0002\u0010>\u001a\u00020\u000e2\b\b\u0002\u0010?\u001a\u00020\u000e2\b\b\u0002\u0010@\u001a\u00020\u000e2\b\b\u0002\u0010A\u001a\u00020\u000e2\b\b\u0002\u0010B\u001a\u00020\f2\b\b\u0002\u0010C\u001a\u00020\f2\b\b\u0002\u0010D\u001a\u00020\f2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010F\u001a\u00020\u000e2\b\b\u0002\u0010G\u001a\u00020\u000e2\b\b\u0002\u0010H\u001a\u00020\u000e2\b\b\u0002\u0010I\u001a\u00020\u000e2\b\b\u0002\u0010J\u001a\u00020\u000e2\b\b\u0002\u0010K\u001a\u00020\f2\b\b\u0002\u0010L\u001a\u00020\f2\b\b\u0002\u0010M\u001a\u00020\u000e2\b\b\u0002\u0010N\u001a\u00020\u000e2\b\b\u0002\u0010O\u001a\u00020\u000e2\b\b\u0002\u0010P\u001a\u00020\f2\b\b\u0002\u0010Q\u001a\u00020\f2\b\b\u0002\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u00020U2\b\b\u0002\u0010V\u001a\u00020W2\b\b\u0002\u0010X\u001a\u00020\u000e2\b\b\u0002\u0010Y\u001a\u00020\u000e2\b\b\u0002\u0010Z\u001a\u00020[2\b\b\u0002\u0010\\\u001a\u00020\u000e2\b\b\u0002\u0010]\u001a\u00020\u000e2\b\b\u0002\u0010^\u001a\u00020_2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010a2\b\b\u0002\u0010b\u001a\u00020c2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0002\u0010f\u001a\u00020\f2\b\b\u0002\u0010g\u001a\u00020\u000eHÆ\u0001¢\u0006\u0003\u0010§\u0002J\n\u0010¨\u0002\u001a\u00020\fHÖ\u0001J\u0016\u0010©\u0002\u001a\u00020\u000e2\n\u0010ª\u0002\u001a\u0005\u0018\u00010«\u0002HÖ\u0003J\n\u0010¬\u0002\u001a\u00020\fHÖ\u0001J\n\u0010\u00ad\u0002\u001a\u00020\u0007HÖ\u0001J\u001e\u0010®\u0002\u001a\u00030¯\u00022\b\u0010°\u0002\u001a\u00030±\u00022\u0007\u0010²\u0002\u001a\u00020\fHÖ\u0001R\u0016\u0010Q\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0016\u0010]\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0016\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010nR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0016\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010jR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010jR\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010jR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010pR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010}\u001a\u0004\b{\u0010|R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010sR\u0016\u0010\\\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010nR\u0017\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010pR\u0017\u0010I\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010nR\u0017\u0010+\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010nR\u0018\u0010d\u001a\u00020e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010J\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010nR\u0017\u0010?\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010nR\u0017\u00103\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010nR\u0017\u0010:\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010nR\u0017\u0010;\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010nR\u0017\u0010<\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010nR\u0017\u0010 \u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010nR\u0017\u00102\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010nR\u0017\u0010/\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010nR\u0017\u00100\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010nR\u0017\u00101\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010nR\u0017\u00107\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010nR\u0017\u00108\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010nR\u0017\u0010O\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010nR\u0017\u0010N\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010nR\u0017\u0010M\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010nR\u0017\u0010!\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010nR\u0017\u0010\"\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010nR\u0017\u0010(\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010nR\u0017\u0010#\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010nR\u0017\u0010$\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010nR\u0017\u0010A\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010nR\u0017\u00104\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010nR\u0017\u0010g\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010nR\u0017\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010nR\u0017\u0010G\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010nR\u0018\u0010b\u001a\u00020c8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010X\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010nR\u0017\u0010>\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010nR\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010vR\u001a\u0010`\u001a\u0004\u0018\u00010a8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010\u001c\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010jR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010pR\u0018\u0010Z\u001a\u00020[8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¨\u0001\u0010©\u0001R\u0017\u00105\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010jR\u0017\u0010L\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b«\u0001\u0010jR\u0017\u0010K\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010jR\u0017\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010sR\u0017\u00106\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010jR\u0017\u0010f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010jR\u0017\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010sR\u0017\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010sR\u0017\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010sR\u0017\u0010Y\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010nR\u0019\u0010.\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010pR\u0019\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010pR\u0017\u00109\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010jR\u0017\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b·\u0001\u0010sR\u0017\u0010@\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010nR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¹\u0001\u0010pR\u0018\u0010V\u001a\u00020W8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bº\u0001\u0010»\u0001R\u0018\u0010^\u001a\u00020_8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¼\u0001\u0010½\u0001R\u0017\u0010)\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010jR\u0018\u0010'\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¿\u0001\u0010À\u0001R\u0017\u0010*\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÁ\u0001\u0010jR\u0018\u0010%\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010À\u0001R\u0019\u0010E\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÃ\u0001\u0010pR\u0017\u0010D\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0001\u0010jR\u0017\u0010B\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÅ\u0001\u0010jR\u0017\u0010C\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010jR\u0017\u0010P\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÇ\u0001\u0010jR\u0017\u0010F\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0001\u0010nR\u0017\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÉ\u0001\u0010nR\u0018\u0010T\u001a\u00020U8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0019\u0010,\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0001\u0010pR\u0017\u0010H\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÍ\u0001\u0010nR\u0018\u0010R\u001a\u00020S8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÎ\u0001\u0010Ï\u0001¨\u0006³\u0002"}, m28432d2 = {"Lco/bird/android/model/wire/configs/RideConfig;", "Landroid/os/Parcelable;", "basePrice", "", "minutePrice", "parkingFinePrice", "currency", "", "maximumFreeRideAmount", "minimumUserBalance", "autoPayExpName", "autoPayRefillAmount", "", "autoPayUseFullscreenFlow", "", "autoPayPromptFirst", "autoPayStartAfterRideCount", "autoPayNagEveryRideCount", "autoPayMandatory", "autoPayPlans", "", "Lco/bird/android/model/wire/configs/AutoPayPlanConfig;", "autoPayMandatoryMinBalance", "autoPayTitleOverride", "enableSingleAuthForPositiveBalance", "showPriceChangeModalWithoutHistory", "priceChangeExpName", "minimumRidePrice", "includedMinutes", "localizedDynamicPriceString", "additionalFees", "Lco/bird/android/model/wire/configs/AdditionalFeesConfig;", "enableLocationOptOut", "enableRideWithoutLocationServices", "enableScanlessReservedRideStart", "enableScanlessRideStart", "enableScanlessRideStartScanner", "scanlessUpdateDistance", "", "scanlessRideBluetoothScanDuration", "enableScanlessRideBannerChirp", "scanlessRideBirdCacheExpirationTimeSeconds", "scanlessRideMaxApiScanLimit", "displayPartnerNameInRideReceipt", "supportContactNumber", "optionalLocalContactInfoTitle", "optionalLocalContactInfoNumber", "enableMultiModalMapPins", "enableMultiModalTutorialButton", "enableMultiModalTutorialSelection", "enableMapAreasByFleet", "enableDetailedVehicleInfo", "enableScannerCodeEntryV2", "maxBirdCodeLength", "minBirdCodeLength", "enableOutsideServiceAreaParkingTicket", "enableOutsideServiceAreaParkingTicketAcceptFine", "outsideServiceAreaParkingTicketAmount", "enableFreeUnlockAfterBadScan", "enableFreeUnlockAfterCancelledRide", "enableFreeUnlockAfterLowBatteryRide", "forceClientTracksByModel", "forceClientTracks", "enableChirpOnScanlessRideStart", "preferChirpAlarmOnScanlessRideStart", "enableScannerCodeEntryTooltip", "scannerCodeEntryTooltipMaxEntries", "scannerCodeEntryTooltipMaxViews", "scannerCodeEntryTooltipMaxDuration", "scannerCodeEntryTooltipLocalizedCopy", "showEndRideParkingRules", "enableVehicleTipUi", "useUpdatedSummaryFields", "disableEndRidePhotoMiddleIcon", "enableAndroidScanToRide", "maxRideDurationSecondsOutsideOperatingArea", "maxRideDurationSecondsNoRideZone", "enableRideStartOutsideOperatingArea", "enableRideStartNoRideZone", "enableRideAccelerationRecording", "sensorSamplingPeriodUs", "accelerationSampleChunkDuration", "warningConfig", "Lco/bird/android/model/wire/configs/RideWarningConfig;", "smartlockConfig", "Lco/bird/android/model/wire/configs/SmartlockRideConfig;", "rideLocationMode", "Lco/bird/android/model/wire/configs/RideLocationMode;", "filterNestsByBird", "mustParkInNest", "lockAckPollingIntervalSeconds", "", "bypassLockAckForBluetooth", "aggressiveEndRideLock", "safeRideStart", "Lco/bird/android/model/wire/configs/SafeStartConfig;", "helmetSelfie", "Lco/bird/android/model/wire/configs/HelmetSelfieConfig;", "endRide", "Lco/bird/android/model/wire/configs/EndRideConfig;", "dispute", "Lco/bird/android/model/wire/configs/DisputeConfig;", "minRiderAge", "enableShakeToReport", "(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZ)V", "getAccelerationSampleChunkDuration", "()I", "getAdditionalFees", "()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;", "getAggressiveEndRideLock", "()Z", "getAutoPayExpName", "()Ljava/lang/String;", "getAutoPayMandatory", "getAutoPayMandatoryMinBalance", "()J", "getAutoPayNagEveryRideCount", "getAutoPayPlans", "()Ljava/util/List;", "getAutoPayPromptFirst", "getAutoPayRefillAmount", "getAutoPayStartAfterRideCount", "getAutoPayTitleOverride", "getAutoPayUseFullscreenFlow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBasePrice", "getBypassLockAckForBluetooth", "getCurrency", "getDisableEndRidePhotoMiddleIcon", "getDisplayPartnerNameInRideReceipt", "getDispute", "()Lco/bird/android/model/wire/configs/DisputeConfig;", "getEnableAndroidScanToRide", "getEnableChirpOnScanlessRideStart", "getEnableDetailedVehicleInfo", "getEnableFreeUnlockAfterBadScan", "getEnableFreeUnlockAfterCancelledRide", "getEnableFreeUnlockAfterLowBatteryRide", "getEnableLocationOptOut", "getEnableMapAreasByFleet", "getEnableMultiModalMapPins", "getEnableMultiModalTutorialButton", "getEnableMultiModalTutorialSelection", "getEnableOutsideServiceAreaParkingTicket", "getEnableOutsideServiceAreaParkingTicketAcceptFine", "getEnableRideAccelerationRecording", "getEnableRideStartNoRideZone", "getEnableRideStartOutsideOperatingArea", "getEnableRideWithoutLocationServices", "getEnableScanlessReservedRideStart", "getEnableScanlessRideBannerChirp", "getEnableScanlessRideStart", "getEnableScanlessRideStartScanner", "getEnableScannerCodeEntryTooltip", "getEnableScannerCodeEntryV2", "getEnableShakeToReport", "getEnableSingleAuthForPositiveBalance", "getEnableVehicleTipUi", "getEndRide", "()Lco/bird/android/model/wire/configs/EndRideConfig;", "getFilterNestsByBird", "getForceClientTracks", "getForceClientTracksByModel", "getHelmetSelfie", "()Lco/bird/android/model/wire/configs/HelmetSelfieConfig;", "getIncludedMinutes", "getLocalizedDynamicPriceString", "getLockAckPollingIntervalSeconds", "()F", "getMaxBirdCodeLength", "getMaxRideDurationSecondsNoRideZone", "getMaxRideDurationSecondsOutsideOperatingArea", "getMaximumFreeRideAmount", "getMinBirdCodeLength", "getMinRiderAge", "getMinimumRidePrice", "getMinimumUserBalance", "getMinutePrice", "getMustParkInNest", "getOptionalLocalContactInfoNumber", "getOptionalLocalContactInfoTitle", "getOutsideServiceAreaParkingTicketAmount", "getParkingFinePrice", "getPreferChirpAlarmOnScanlessRideStart", "getPriceChangeExpName", "getRideLocationMode", "()Lco/bird/android/model/wire/configs/RideLocationMode;", "getSafeRideStart", "()Lco/bird/android/model/wire/configs/SafeStartConfig;", "getScanlessRideBirdCacheExpirationTimeSeconds", "getScanlessRideBluetoothScanDuration", "()D", "getScanlessRideMaxApiScanLimit", "getScanlessUpdateDistance", "getScannerCodeEntryTooltipLocalizedCopy", "getScannerCodeEntryTooltipMaxDuration", "getScannerCodeEntryTooltipMaxEntries", "getScannerCodeEntryTooltipMaxViews", "getSensorSamplingPeriodUs", "getShowEndRideParkingRules", "getShowPriceChangeModalWithoutHistory", "getSmartlockConfig", "()Lco/bird/android/model/wire/configs/SmartlockRideConfig;", "getSupportContactNumber", "getUseUpdatedSummaryFields", "getWarningConfig", "()Lco/bird/android/model/wire/configs/RideWarningConfig;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component9", "copy", "(JJJLjava/lang/String;JJLjava/lang/String;ILjava/lang/Boolean;ZIIZLjava/util/List;JLjava/lang/String;ZZLjava/lang/String;JILjava/lang/String;Lco/bird/android/model/wire/configs/AdditionalFeesConfig;ZZZZZDDZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIIZZIZZZLjava/util/List;ZZZZIIILjava/lang/String;ZZZZZIIZZZIILco/bird/android/model/wire/configs/RideWarningConfig;Lco/bird/android/model/wire/configs/SmartlockRideConfig;Lco/bird/android/model/wire/configs/RideLocationMode;ZZFZZLco/bird/android/model/wire/configs/SafeStartConfig;Lco/bird/android/model/wire/configs/HelmetSelfieConfig;Lco/bird/android/model/wire/configs/EndRideConfig;Lco/bird/android/model/wire/configs/DisputeConfig;IZ)Lco/bird/android/model/wire/configs/RideConfig;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideConfig implements Parcelable {
    public static final Parcelable.Creator<RideConfig> CREATOR = new Creator();
    @JsonProperty("acceleration_sample_chunk_duration")
    @InterfaceC41208ft5("acceleration_sample_chunk_duration")
    private final int accelerationSampleChunkDuration;
    @JsonProperty("additional_fees")
    @InterfaceC41208ft5("additional_fees")
    private final AdditionalFeesConfig additionalFees;
    @JsonProperty("aggressive_end_ride_lock")
    @InterfaceC41208ft5("aggressive_end_ride_lock")
    private final boolean aggressiveEndRideLock;
    @JsonProperty("auto_pay_exp_name")
    @InterfaceC41208ft5("auto_pay_exp_name")
    private final String autoPayExpName;
    @JsonProperty("auto_pay_mandatory")
    @InterfaceC41208ft5("auto_pay_mandatory")
    private final boolean autoPayMandatory;
    @JsonProperty("auto_pay_mandatory_min_balance")
    @InterfaceC41208ft5("auto_pay_mandatory_min_balance")
    private final long autoPayMandatoryMinBalance;
    @JsonProperty("auto_pay_nag_every_ride_count")
    @InterfaceC41208ft5("auto_pay_nag_every_ride_count")
    private final int autoPayNagEveryRideCount;
    @JsonProperty("auto_pay_plans")
    @InterfaceC41208ft5("auto_pay_plans")
    private final List<AutoPayPlanConfig> autoPayPlans;
    @JsonProperty("auto_pay_prompt_first")
    @InterfaceC41208ft5("auto_pay_prompt_first")
    private final boolean autoPayPromptFirst;
    @JsonProperty("auto_pay_refill_amount")
    @InterfaceC41208ft5("auto_pay_refill_amount")
    private final int autoPayRefillAmount;
    @JsonProperty("auto_pay_start_after_ride_count")
    @InterfaceC41208ft5("auto_pay_start_after_ride_count")
    private final int autoPayStartAfterRideCount;
    @JsonProperty("auto_pay_title_override")
    @InterfaceC41208ft5("auto_pay_title_override")
    private final String autoPayTitleOverride;
    @JsonProperty("auto_pay_use_fullscreen_flow")
    @InterfaceC41208ft5("auto_pay_use_fullscreen_flow")
    private final Boolean autoPayUseFullscreenFlow;
    @JsonProperty("base_price")
    @InterfaceC41208ft5("base_price")
    private final long basePrice;
    @JsonProperty("bypass_lock_ack_bluetooth")
    @InterfaceC41208ft5("bypass_lock_ack_bluetooth")
    private final boolean bypassLockAckForBluetooth;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("disable_end_ride_photo_middle_icon")
    @InterfaceC41208ft5("disable_end_ride_photo_middle_icon")
    private final boolean disableEndRidePhotoMiddleIcon;
    @JsonProperty("display_brand_name_in_ride_receipt")
    @InterfaceC41208ft5("display_brand_name_in_ride_receipt")
    private final boolean displayPartnerNameInRideReceipt;
    @JsonProperty("dispute")
    @InterfaceC41208ft5("dispute")
    private final DisputeConfig dispute;
    @JsonProperty("enable_android_scan_to_ride")
    @InterfaceC41208ft5("enable_android_scan_to_ride")
    private final boolean enableAndroidScanToRide;
    @JsonProperty("enable_chirp_on_scanless_ride_start")
    @InterfaceC41208ft5("enable_chirp_on_scanless_ride_start")
    private final boolean enableChirpOnScanlessRideStart;
    @JsonProperty("enable_detailed_vehicle_info")
    @InterfaceC41208ft5("enable_detailed_vehicle_info")
    private final boolean enableDetailedVehicleInfo;
    @JsonProperty("enable_free_unlock_after_bad_scan")
    @InterfaceC41208ft5("enable_free_unlock_after_bad_scan")
    private final boolean enableFreeUnlockAfterBadScan;
    @JsonProperty("enable_free_unlock_after_cancelled_ride")
    @InterfaceC41208ft5("enable_free_unlock_after_cancelled_ride")
    private final boolean enableFreeUnlockAfterCancelledRide;
    @JsonProperty("enable_free_unlock_after_low_battery_ride")
    @InterfaceC41208ft5("enable_free_unlock_after_low_battery_ride")
    private final boolean enableFreeUnlockAfterLowBatteryRide;
    @JsonProperty("enable_location_opt_out")
    @InterfaceC41208ft5("enable_location_opt_out")
    private final boolean enableLocationOptOut;
    @JsonProperty("enable_map_areas_by_fleet")
    @InterfaceC41208ft5("enable_map_areas_by_fleet")
    private final boolean enableMapAreasByFleet;
    @JsonProperty("enable_multi_modal_map_pins")
    @InterfaceC41208ft5("enable_multi_modal_map_pins")
    private final boolean enableMultiModalMapPins;
    @JsonProperty("enable_multi_modal_tutorial_button")
    @InterfaceC41208ft5("enable_multi_modal_tutorial_button")
    private final boolean enableMultiModalTutorialButton;
    @JsonProperty("enable_multi_modal_tutorial_selection")
    @InterfaceC41208ft5("enable_multi_modal_tutorial_selection")
    private final boolean enableMultiModalTutorialSelection;
    @JsonProperty("enable_outside_service_area_parking_ticket")
    @InterfaceC41208ft5("enable_outside_service_area_parking_ticket")
    private final boolean enableOutsideServiceAreaParkingTicket;
    @JsonProperty("enable_outside_service_area_parking_ticket_accept_fine")
    @InterfaceC41208ft5("enable_outside_service_area_parking_ticket_accept_fine")
    private final boolean enableOutsideServiceAreaParkingTicketAcceptFine;
    @JsonProperty("enable_ride_acceleration_recording")
    @InterfaceC41208ft5("enable_ride_acceleration_recording")
    private final boolean enableRideAccelerationRecording;
    @JsonProperty("enable_ride_start_no_ride_zone")
    @InterfaceC41208ft5("enable_ride_start_no_ride_zone")
    private final boolean enableRideStartNoRideZone;
    @JsonProperty("enable_ride_start_outside_operating_area")
    @InterfaceC41208ft5("enable_ride_start_outside_operating_area")
    private final boolean enableRideStartOutsideOperatingArea;
    @JsonProperty("enable_ride_without_location_services")
    @InterfaceC41208ft5("enable_ride_without_location_services")
    private final boolean enableRideWithoutLocationServices;
    @JsonProperty("enable_scanless_reserved_ride_start")
    @InterfaceC41208ft5("enable_scanless_reserved_ride_start")
    private final boolean enableScanlessReservedRideStart;
    @JsonProperty("enable_scanless_ride_banner_chirp")
    @InterfaceC41208ft5("enable_scanless_ride_banner_chirp")
    private final boolean enableScanlessRideBannerChirp;
    @JsonProperty("enable_scanless_ride_start")
    @InterfaceC41208ft5("enable_scanless_ride_start")
    private final boolean enableScanlessRideStart;
    @JsonProperty("enable_scanless_ride_start_scanner")
    @InterfaceC41208ft5("enable_scanless_ride_start_scanner")
    private final boolean enableScanlessRideStartScanner;
    @JsonProperty("enable_scanner_code_entry_tooltip")
    @InterfaceC41208ft5("enable_scanner_code_entry_tooltip")
    private final boolean enableScannerCodeEntryTooltip;
    @JsonProperty("enable_scanner_code_entry_v2")
    @InterfaceC41208ft5("enable_scanner_code_entry_v2")
    private final boolean enableScannerCodeEntryV2;
    @JsonProperty("enable_shake_to_report")
    @InterfaceC41208ft5("enable_shake_to_report")
    private final boolean enableShakeToReport;
    @JsonProperty("enable_single_auth_for_positive_balance")
    @InterfaceC41208ft5("enable_single_auth_for_positive_balance")
    private final boolean enableSingleAuthForPositiveBalance;
    @JsonProperty("enable_vehicle_tip_ui")
    @InterfaceC41208ft5("enable_vehicle_tip_ui")
    private final boolean enableVehicleTipUi;
    @JsonProperty("end_ride")
    @InterfaceC41208ft5("end_ride")
    private final EndRideConfig endRide;
    @JsonProperty("filter_nests_by_bird")
    @InterfaceC41208ft5("filter_nests_by_bird")
    private final boolean filterNestsByBird;
    @JsonProperty("force_client_tracks")
    @InterfaceC41208ft5("force_client_tracks")
    private final boolean forceClientTracks;
    @JsonProperty("force_client_tracks_by_model")
    @InterfaceC41208ft5("force_client_tracks_by_model")
    private final List<String> forceClientTracksByModel;
    @JsonProperty("helmet_selfie")
    @InterfaceC41208ft5("helmet_selfie")
    private final HelmetSelfieConfig helmetSelfie;
    @JsonProperty("included_minutes")
    @InterfaceC41208ft5("included_minutes")
    private final int includedMinutes;
    @JsonProperty("localized_dynamic_price_string")
    @InterfaceC41208ft5("localized_dynamic_price_string")
    private final String localizedDynamicPriceString;
    @JsonProperty("lock_ack_polling_interval_seconds")
    @InterfaceC41208ft5("lock_ack_polling_interval_seconds")
    private final float lockAckPollingIntervalSeconds;
    @JsonProperty("max_bird_code_length")
    @InterfaceC41208ft5("max_bird_code_length")
    private final int maxBirdCodeLength;
    @JsonProperty("max_ride_duration_no_ride_zone")
    @InterfaceC41208ft5("max_ride_duration_no_ride_zone")
    private final int maxRideDurationSecondsNoRideZone;
    @JsonProperty("max_ride_duration_outside_operating_area")
    @InterfaceC41208ft5("max_ride_duration_outside_operating_area")
    private final int maxRideDurationSecondsOutsideOperatingArea;
    @JsonProperty("maximum_free_ride_amount")
    @InterfaceC41208ft5("maximum_free_ride_amount")
    private final long maximumFreeRideAmount;
    @JsonProperty("min_bird_code_length")
    @InterfaceC41208ft5("min_bird_code_length")
    private final int minBirdCodeLength;
    @JsonProperty("min_rider_age")
    @InterfaceC41208ft5("min_rider_age")
    private final int minRiderAge;
    @JsonProperty("minimum_ride_price")
    @InterfaceC41208ft5("minimum_ride_price")
    private final long minimumRidePrice;
    @JsonProperty("minimum_user_balance")
    @InterfaceC41208ft5("minimum_user_balance")
    private final long minimumUserBalance;
    @JsonProperty("minute_price")
    @InterfaceC41208ft5("minute_price")
    private final long minutePrice;
    @JsonProperty("must_park_in_nest")
    @InterfaceC41208ft5("must_park_in_nest")
    private final boolean mustParkInNest;
    @JsonProperty("optional_local_contact_info_number")
    @InterfaceC41208ft5("optional_local_contact_info_number")
    private final String optionalLocalContactInfoNumber;
    @JsonProperty("optional_local_contact_info_title")
    @InterfaceC41208ft5("optional_local_contact_info_title")
    private final String optionalLocalContactInfoTitle;
    @JsonProperty("outside_service_area_parking_ticket_amount")
    @InterfaceC41208ft5("outside_service_area_parking_ticket_amount")
    private final int outsideServiceAreaParkingTicketAmount;
    @JsonProperty("parking_fine_price")
    @InterfaceC41208ft5("parking_fine_price")
    private final long parkingFinePrice;
    @JsonProperty("prefer_chirp_alarm_on_scanless_ride_start")
    @InterfaceC41208ft5("prefer_chirp_alarm_on_scanless_ride_start")
    private final boolean preferChirpAlarmOnScanlessRideStart;
    @JsonProperty("price_change_exp_name")
    @InterfaceC41208ft5("price_change_exp_name")
    private final String priceChangeExpName;
    @JsonProperty("client_location_heuristic")
    @JsonAlias({"ride_location_mode"})
    @InterfaceC41208ft5(alternate = {"ride_location_mode"}, value = "client_location_heuristic")
    private final RideLocationMode rideLocationMode;
    @JsonProperty("safe_ride_start")
    @InterfaceC41208ft5("safe_ride_start")
    private final SafeStartConfig safeRideStart;
    @JsonProperty("scanless_ride_bird_cache_expiration_time_seconds")
    @InterfaceC41208ft5("scanless_ride_bird_cache_expiration_time_seconds")
    private final int scanlessRideBirdCacheExpirationTimeSeconds;
    @JsonProperty("scanless_ride_bluetooth_scan_duration")
    @InterfaceC41208ft5("scanless_ride_bluetooth_scan_duration")
    private final double scanlessRideBluetoothScanDuration;
    @JsonProperty("scanless_ride_max_api_scan_limit")
    @InterfaceC41208ft5("scanless_ride_max_api_scan_limit")
    private final int scanlessRideMaxApiScanLimit;
    @JsonProperty("scanless_update_distance")
    @InterfaceC41208ft5("scanless_update_distance")
    private final double scanlessUpdateDistance;
    @JsonProperty("scanner_code_entry_tooltip_localized_copy")
    @InterfaceC41208ft5("scanner_code_entry_tooltip_localized_copy")
    private final String scannerCodeEntryTooltipLocalizedCopy;
    @JsonProperty("scanner_code_entry_tooltip_max_duration")
    @InterfaceC41208ft5("scanner_code_entry_tooltip_max_duration")
    private final int scannerCodeEntryTooltipMaxDuration;
    @JsonProperty("scanner_code_entry_tooltip_max_entries")
    @InterfaceC41208ft5("scanner_code_entry_tooltip_max_entries")
    private final int scannerCodeEntryTooltipMaxEntries;
    @JsonProperty("scanner_code_entry_tooltip_max_views")
    @InterfaceC41208ft5("scanner_code_entry_tooltip_max_views")
    private final int scannerCodeEntryTooltipMaxViews;
    @JsonProperty("sensor_sampling_period_us")
    @InterfaceC41208ft5("sensor_sampling_period_us")
    private final int sensorSamplingPeriodUs;
    @JsonProperty("show_end_ride_parking_rules")
    @InterfaceC41208ft5("show_end_ride_parking_rules")
    private final boolean showEndRideParkingRules;
    @JsonProperty("price_change_exp_in_treatment_group")
    @InterfaceC41208ft5("price_change_exp_in_treatment_group")
    private final boolean showPriceChangeModalWithoutHistory;
    @JsonProperty("smartlock")
    @InterfaceC41208ft5("smartlock")
    private final SmartlockRideConfig smartlockConfig;
    @JsonProperty("support_contact_number")
    @InterfaceC41208ft5("support_contact_number")
    private final String supportContactNumber;
    @JsonProperty("use_updated_summary_fields")
    @InterfaceC41208ft5("use_updated_summary_fields")
    private final boolean useUpdatedSummaryFields;
    @JsonProperty("warning")
    @InterfaceC41208ft5("warning")
    private final RideWarningConfig warningConfig;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RideConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RideConfig createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean bool;
            ArrayList arrayList;
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            String readString = parcel.readString();
            long readLong4 = parcel.readLong();
            long readLong5 = parcel.readLong();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                bool = valueOf;
                i = readInt;
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                bool = valueOf;
                arrayList = new ArrayList(readInt4);
                i = readInt;
                int i2 = 0;
                while (i2 != readInt4) {
                    arrayList.add(AutoPayPlanConfig.CREATOR.createFromParcel(parcel));
                    i2++;
                    readInt4 = readInt4;
                }
            }
            return new RideConfig(readLong, readLong2, readLong3, readString, readLong4, readLong5, readString2, i, bool, z, readInt2, readInt3, z2, arrayList, parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), AdditionalFeesConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), RideWarningConfig.CREATOR.createFromParcel(parcel), SmartlockRideConfig.CREATOR.createFromParcel(parcel), RideLocationMode.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readFloat(), parcel.readInt() != 0, parcel.readInt() != 0, SafeStartConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : HelmetSelfieConfig.CREATOR.createFromParcel(parcel), EndRideConfig.CREATOR.createFromParcel(parcel), DisputeConfig.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RideConfig[] newArray(int i) {
            return new RideConfig[i];
        }
    }

    public RideConfig() {
        this(0L, 0L, 0L, null, 0L, 0L, null, 0, null, false, 0, 0, false, null, 0L, null, false, false, null, 0L, 0, null, null, false, false, false, false, false, 0.0d, 0.0d, false, 0, 0, false, null, null, null, false, false, false, false, false, false, 0, 0, false, false, 0, false, false, false, null, false, false, false, false, 0, 0, 0, null, false, false, false, false, false, 0, 0, false, false, false, 0, 0, null, null, null, false, false, 0.0f, false, false, null, null, null, null, 0, false, -1, -1, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RideConfig copy$default(RideConfig rideConfig, long j, long j2, long j3, String str, long j4, long j5, String str2, int i, Boolean bool, boolean z, int i2, int i3, boolean z2, List list, long j6, String str3, boolean z3, boolean z4, String str4, long j7, int i4, String str5, AdditionalFeesConfig additionalFeesConfig, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, double d, double d2, boolean z10, int i5, int i6, boolean z11, String str6, String str7, String str8, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i7, int i8, boolean z18, boolean z19, int i9, boolean z20, boolean z21, boolean z22, List list2, boolean z23, boolean z24, boolean z25, boolean z26, int i10, int i11, int i12, String str9, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, int i13, int i14, boolean z32, boolean z33, boolean z34, int i15, int i16, RideWarningConfig rideWarningConfig, SmartlockRideConfig smartlockRideConfig, RideLocationMode rideLocationMode, boolean z35, boolean z36, float f, boolean z37, boolean z38, SafeStartConfig safeStartConfig, HelmetSelfieConfig helmetSelfieConfig, EndRideConfig endRideConfig, DisputeConfig disputeConfig, int i17, boolean z39, int i18, int i19, int i20, Object obj) {
        long j8 = (i18 & 1) != 0 ? rideConfig.basePrice : j;
        long j9 = (i18 & 2) != 0 ? rideConfig.minutePrice : j2;
        long j10 = (i18 & 4) != 0 ? rideConfig.parkingFinePrice : j3;
        String str10 = (i18 & 8) != 0 ? rideConfig.currency : str;
        long j11 = (i18 & 16) != 0 ? rideConfig.maximumFreeRideAmount : j4;
        long j12 = (i18 & 32) != 0 ? rideConfig.minimumUserBalance : j5;
        String str11 = (i18 & 64) != 0 ? rideConfig.autoPayExpName : str2;
        int i21 = (i18 & 128) != 0 ? rideConfig.autoPayRefillAmount : i;
        Boolean bool2 = (i18 & 256) != 0 ? rideConfig.autoPayUseFullscreenFlow : bool;
        boolean z40 = (i18 & 512) != 0 ? rideConfig.autoPayPromptFirst : z;
        int i22 = (i18 & 1024) != 0 ? rideConfig.autoPayStartAfterRideCount : i2;
        int i23 = (i18 & 2048) != 0 ? rideConfig.autoPayNagEveryRideCount : i3;
        boolean z41 = (i18 & 4096) != 0 ? rideConfig.autoPayMandatory : z2;
        List<AutoPayPlanConfig> list3 = (i18 & 8192) != 0 ? rideConfig.autoPayPlans : list;
        long j13 = j12;
        long j14 = (i18 & 16384) != 0 ? rideConfig.autoPayMandatoryMinBalance : j6;
        return rideConfig.copy(j8, j9, j10, str10, j11, j13, str11, i21, bool2, z40, i22, i23, z41, list3, j14, (i18 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? rideConfig.autoPayTitleOverride : str3, (i18 & 65536) != 0 ? rideConfig.enableSingleAuthForPositiveBalance : z3, (i18 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? rideConfig.showPriceChangeModalWithoutHistory : z4, (i18 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? rideConfig.priceChangeExpName : str4, (i18 & 524288) != 0 ? rideConfig.minimumRidePrice : j7, (i18 & 1048576) != 0 ? rideConfig.includedMinutes : i4, (i18 & 2097152) != 0 ? rideConfig.localizedDynamicPriceString : str5, (i18 & 4194304) != 0 ? rideConfig.additionalFees : additionalFeesConfig, (i18 & 8388608) != 0 ? rideConfig.enableLocationOptOut : z5, (i18 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? rideConfig.enableRideWithoutLocationServices : z6, (i18 & 33554432) != 0 ? rideConfig.enableScanlessReservedRideStart : z7, (i18 & 67108864) != 0 ? rideConfig.enableScanlessRideStart : z8, (i18 & 134217728) != 0 ? rideConfig.enableScanlessRideStartScanner : z9, (i18 & 268435456) != 0 ? rideConfig.scanlessUpdateDistance : d, (i18 & 536870912) != 0 ? rideConfig.scanlessRideBluetoothScanDuration : d2, (i18 & 1073741824) != 0 ? rideConfig.enableScanlessRideBannerChirp : z10, (i18 & Integer.MIN_VALUE) != 0 ? rideConfig.scanlessRideBirdCacheExpirationTimeSeconds : i5, (i19 & 1) != 0 ? rideConfig.scanlessRideMaxApiScanLimit : i6, (i19 & 2) != 0 ? rideConfig.displayPartnerNameInRideReceipt : z11, (i19 & 4) != 0 ? rideConfig.supportContactNumber : str6, (i19 & 8) != 0 ? rideConfig.optionalLocalContactInfoTitle : str7, (i19 & 16) != 0 ? rideConfig.optionalLocalContactInfoNumber : str8, (i19 & 32) != 0 ? rideConfig.enableMultiModalMapPins : z12, (i19 & 64) != 0 ? rideConfig.enableMultiModalTutorialButton : z13, (i19 & 128) != 0 ? rideConfig.enableMultiModalTutorialSelection : z14, (i19 & 256) != 0 ? rideConfig.enableMapAreasByFleet : z15, (i19 & 512) != 0 ? rideConfig.enableDetailedVehicleInfo : z16, (i19 & 1024) != 0 ? rideConfig.enableScannerCodeEntryV2 : z17, (i19 & 2048) != 0 ? rideConfig.maxBirdCodeLength : i7, (i19 & 4096) != 0 ? rideConfig.minBirdCodeLength : i8, (i19 & 8192) != 0 ? rideConfig.enableOutsideServiceAreaParkingTicket : z18, (i19 & 16384) != 0 ? rideConfig.enableOutsideServiceAreaParkingTicketAcceptFine : z19, (i19 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? rideConfig.outsideServiceAreaParkingTicketAmount : i9, (i19 & 65536) != 0 ? rideConfig.enableFreeUnlockAfterBadScan : z20, (i19 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? rideConfig.enableFreeUnlockAfterCancelledRide : z21, (i19 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? rideConfig.enableFreeUnlockAfterLowBatteryRide : z22, (i19 & 524288) != 0 ? rideConfig.forceClientTracksByModel : list2, (i19 & 1048576) != 0 ? rideConfig.forceClientTracks : z23, (i19 & 2097152) != 0 ? rideConfig.enableChirpOnScanlessRideStart : z24, (i19 & 4194304) != 0 ? rideConfig.preferChirpAlarmOnScanlessRideStart : z25, (i19 & 8388608) != 0 ? rideConfig.enableScannerCodeEntryTooltip : z26, (i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? rideConfig.scannerCodeEntryTooltipMaxEntries : i10, (i19 & 33554432) != 0 ? rideConfig.scannerCodeEntryTooltipMaxViews : i11, (i19 & 67108864) != 0 ? rideConfig.scannerCodeEntryTooltipMaxDuration : i12, (i19 & 134217728) != 0 ? rideConfig.scannerCodeEntryTooltipLocalizedCopy : str9, (i19 & 268435456) != 0 ? rideConfig.showEndRideParkingRules : z27, (i19 & 536870912) != 0 ? rideConfig.enableVehicleTipUi : z28, (i19 & 1073741824) != 0 ? rideConfig.useUpdatedSummaryFields : z29, (i19 & Integer.MIN_VALUE) != 0 ? rideConfig.disableEndRidePhotoMiddleIcon : z30, (i20 & 1) != 0 ? rideConfig.enableAndroidScanToRide : z31, (i20 & 2) != 0 ? rideConfig.maxRideDurationSecondsOutsideOperatingArea : i13, (i20 & 4) != 0 ? rideConfig.maxRideDurationSecondsNoRideZone : i14, (i20 & 8) != 0 ? rideConfig.enableRideStartOutsideOperatingArea : z32, (i20 & 16) != 0 ? rideConfig.enableRideStartNoRideZone : z33, (i20 & 32) != 0 ? rideConfig.enableRideAccelerationRecording : z34, (i20 & 64) != 0 ? rideConfig.sensorSamplingPeriodUs : i15, (i20 & 128) != 0 ? rideConfig.accelerationSampleChunkDuration : i16, (i20 & 256) != 0 ? rideConfig.warningConfig : rideWarningConfig, (i20 & 512) != 0 ? rideConfig.smartlockConfig : smartlockRideConfig, (i20 & 1024) != 0 ? rideConfig.rideLocationMode : rideLocationMode, (i20 & 2048) != 0 ? rideConfig.filterNestsByBird : z35, (i20 & 4096) != 0 ? rideConfig.mustParkInNest : z36, (i20 & 8192) != 0 ? rideConfig.lockAckPollingIntervalSeconds : f, (i20 & 16384) != 0 ? rideConfig.bypassLockAckForBluetooth : z37, (i20 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? rideConfig.aggressiveEndRideLock : z38, (i20 & 65536) != 0 ? rideConfig.safeRideStart : safeStartConfig, (i20 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? rideConfig.helmetSelfie : helmetSelfieConfig, (i20 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? rideConfig.endRide : endRideConfig, (i20 & 524288) != 0 ? rideConfig.dispute : disputeConfig, (i20 & 1048576) != 0 ? rideConfig.minRiderAge : i17, (i20 & 2097152) != 0 ? rideConfig.enableShakeToReport : z39);
    }

    public final long component1() {
        return this.basePrice;
    }

    public final boolean component10() {
        return this.autoPayPromptFirst;
    }

    public final int component11() {
        return this.autoPayStartAfterRideCount;
    }

    public final int component12() {
        return this.autoPayNagEveryRideCount;
    }

    public final boolean component13() {
        return this.autoPayMandatory;
    }

    public final List<AutoPayPlanConfig> component14() {
        return this.autoPayPlans;
    }

    public final long component15() {
        return this.autoPayMandatoryMinBalance;
    }

    public final String component16() {
        return this.autoPayTitleOverride;
    }

    public final boolean component17() {
        return this.enableSingleAuthForPositiveBalance;
    }

    public final boolean component18() {
        return this.showPriceChangeModalWithoutHistory;
    }

    public final String component19() {
        return this.priceChangeExpName;
    }

    public final long component2() {
        return this.minutePrice;
    }

    public final long component20() {
        return this.minimumRidePrice;
    }

    public final int component21() {
        return this.includedMinutes;
    }

    public final String component22() {
        return this.localizedDynamicPriceString;
    }

    public final AdditionalFeesConfig component23() {
        return this.additionalFees;
    }

    public final boolean component24() {
        return this.enableLocationOptOut;
    }

    public final boolean component25() {
        return this.enableRideWithoutLocationServices;
    }

    public final boolean component26() {
        return this.enableScanlessReservedRideStart;
    }

    public final boolean component27() {
        return this.enableScanlessRideStart;
    }

    public final boolean component28() {
        return this.enableScanlessRideStartScanner;
    }

    public final double component29() {
        return this.scanlessUpdateDistance;
    }

    public final long component3() {
        return this.parkingFinePrice;
    }

    public final double component30() {
        return this.scanlessRideBluetoothScanDuration;
    }

    public final boolean component31() {
        return this.enableScanlessRideBannerChirp;
    }

    public final int component32() {
        return this.scanlessRideBirdCacheExpirationTimeSeconds;
    }

    public final int component33() {
        return this.scanlessRideMaxApiScanLimit;
    }

    public final boolean component34() {
        return this.displayPartnerNameInRideReceipt;
    }

    public final String component35() {
        return this.supportContactNumber;
    }

    public final String component36() {
        return this.optionalLocalContactInfoTitle;
    }

    public final String component37() {
        return this.optionalLocalContactInfoNumber;
    }

    public final boolean component38() {
        return this.enableMultiModalMapPins;
    }

    public final boolean component39() {
        return this.enableMultiModalTutorialButton;
    }

    public final String component4() {
        return this.currency;
    }

    public final boolean component40() {
        return this.enableMultiModalTutorialSelection;
    }

    public final boolean component41() {
        return this.enableMapAreasByFleet;
    }

    public final boolean component42() {
        return this.enableDetailedVehicleInfo;
    }

    public final boolean component43() {
        return this.enableScannerCodeEntryV2;
    }

    public final int component44() {
        return this.maxBirdCodeLength;
    }

    public final int component45() {
        return this.minBirdCodeLength;
    }

    public final boolean component46() {
        return this.enableOutsideServiceAreaParkingTicket;
    }

    public final boolean component47() {
        return this.enableOutsideServiceAreaParkingTicketAcceptFine;
    }

    public final int component48() {
        return this.outsideServiceAreaParkingTicketAmount;
    }

    public final boolean component49() {
        return this.enableFreeUnlockAfterBadScan;
    }

    public final long component5() {
        return this.maximumFreeRideAmount;
    }

    public final boolean component50() {
        return this.enableFreeUnlockAfterCancelledRide;
    }

    public final boolean component51() {
        return this.enableFreeUnlockAfterLowBatteryRide;
    }

    public final List<String> component52() {
        return this.forceClientTracksByModel;
    }

    public final boolean component53() {
        return this.forceClientTracks;
    }

    public final boolean component54() {
        return this.enableChirpOnScanlessRideStart;
    }

    public final boolean component55() {
        return this.preferChirpAlarmOnScanlessRideStart;
    }

    public final boolean component56() {
        return this.enableScannerCodeEntryTooltip;
    }

    public final int component57() {
        return this.scannerCodeEntryTooltipMaxEntries;
    }

    public final int component58() {
        return this.scannerCodeEntryTooltipMaxViews;
    }

    public final int component59() {
        return this.scannerCodeEntryTooltipMaxDuration;
    }

    public final long component6() {
        return this.minimumUserBalance;
    }

    public final String component60() {
        return this.scannerCodeEntryTooltipLocalizedCopy;
    }

    public final boolean component61() {
        return this.showEndRideParkingRules;
    }

    public final boolean component62() {
        return this.enableVehicleTipUi;
    }

    public final boolean component63() {
        return this.useUpdatedSummaryFields;
    }

    public final boolean component64() {
        return this.disableEndRidePhotoMiddleIcon;
    }

    public final boolean component65() {
        return this.enableAndroidScanToRide;
    }

    public final int component66() {
        return this.maxRideDurationSecondsOutsideOperatingArea;
    }

    public final int component67() {
        return this.maxRideDurationSecondsNoRideZone;
    }

    public final boolean component68() {
        return this.enableRideStartOutsideOperatingArea;
    }

    public final boolean component69() {
        return this.enableRideStartNoRideZone;
    }

    public final String component7() {
        return this.autoPayExpName;
    }

    public final boolean component70() {
        return this.enableRideAccelerationRecording;
    }

    public final int component71() {
        return this.sensorSamplingPeriodUs;
    }

    public final int component72() {
        return this.accelerationSampleChunkDuration;
    }

    public final RideWarningConfig component73() {
        return this.warningConfig;
    }

    public final SmartlockRideConfig component74() {
        return this.smartlockConfig;
    }

    public final RideLocationMode component75() {
        return this.rideLocationMode;
    }

    public final boolean component76() {
        return this.filterNestsByBird;
    }

    public final boolean component77() {
        return this.mustParkInNest;
    }

    public final float component78() {
        return this.lockAckPollingIntervalSeconds;
    }

    public final boolean component79() {
        return this.bypassLockAckForBluetooth;
    }

    public final int component8() {
        return this.autoPayRefillAmount;
    }

    public final boolean component80() {
        return this.aggressiveEndRideLock;
    }

    public final SafeStartConfig component81() {
        return this.safeRideStart;
    }

    public final HelmetSelfieConfig component82() {
        return this.helmetSelfie;
    }

    public final EndRideConfig component83() {
        return this.endRide;
    }

    public final DisputeConfig component84() {
        return this.dispute;
    }

    public final int component85() {
        return this.minRiderAge;
    }

    public final boolean component86() {
        return this.enableShakeToReport;
    }

    public final Boolean component9() {
        return this.autoPayUseFullscreenFlow;
    }

    public final RideConfig copy(long j, long j2, long j3, String currency, long j4, long j5, String str, int i, Boolean bool, boolean z, int i2, int i3, boolean z2, List<AutoPayPlanConfig> list, long j6, String str2, boolean z3, boolean z4, String str3, long j7, int i4, String str4, AdditionalFeesConfig additionalFees, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, double d, double d2, boolean z10, int i5, int i6, boolean z11, String str5, String str6, String str7, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i7, int i8, boolean z18, boolean z19, int i9, boolean z20, boolean z21, boolean z22, List<String> forceClientTracksByModel, boolean z23, boolean z24, boolean z25, boolean z26, int i10, int i11, int i12, String str8, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, int i13, int i14, boolean z32, boolean z33, boolean z34, int i15, int i16, RideWarningConfig warningConfig, SmartlockRideConfig smartlockConfig, RideLocationMode rideLocationMode, boolean z35, boolean z36, float f, boolean z37, boolean z38, SafeStartConfig safeRideStart, HelmetSelfieConfig helmetSelfieConfig, EndRideConfig endRide, DisputeConfig dispute, int i17, boolean z39) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(additionalFees, "additionalFees");
        Intrinsics.checkNotNullParameter(forceClientTracksByModel, "forceClientTracksByModel");
        Intrinsics.checkNotNullParameter(warningConfig, "warningConfig");
        Intrinsics.checkNotNullParameter(smartlockConfig, "smartlockConfig");
        Intrinsics.checkNotNullParameter(rideLocationMode, "rideLocationMode");
        Intrinsics.checkNotNullParameter(safeRideStart, "safeRideStart");
        Intrinsics.checkNotNullParameter(endRide, "endRide");
        Intrinsics.checkNotNullParameter(dispute, "dispute");
        return new RideConfig(j, j2, j3, currency, j4, j5, str, i, bool, z, i2, i3, z2, list, j6, str2, z3, z4, str3, j7, i4, str4, additionalFees, z5, z6, z7, z8, z9, d, d2, z10, i5, i6, z11, str5, str6, str7, z12, z13, z14, z15, z16, z17, i7, i8, z18, z19, i9, z20, z21, z22, forceClientTracksByModel, z23, z24, z25, z26, i10, i11, i12, str8, z27, z28, z29, z30, z31, i13, i14, z32, z33, z34, i15, i16, warningConfig, smartlockConfig, rideLocationMode, z35, z36, f, z37, z38, safeRideStart, helmetSelfieConfig, endRide, dispute, i17, z39);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideConfig) {
            RideConfig rideConfig = (RideConfig) obj;
            return this.basePrice == rideConfig.basePrice && this.minutePrice == rideConfig.minutePrice && this.parkingFinePrice == rideConfig.parkingFinePrice && Intrinsics.areEqual(this.currency, rideConfig.currency) && this.maximumFreeRideAmount == rideConfig.maximumFreeRideAmount && this.minimumUserBalance == rideConfig.minimumUserBalance && Intrinsics.areEqual(this.autoPayExpName, rideConfig.autoPayExpName) && this.autoPayRefillAmount == rideConfig.autoPayRefillAmount && Intrinsics.areEqual(this.autoPayUseFullscreenFlow, rideConfig.autoPayUseFullscreenFlow) && this.autoPayPromptFirst == rideConfig.autoPayPromptFirst && this.autoPayStartAfterRideCount == rideConfig.autoPayStartAfterRideCount && this.autoPayNagEveryRideCount == rideConfig.autoPayNagEveryRideCount && this.autoPayMandatory == rideConfig.autoPayMandatory && Intrinsics.areEqual(this.autoPayPlans, rideConfig.autoPayPlans) && this.autoPayMandatoryMinBalance == rideConfig.autoPayMandatoryMinBalance && Intrinsics.areEqual(this.autoPayTitleOverride, rideConfig.autoPayTitleOverride) && this.enableSingleAuthForPositiveBalance == rideConfig.enableSingleAuthForPositiveBalance && this.showPriceChangeModalWithoutHistory == rideConfig.showPriceChangeModalWithoutHistory && Intrinsics.areEqual(this.priceChangeExpName, rideConfig.priceChangeExpName) && this.minimumRidePrice == rideConfig.minimumRidePrice && this.includedMinutes == rideConfig.includedMinutes && Intrinsics.areEqual(this.localizedDynamicPriceString, rideConfig.localizedDynamicPriceString) && Intrinsics.areEqual(this.additionalFees, rideConfig.additionalFees) && this.enableLocationOptOut == rideConfig.enableLocationOptOut && this.enableRideWithoutLocationServices == rideConfig.enableRideWithoutLocationServices && this.enableScanlessReservedRideStart == rideConfig.enableScanlessReservedRideStart && this.enableScanlessRideStart == rideConfig.enableScanlessRideStart && this.enableScanlessRideStartScanner == rideConfig.enableScanlessRideStartScanner && Double.compare(this.scanlessUpdateDistance, rideConfig.scanlessUpdateDistance) == 0 && Double.compare(this.scanlessRideBluetoothScanDuration, rideConfig.scanlessRideBluetoothScanDuration) == 0 && this.enableScanlessRideBannerChirp == rideConfig.enableScanlessRideBannerChirp && this.scanlessRideBirdCacheExpirationTimeSeconds == rideConfig.scanlessRideBirdCacheExpirationTimeSeconds && this.scanlessRideMaxApiScanLimit == rideConfig.scanlessRideMaxApiScanLimit && this.displayPartnerNameInRideReceipt == rideConfig.displayPartnerNameInRideReceipt && Intrinsics.areEqual(this.supportContactNumber, rideConfig.supportContactNumber) && Intrinsics.areEqual(this.optionalLocalContactInfoTitle, rideConfig.optionalLocalContactInfoTitle) && Intrinsics.areEqual(this.optionalLocalContactInfoNumber, rideConfig.optionalLocalContactInfoNumber) && this.enableMultiModalMapPins == rideConfig.enableMultiModalMapPins && this.enableMultiModalTutorialButton == rideConfig.enableMultiModalTutorialButton && this.enableMultiModalTutorialSelection == rideConfig.enableMultiModalTutorialSelection && this.enableMapAreasByFleet == rideConfig.enableMapAreasByFleet && this.enableDetailedVehicleInfo == rideConfig.enableDetailedVehicleInfo && this.enableScannerCodeEntryV2 == rideConfig.enableScannerCodeEntryV2 && this.maxBirdCodeLength == rideConfig.maxBirdCodeLength && this.minBirdCodeLength == rideConfig.minBirdCodeLength && this.enableOutsideServiceAreaParkingTicket == rideConfig.enableOutsideServiceAreaParkingTicket && this.enableOutsideServiceAreaParkingTicketAcceptFine == rideConfig.enableOutsideServiceAreaParkingTicketAcceptFine && this.outsideServiceAreaParkingTicketAmount == rideConfig.outsideServiceAreaParkingTicketAmount && this.enableFreeUnlockAfterBadScan == rideConfig.enableFreeUnlockAfterBadScan && this.enableFreeUnlockAfterCancelledRide == rideConfig.enableFreeUnlockAfterCancelledRide && this.enableFreeUnlockAfterLowBatteryRide == rideConfig.enableFreeUnlockAfterLowBatteryRide && Intrinsics.areEqual(this.forceClientTracksByModel, rideConfig.forceClientTracksByModel) && this.forceClientTracks == rideConfig.forceClientTracks && this.enableChirpOnScanlessRideStart == rideConfig.enableChirpOnScanlessRideStart && this.preferChirpAlarmOnScanlessRideStart == rideConfig.preferChirpAlarmOnScanlessRideStart && this.enableScannerCodeEntryTooltip == rideConfig.enableScannerCodeEntryTooltip && this.scannerCodeEntryTooltipMaxEntries == rideConfig.scannerCodeEntryTooltipMaxEntries && this.scannerCodeEntryTooltipMaxViews == rideConfig.scannerCodeEntryTooltipMaxViews && this.scannerCodeEntryTooltipMaxDuration == rideConfig.scannerCodeEntryTooltipMaxDuration && Intrinsics.areEqual(this.scannerCodeEntryTooltipLocalizedCopy, rideConfig.scannerCodeEntryTooltipLocalizedCopy) && this.showEndRideParkingRules == rideConfig.showEndRideParkingRules && this.enableVehicleTipUi == rideConfig.enableVehicleTipUi && this.useUpdatedSummaryFields == rideConfig.useUpdatedSummaryFields && this.disableEndRidePhotoMiddleIcon == rideConfig.disableEndRidePhotoMiddleIcon && this.enableAndroidScanToRide == rideConfig.enableAndroidScanToRide && this.maxRideDurationSecondsOutsideOperatingArea == rideConfig.maxRideDurationSecondsOutsideOperatingArea && this.maxRideDurationSecondsNoRideZone == rideConfig.maxRideDurationSecondsNoRideZone && this.enableRideStartOutsideOperatingArea == rideConfig.enableRideStartOutsideOperatingArea && this.enableRideStartNoRideZone == rideConfig.enableRideStartNoRideZone && this.enableRideAccelerationRecording == rideConfig.enableRideAccelerationRecording && this.sensorSamplingPeriodUs == rideConfig.sensorSamplingPeriodUs && this.accelerationSampleChunkDuration == rideConfig.accelerationSampleChunkDuration && Intrinsics.areEqual(this.warningConfig, rideConfig.warningConfig) && Intrinsics.areEqual(this.smartlockConfig, rideConfig.smartlockConfig) && this.rideLocationMode == rideConfig.rideLocationMode && this.filterNestsByBird == rideConfig.filterNestsByBird && this.mustParkInNest == rideConfig.mustParkInNest && Float.compare(this.lockAckPollingIntervalSeconds, rideConfig.lockAckPollingIntervalSeconds) == 0 && this.bypassLockAckForBluetooth == rideConfig.bypassLockAckForBluetooth && this.aggressiveEndRideLock == rideConfig.aggressiveEndRideLock && Intrinsics.areEqual(this.safeRideStart, rideConfig.safeRideStart) && Intrinsics.areEqual(this.helmetSelfie, rideConfig.helmetSelfie) && Intrinsics.areEqual(this.endRide, rideConfig.endRide) && Intrinsics.areEqual(this.dispute, rideConfig.dispute) && this.minRiderAge == rideConfig.minRiderAge && this.enableShakeToReport == rideConfig.enableShakeToReport;
        }
        return false;
    }

    public final int getAccelerationSampleChunkDuration() {
        return this.accelerationSampleChunkDuration;
    }

    public final AdditionalFeesConfig getAdditionalFees() {
        return this.additionalFees;
    }

    public final boolean getAggressiveEndRideLock() {
        return this.aggressiveEndRideLock;
    }

    public final String getAutoPayExpName() {
        return this.autoPayExpName;
    }

    public final boolean getAutoPayMandatory() {
        return this.autoPayMandatory;
    }

    public final long getAutoPayMandatoryMinBalance() {
        return this.autoPayMandatoryMinBalance;
    }

    public final int getAutoPayNagEveryRideCount() {
        return this.autoPayNagEveryRideCount;
    }

    public final List<AutoPayPlanConfig> getAutoPayPlans() {
        return this.autoPayPlans;
    }

    public final boolean getAutoPayPromptFirst() {
        return this.autoPayPromptFirst;
    }

    public final int getAutoPayRefillAmount() {
        return this.autoPayRefillAmount;
    }

    public final int getAutoPayStartAfterRideCount() {
        return this.autoPayStartAfterRideCount;
    }

    public final String getAutoPayTitleOverride() {
        return this.autoPayTitleOverride;
    }

    public final Boolean getAutoPayUseFullscreenFlow() {
        return this.autoPayUseFullscreenFlow;
    }

    public final long getBasePrice() {
        return this.basePrice;
    }

    public final boolean getBypassLockAckForBluetooth() {
        return this.bypassLockAckForBluetooth;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getDisableEndRidePhotoMiddleIcon() {
        return this.disableEndRidePhotoMiddleIcon;
    }

    public final boolean getDisplayPartnerNameInRideReceipt() {
        return this.displayPartnerNameInRideReceipt;
    }

    public final DisputeConfig getDispute() {
        return this.dispute;
    }

    public final boolean getEnableAndroidScanToRide() {
        return this.enableAndroidScanToRide;
    }

    public final boolean getEnableChirpOnScanlessRideStart() {
        return this.enableChirpOnScanlessRideStart;
    }

    public final boolean getEnableDetailedVehicleInfo() {
        return this.enableDetailedVehicleInfo;
    }

    public final boolean getEnableFreeUnlockAfterBadScan() {
        return this.enableFreeUnlockAfterBadScan;
    }

    public final boolean getEnableFreeUnlockAfterCancelledRide() {
        return this.enableFreeUnlockAfterCancelledRide;
    }

    public final boolean getEnableFreeUnlockAfterLowBatteryRide() {
        return this.enableFreeUnlockAfterLowBatteryRide;
    }

    public final boolean getEnableLocationOptOut() {
        return this.enableLocationOptOut;
    }

    public final boolean getEnableMapAreasByFleet() {
        return this.enableMapAreasByFleet;
    }

    public final boolean getEnableMultiModalMapPins() {
        return this.enableMultiModalMapPins;
    }

    public final boolean getEnableMultiModalTutorialButton() {
        return this.enableMultiModalTutorialButton;
    }

    public final boolean getEnableMultiModalTutorialSelection() {
        return this.enableMultiModalTutorialSelection;
    }

    public final boolean getEnableOutsideServiceAreaParkingTicket() {
        return this.enableOutsideServiceAreaParkingTicket;
    }

    public final boolean getEnableOutsideServiceAreaParkingTicketAcceptFine() {
        return this.enableOutsideServiceAreaParkingTicketAcceptFine;
    }

    public final boolean getEnableRideAccelerationRecording() {
        return this.enableRideAccelerationRecording;
    }

    public final boolean getEnableRideStartNoRideZone() {
        return this.enableRideStartNoRideZone;
    }

    public final boolean getEnableRideStartOutsideOperatingArea() {
        return this.enableRideStartOutsideOperatingArea;
    }

    public final boolean getEnableRideWithoutLocationServices() {
        return this.enableRideWithoutLocationServices;
    }

    public final boolean getEnableScanlessReservedRideStart() {
        return this.enableScanlessReservedRideStart;
    }

    public final boolean getEnableScanlessRideBannerChirp() {
        return this.enableScanlessRideBannerChirp;
    }

    public final boolean getEnableScanlessRideStart() {
        return this.enableScanlessRideStart;
    }

    public final boolean getEnableScanlessRideStartScanner() {
        return this.enableScanlessRideStartScanner;
    }

    public final boolean getEnableScannerCodeEntryTooltip() {
        return this.enableScannerCodeEntryTooltip;
    }

    public final boolean getEnableScannerCodeEntryV2() {
        return this.enableScannerCodeEntryV2;
    }

    public final boolean getEnableShakeToReport() {
        return this.enableShakeToReport;
    }

    public final boolean getEnableSingleAuthForPositiveBalance() {
        return this.enableSingleAuthForPositiveBalance;
    }

    public final boolean getEnableVehicleTipUi() {
        return this.enableVehicleTipUi;
    }

    public final EndRideConfig getEndRide() {
        return this.endRide;
    }

    public final boolean getFilterNestsByBird() {
        return this.filterNestsByBird;
    }

    public final boolean getForceClientTracks() {
        return this.forceClientTracks;
    }

    public final List<String> getForceClientTracksByModel() {
        return this.forceClientTracksByModel;
    }

    public final HelmetSelfieConfig getHelmetSelfie() {
        return this.helmetSelfie;
    }

    public final int getIncludedMinutes() {
        return this.includedMinutes;
    }

    public final String getLocalizedDynamicPriceString() {
        return this.localizedDynamicPriceString;
    }

    public final float getLockAckPollingIntervalSeconds() {
        return this.lockAckPollingIntervalSeconds;
    }

    public final int getMaxBirdCodeLength() {
        return this.maxBirdCodeLength;
    }

    public final int getMaxRideDurationSecondsNoRideZone() {
        return this.maxRideDurationSecondsNoRideZone;
    }

    public final int getMaxRideDurationSecondsOutsideOperatingArea() {
        return this.maxRideDurationSecondsOutsideOperatingArea;
    }

    public final long getMaximumFreeRideAmount() {
        return this.maximumFreeRideAmount;
    }

    public final int getMinBirdCodeLength() {
        return this.minBirdCodeLength;
    }

    public final int getMinRiderAge() {
        return this.minRiderAge;
    }

    public final long getMinimumRidePrice() {
        return this.minimumRidePrice;
    }

    public final long getMinimumUserBalance() {
        return this.minimumUserBalance;
    }

    public final long getMinutePrice() {
        return this.minutePrice;
    }

    public final boolean getMustParkInNest() {
        return this.mustParkInNest;
    }

    public final String getOptionalLocalContactInfoNumber() {
        return this.optionalLocalContactInfoNumber;
    }

    public final String getOptionalLocalContactInfoTitle() {
        return this.optionalLocalContactInfoTitle;
    }

    public final int getOutsideServiceAreaParkingTicketAmount() {
        return this.outsideServiceAreaParkingTicketAmount;
    }

    public final long getParkingFinePrice() {
        return this.parkingFinePrice;
    }

    public final boolean getPreferChirpAlarmOnScanlessRideStart() {
        return this.preferChirpAlarmOnScanlessRideStart;
    }

    public final String getPriceChangeExpName() {
        return this.priceChangeExpName;
    }

    public final RideLocationMode getRideLocationMode() {
        return this.rideLocationMode;
    }

    public final SafeStartConfig getSafeRideStart() {
        return this.safeRideStart;
    }

    public final int getScanlessRideBirdCacheExpirationTimeSeconds() {
        return this.scanlessRideBirdCacheExpirationTimeSeconds;
    }

    public final double getScanlessRideBluetoothScanDuration() {
        return this.scanlessRideBluetoothScanDuration;
    }

    public final int getScanlessRideMaxApiScanLimit() {
        return this.scanlessRideMaxApiScanLimit;
    }

    public final double getScanlessUpdateDistance() {
        return this.scanlessUpdateDistance;
    }

    public final String getScannerCodeEntryTooltipLocalizedCopy() {
        return this.scannerCodeEntryTooltipLocalizedCopy;
    }

    public final int getScannerCodeEntryTooltipMaxDuration() {
        return this.scannerCodeEntryTooltipMaxDuration;
    }

    public final int getScannerCodeEntryTooltipMaxEntries() {
        return this.scannerCodeEntryTooltipMaxEntries;
    }

    public final int getScannerCodeEntryTooltipMaxViews() {
        return this.scannerCodeEntryTooltipMaxViews;
    }

    public final int getSensorSamplingPeriodUs() {
        return this.sensorSamplingPeriodUs;
    }

    public final boolean getShowEndRideParkingRules() {
        return this.showEndRideParkingRules;
    }

    public final boolean getShowPriceChangeModalWithoutHistory() {
        return this.showPriceChangeModalWithoutHistory;
    }

    public final SmartlockRideConfig getSmartlockConfig() {
        return this.smartlockConfig;
    }

    public final String getSupportContactNumber() {
        return this.supportContactNumber;
    }

    public final boolean getUseUpdatedSummaryFields() {
        return this.useUpdatedSummaryFields;
    }

    public final RideWarningConfig getWarningConfig() {
        return this.warningConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((Long.hashCode(this.basePrice) * 31) + Long.hashCode(this.minutePrice)) * 31) + Long.hashCode(this.parkingFinePrice)) * 31) + this.currency.hashCode()) * 31) + Long.hashCode(this.maximumFreeRideAmount)) * 31) + Long.hashCode(this.minimumUserBalance)) * 31;
        String str = this.autoPayExpName;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.autoPayRefillAmount)) * 31;
        Boolean bool = this.autoPayUseFullscreenFlow;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.autoPayPromptFirst;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode4 = (((((hashCode3 + i) * 31) + Integer.hashCode(this.autoPayStartAfterRideCount)) * 31) + Integer.hashCode(this.autoPayNagEveryRideCount)) * 31;
        boolean z2 = this.autoPayMandatory;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode4 + i2) * 31;
        List<AutoPayPlanConfig> list = this.autoPayPlans;
        int hashCode5 = (((i3 + (list == null ? 0 : list.hashCode())) * 31) + Long.hashCode(this.autoPayMandatoryMinBalance)) * 31;
        String str2 = this.autoPayTitleOverride;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z3 = this.enableSingleAuthForPositiveBalance;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode6 + i4) * 31;
        boolean z4 = this.showPriceChangeModalWithoutHistory;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        String str3 = this.priceChangeExpName;
        int hashCode7 = (((((i7 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.minimumRidePrice)) * 31) + Integer.hashCode(this.includedMinutes)) * 31;
        String str4 = this.localizedDynamicPriceString;
        int hashCode8 = (((hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.additionalFees.hashCode()) * 31;
        boolean z5 = this.enableLocationOptOut;
        int i8 = z5;
        if (z5 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode8 + i8) * 31;
        boolean z6 = this.enableRideWithoutLocationServices;
        int i10 = z6;
        if (z6 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z7 = this.enableScanlessReservedRideStart;
        int i12 = z7;
        if (z7 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z8 = this.enableScanlessRideStart;
        int i14 = z8;
        if (z8 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z9 = this.enableScanlessRideStartScanner;
        int i16 = z9;
        if (z9 != 0) {
            i16 = 1;
        }
        int hashCode9 = (((((i15 + i16) * 31) + Double.hashCode(this.scanlessUpdateDistance)) * 31) + Double.hashCode(this.scanlessRideBluetoothScanDuration)) * 31;
        boolean z10 = this.enableScanlessRideBannerChirp;
        int i17 = z10;
        if (z10 != 0) {
            i17 = 1;
        }
        int hashCode10 = (((((hashCode9 + i17) * 31) + Integer.hashCode(this.scanlessRideBirdCacheExpirationTimeSeconds)) * 31) + Integer.hashCode(this.scanlessRideMaxApiScanLimit)) * 31;
        boolean z11 = this.displayPartnerNameInRideReceipt;
        int i18 = z11;
        if (z11 != 0) {
            i18 = 1;
        }
        int i19 = (hashCode10 + i18) * 31;
        String str5 = this.supportContactNumber;
        int hashCode11 = (i19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.optionalLocalContactInfoTitle;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.optionalLocalContactInfoNumber;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        boolean z12 = this.enableMultiModalMapPins;
        int i20 = z12;
        if (z12 != 0) {
            i20 = 1;
        }
        int i21 = (hashCode13 + i20) * 31;
        boolean z13 = this.enableMultiModalTutorialButton;
        int i22 = z13;
        if (z13 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        boolean z14 = this.enableMultiModalTutorialSelection;
        int i24 = z14;
        if (z14 != 0) {
            i24 = 1;
        }
        int i25 = (i23 + i24) * 31;
        boolean z15 = this.enableMapAreasByFleet;
        int i26 = z15;
        if (z15 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        boolean z16 = this.enableDetailedVehicleInfo;
        int i28 = z16;
        if (z16 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        boolean z17 = this.enableScannerCodeEntryV2;
        int i30 = z17;
        if (z17 != 0) {
            i30 = 1;
        }
        int hashCode14 = (((((i29 + i30) * 31) + Integer.hashCode(this.maxBirdCodeLength)) * 31) + Integer.hashCode(this.minBirdCodeLength)) * 31;
        boolean z18 = this.enableOutsideServiceAreaParkingTicket;
        int i31 = z18;
        if (z18 != 0) {
            i31 = 1;
        }
        int i32 = (hashCode14 + i31) * 31;
        boolean z19 = this.enableOutsideServiceAreaParkingTicketAcceptFine;
        int i33 = z19;
        if (z19 != 0) {
            i33 = 1;
        }
        int hashCode15 = (((i32 + i33) * 31) + Integer.hashCode(this.outsideServiceAreaParkingTicketAmount)) * 31;
        boolean z20 = this.enableFreeUnlockAfterBadScan;
        int i34 = z20;
        if (z20 != 0) {
            i34 = 1;
        }
        int i35 = (hashCode15 + i34) * 31;
        boolean z21 = this.enableFreeUnlockAfterCancelledRide;
        int i36 = z21;
        if (z21 != 0) {
            i36 = 1;
        }
        int i37 = (i35 + i36) * 31;
        boolean z22 = this.enableFreeUnlockAfterLowBatteryRide;
        int i38 = z22;
        if (z22 != 0) {
            i38 = 1;
        }
        int hashCode16 = (((i37 + i38) * 31) + this.forceClientTracksByModel.hashCode()) * 31;
        boolean z23 = this.forceClientTracks;
        int i39 = z23;
        if (z23 != 0) {
            i39 = 1;
        }
        int i40 = (hashCode16 + i39) * 31;
        boolean z24 = this.enableChirpOnScanlessRideStart;
        int i41 = z24;
        if (z24 != 0) {
            i41 = 1;
        }
        int i42 = (i40 + i41) * 31;
        boolean z25 = this.preferChirpAlarmOnScanlessRideStart;
        int i43 = z25;
        if (z25 != 0) {
            i43 = 1;
        }
        int i44 = (i42 + i43) * 31;
        boolean z26 = this.enableScannerCodeEntryTooltip;
        int i45 = z26;
        if (z26 != 0) {
            i45 = 1;
        }
        int hashCode17 = (((((((i44 + i45) * 31) + Integer.hashCode(this.scannerCodeEntryTooltipMaxEntries)) * 31) + Integer.hashCode(this.scannerCodeEntryTooltipMaxViews)) * 31) + Integer.hashCode(this.scannerCodeEntryTooltipMaxDuration)) * 31;
        String str8 = this.scannerCodeEntryTooltipLocalizedCopy;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        boolean z27 = this.showEndRideParkingRules;
        int i46 = z27;
        if (z27 != 0) {
            i46 = 1;
        }
        int i47 = (hashCode18 + i46) * 31;
        boolean z28 = this.enableVehicleTipUi;
        int i48 = z28;
        if (z28 != 0) {
            i48 = 1;
        }
        int i49 = (i47 + i48) * 31;
        boolean z29 = this.useUpdatedSummaryFields;
        int i50 = z29;
        if (z29 != 0) {
            i50 = 1;
        }
        int i51 = (i49 + i50) * 31;
        boolean z30 = this.disableEndRidePhotoMiddleIcon;
        int i52 = z30;
        if (z30 != 0) {
            i52 = 1;
        }
        int i53 = (i51 + i52) * 31;
        boolean z31 = this.enableAndroidScanToRide;
        int i54 = z31;
        if (z31 != 0) {
            i54 = 1;
        }
        int hashCode19 = (((((i53 + i54) * 31) + Integer.hashCode(this.maxRideDurationSecondsOutsideOperatingArea)) * 31) + Integer.hashCode(this.maxRideDurationSecondsNoRideZone)) * 31;
        boolean z32 = this.enableRideStartOutsideOperatingArea;
        int i55 = z32;
        if (z32 != 0) {
            i55 = 1;
        }
        int i56 = (hashCode19 + i55) * 31;
        boolean z33 = this.enableRideStartNoRideZone;
        int i57 = z33;
        if (z33 != 0) {
            i57 = 1;
        }
        int i58 = (i56 + i57) * 31;
        boolean z34 = this.enableRideAccelerationRecording;
        int i59 = z34;
        if (z34 != 0) {
            i59 = 1;
        }
        int hashCode20 = (((((((((((i58 + i59) * 31) + Integer.hashCode(this.sensorSamplingPeriodUs)) * 31) + Integer.hashCode(this.accelerationSampleChunkDuration)) * 31) + this.warningConfig.hashCode()) * 31) + this.smartlockConfig.hashCode()) * 31) + this.rideLocationMode.hashCode()) * 31;
        boolean z35 = this.filterNestsByBird;
        int i60 = z35;
        if (z35 != 0) {
            i60 = 1;
        }
        int i61 = (hashCode20 + i60) * 31;
        boolean z36 = this.mustParkInNest;
        int i62 = z36;
        if (z36 != 0) {
            i62 = 1;
        }
        int hashCode21 = (((i61 + i62) * 31) + Float.hashCode(this.lockAckPollingIntervalSeconds)) * 31;
        boolean z37 = this.bypassLockAckForBluetooth;
        int i63 = z37;
        if (z37 != 0) {
            i63 = 1;
        }
        int i64 = (hashCode21 + i63) * 31;
        boolean z38 = this.aggressiveEndRideLock;
        int i65 = z38;
        if (z38 != 0) {
            i65 = 1;
        }
        int hashCode22 = (((i64 + i65) * 31) + this.safeRideStart.hashCode()) * 31;
        HelmetSelfieConfig helmetSelfieConfig = this.helmetSelfie;
        int hashCode23 = (((((((hashCode22 + (helmetSelfieConfig != null ? helmetSelfieConfig.hashCode() : 0)) * 31) + this.endRide.hashCode()) * 31) + this.dispute.hashCode()) * 31) + Integer.hashCode(this.minRiderAge)) * 31;
        boolean z39 = this.enableShakeToReport;
        return hashCode23 + (z39 ? 1 : z39 ? 1 : 0);
    }

    public String toString() {
        long j = this.basePrice;
        long j2 = this.minutePrice;
        long j3 = this.parkingFinePrice;
        String str = this.currency;
        long j4 = this.maximumFreeRideAmount;
        long j5 = this.minimumUserBalance;
        String str2 = this.autoPayExpName;
        int i = this.autoPayRefillAmount;
        Boolean bool = this.autoPayUseFullscreenFlow;
        boolean z = this.autoPayPromptFirst;
        int i2 = this.autoPayStartAfterRideCount;
        int i3 = this.autoPayNagEveryRideCount;
        boolean z2 = this.autoPayMandatory;
        List<AutoPayPlanConfig> list = this.autoPayPlans;
        long j6 = this.autoPayMandatoryMinBalance;
        String str3 = this.autoPayTitleOverride;
        boolean z3 = this.enableSingleAuthForPositiveBalance;
        boolean z4 = this.showPriceChangeModalWithoutHistory;
        String str4 = this.priceChangeExpName;
        long j7 = this.minimumRidePrice;
        int i4 = this.includedMinutes;
        String str5 = this.localizedDynamicPriceString;
        AdditionalFeesConfig additionalFeesConfig = this.additionalFees;
        boolean z5 = this.enableLocationOptOut;
        boolean z6 = this.enableRideWithoutLocationServices;
        boolean z7 = this.enableScanlessReservedRideStart;
        boolean z8 = this.enableScanlessRideStart;
        boolean z9 = this.enableScanlessRideStartScanner;
        double d = this.scanlessUpdateDistance;
        double d2 = this.scanlessRideBluetoothScanDuration;
        boolean z10 = this.enableScanlessRideBannerChirp;
        int i5 = this.scanlessRideBirdCacheExpirationTimeSeconds;
        int i6 = this.scanlessRideMaxApiScanLimit;
        boolean z11 = this.displayPartnerNameInRideReceipt;
        String str6 = this.supportContactNumber;
        String str7 = this.optionalLocalContactInfoTitle;
        String str8 = this.optionalLocalContactInfoNumber;
        boolean z12 = this.enableMultiModalMapPins;
        boolean z13 = this.enableMultiModalTutorialButton;
        boolean z14 = this.enableMultiModalTutorialSelection;
        boolean z15 = this.enableMapAreasByFleet;
        boolean z16 = this.enableDetailedVehicleInfo;
        boolean z17 = this.enableScannerCodeEntryV2;
        int i7 = this.maxBirdCodeLength;
        int i8 = this.minBirdCodeLength;
        boolean z18 = this.enableOutsideServiceAreaParkingTicket;
        boolean z19 = this.enableOutsideServiceAreaParkingTicketAcceptFine;
        int i9 = this.outsideServiceAreaParkingTicketAmount;
        boolean z20 = this.enableFreeUnlockAfterBadScan;
        boolean z21 = this.enableFreeUnlockAfterCancelledRide;
        boolean z22 = this.enableFreeUnlockAfterLowBatteryRide;
        List<String> list2 = this.forceClientTracksByModel;
        boolean z23 = this.forceClientTracks;
        boolean z24 = this.enableChirpOnScanlessRideStart;
        boolean z25 = this.preferChirpAlarmOnScanlessRideStart;
        boolean z26 = this.enableScannerCodeEntryTooltip;
        int i10 = this.scannerCodeEntryTooltipMaxEntries;
        int i11 = this.scannerCodeEntryTooltipMaxViews;
        int i12 = this.scannerCodeEntryTooltipMaxDuration;
        String str9 = this.scannerCodeEntryTooltipLocalizedCopy;
        boolean z27 = this.showEndRideParkingRules;
        boolean z28 = this.enableVehicleTipUi;
        boolean z29 = this.useUpdatedSummaryFields;
        boolean z30 = this.disableEndRidePhotoMiddleIcon;
        boolean z31 = this.enableAndroidScanToRide;
        int i13 = this.maxRideDurationSecondsOutsideOperatingArea;
        int i14 = this.maxRideDurationSecondsNoRideZone;
        boolean z32 = this.enableRideStartOutsideOperatingArea;
        boolean z33 = this.enableRideStartNoRideZone;
        boolean z34 = this.enableRideAccelerationRecording;
        int i15 = this.sensorSamplingPeriodUs;
        int i16 = this.accelerationSampleChunkDuration;
        RideWarningConfig rideWarningConfig = this.warningConfig;
        SmartlockRideConfig smartlockRideConfig = this.smartlockConfig;
        RideLocationMode rideLocationMode = this.rideLocationMode;
        boolean z35 = this.filterNestsByBird;
        boolean z36 = this.mustParkInNest;
        float f = this.lockAckPollingIntervalSeconds;
        boolean z37 = this.bypassLockAckForBluetooth;
        boolean z38 = this.aggressiveEndRideLock;
        SafeStartConfig safeStartConfig = this.safeRideStart;
        HelmetSelfieConfig helmetSelfieConfig = this.helmetSelfie;
        EndRideConfig endRideConfig = this.endRide;
        DisputeConfig disputeConfig = this.dispute;
        int i17 = this.minRiderAge;
        boolean z39 = this.enableShakeToReport;
        return "RideConfig(basePrice=" + j + ", minutePrice=" + j2 + ", parkingFinePrice=" + j3 + ", currency=" + str + ", maximumFreeRideAmount=" + j4 + ", minimumUserBalance=" + j5 + ", autoPayExpName=" + str2 + ", autoPayRefillAmount=" + i + ", autoPayUseFullscreenFlow=" + bool + ", autoPayPromptFirst=" + z + ", autoPayStartAfterRideCount=" + i2 + ", autoPayNagEveryRideCount=" + i3 + ", autoPayMandatory=" + z2 + ", autoPayPlans=" + list + ", autoPayMandatoryMinBalance=" + j6 + ", autoPayTitleOverride=" + str3 + ", enableSingleAuthForPositiveBalance=" + z3 + ", showPriceChangeModalWithoutHistory=" + z4 + ", priceChangeExpName=" + str4 + ", minimumRidePrice=" + j7 + ", includedMinutes=" + i4 + ", localizedDynamicPriceString=" + str5 + ", additionalFees=" + additionalFeesConfig + ", enableLocationOptOut=" + z5 + ", enableRideWithoutLocationServices=" + z6 + ", enableScanlessReservedRideStart=" + z7 + ", enableScanlessRideStart=" + z8 + ", enableScanlessRideStartScanner=" + z9 + ", scanlessUpdateDistance=" + d + ", scanlessRideBluetoothScanDuration=" + d2 + ", enableScanlessRideBannerChirp=" + z10 + ", scanlessRideBirdCacheExpirationTimeSeconds=" + i5 + ", scanlessRideMaxApiScanLimit=" + i6 + ", displayPartnerNameInRideReceipt=" + z11 + ", supportContactNumber=" + str6 + ", optionalLocalContactInfoTitle=" + str7 + ", optionalLocalContactInfoNumber=" + str8 + ", enableMultiModalMapPins=" + z12 + ", enableMultiModalTutorialButton=" + z13 + ", enableMultiModalTutorialSelection=" + z14 + ", enableMapAreasByFleet=" + z15 + ", enableDetailedVehicleInfo=" + z16 + ", enableScannerCodeEntryV2=" + z17 + ", maxBirdCodeLength=" + i7 + ", minBirdCodeLength=" + i8 + ", enableOutsideServiceAreaParkingTicket=" + z18 + ", enableOutsideServiceAreaParkingTicketAcceptFine=" + z19 + ", outsideServiceAreaParkingTicketAmount=" + i9 + ", enableFreeUnlockAfterBadScan=" + z20 + ", enableFreeUnlockAfterCancelledRide=" + z21 + ", enableFreeUnlockAfterLowBatteryRide=" + z22 + ", forceClientTracksByModel=" + list2 + ", forceClientTracks=" + z23 + ", enableChirpOnScanlessRideStart=" + z24 + ", preferChirpAlarmOnScanlessRideStart=" + z25 + ", enableScannerCodeEntryTooltip=" + z26 + ", scannerCodeEntryTooltipMaxEntries=" + i10 + ", scannerCodeEntryTooltipMaxViews=" + i11 + ", scannerCodeEntryTooltipMaxDuration=" + i12 + ", scannerCodeEntryTooltipLocalizedCopy=" + str9 + ", showEndRideParkingRules=" + z27 + ", enableVehicleTipUi=" + z28 + ", useUpdatedSummaryFields=" + z29 + ", disableEndRidePhotoMiddleIcon=" + z30 + ", enableAndroidScanToRide=" + z31 + ", maxRideDurationSecondsOutsideOperatingArea=" + i13 + ", maxRideDurationSecondsNoRideZone=" + i14 + ", enableRideStartOutsideOperatingArea=" + z32 + ", enableRideStartNoRideZone=" + z33 + ", enableRideAccelerationRecording=" + z34 + ", sensorSamplingPeriodUs=" + i15 + ", accelerationSampleChunkDuration=" + i16 + ", warningConfig=" + rideWarningConfig + ", smartlockConfig=" + smartlockRideConfig + ", rideLocationMode=" + rideLocationMode + ", filterNestsByBird=" + z35 + ", mustParkInNest=" + z36 + ", lockAckPollingIntervalSeconds=" + f + ", bypassLockAckForBluetooth=" + z37 + ", aggressiveEndRideLock=" + z38 + ", safeRideStart=" + safeStartConfig + ", helmetSelfie=" + helmetSelfieConfig + ", endRide=" + endRideConfig + ", dispute=" + disputeConfig + ", minRiderAge=" + i17 + ", enableShakeToReport=" + z39 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeLong(this.basePrice);
        out.writeLong(this.minutePrice);
        out.writeLong(this.parkingFinePrice);
        out.writeString(this.currency);
        out.writeLong(this.maximumFreeRideAmount);
        out.writeLong(this.minimumUserBalance);
        out.writeString(this.autoPayExpName);
        out.writeInt(this.autoPayRefillAmount);
        Boolean bool = this.autoPayUseFullscreenFlow;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeInt(this.autoPayPromptFirst ? 1 : 0);
        out.writeInt(this.autoPayStartAfterRideCount);
        out.writeInt(this.autoPayNagEveryRideCount);
        out.writeInt(this.autoPayMandatory ? 1 : 0);
        List<AutoPayPlanConfig> list = this.autoPayPlans;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (AutoPayPlanConfig autoPayPlanConfig : list) {
                autoPayPlanConfig.writeToParcel(out, i);
            }
        }
        out.writeLong(this.autoPayMandatoryMinBalance);
        out.writeString(this.autoPayTitleOverride);
        out.writeInt(this.enableSingleAuthForPositiveBalance ? 1 : 0);
        out.writeInt(this.showPriceChangeModalWithoutHistory ? 1 : 0);
        out.writeString(this.priceChangeExpName);
        out.writeLong(this.minimumRidePrice);
        out.writeInt(this.includedMinutes);
        out.writeString(this.localizedDynamicPriceString);
        this.additionalFees.writeToParcel(out, i);
        out.writeInt(this.enableLocationOptOut ? 1 : 0);
        out.writeInt(this.enableRideWithoutLocationServices ? 1 : 0);
        out.writeInt(this.enableScanlessReservedRideStart ? 1 : 0);
        out.writeInt(this.enableScanlessRideStart ? 1 : 0);
        out.writeInt(this.enableScanlessRideStartScanner ? 1 : 0);
        out.writeDouble(this.scanlessUpdateDistance);
        out.writeDouble(this.scanlessRideBluetoothScanDuration);
        out.writeInt(this.enableScanlessRideBannerChirp ? 1 : 0);
        out.writeInt(this.scanlessRideBirdCacheExpirationTimeSeconds);
        out.writeInt(this.scanlessRideMaxApiScanLimit);
        out.writeInt(this.displayPartnerNameInRideReceipt ? 1 : 0);
        out.writeString(this.supportContactNumber);
        out.writeString(this.optionalLocalContactInfoTitle);
        out.writeString(this.optionalLocalContactInfoNumber);
        out.writeInt(this.enableMultiModalMapPins ? 1 : 0);
        out.writeInt(this.enableMultiModalTutorialButton ? 1 : 0);
        out.writeInt(this.enableMultiModalTutorialSelection ? 1 : 0);
        out.writeInt(this.enableMapAreasByFleet ? 1 : 0);
        out.writeInt(this.enableDetailedVehicleInfo ? 1 : 0);
        out.writeInt(this.enableScannerCodeEntryV2 ? 1 : 0);
        out.writeInt(this.maxBirdCodeLength);
        out.writeInt(this.minBirdCodeLength);
        out.writeInt(this.enableOutsideServiceAreaParkingTicket ? 1 : 0);
        out.writeInt(this.enableOutsideServiceAreaParkingTicketAcceptFine ? 1 : 0);
        out.writeInt(this.outsideServiceAreaParkingTicketAmount);
        out.writeInt(this.enableFreeUnlockAfterBadScan ? 1 : 0);
        out.writeInt(this.enableFreeUnlockAfterCancelledRide ? 1 : 0);
        out.writeInt(this.enableFreeUnlockAfterLowBatteryRide ? 1 : 0);
        out.writeStringList(this.forceClientTracksByModel);
        out.writeInt(this.forceClientTracks ? 1 : 0);
        out.writeInt(this.enableChirpOnScanlessRideStart ? 1 : 0);
        out.writeInt(this.preferChirpAlarmOnScanlessRideStart ? 1 : 0);
        out.writeInt(this.enableScannerCodeEntryTooltip ? 1 : 0);
        out.writeInt(this.scannerCodeEntryTooltipMaxEntries);
        out.writeInt(this.scannerCodeEntryTooltipMaxViews);
        out.writeInt(this.scannerCodeEntryTooltipMaxDuration);
        out.writeString(this.scannerCodeEntryTooltipLocalizedCopy);
        out.writeInt(this.showEndRideParkingRules ? 1 : 0);
        out.writeInt(this.enableVehicleTipUi ? 1 : 0);
        out.writeInt(this.useUpdatedSummaryFields ? 1 : 0);
        out.writeInt(this.disableEndRidePhotoMiddleIcon ? 1 : 0);
        out.writeInt(this.enableAndroidScanToRide ? 1 : 0);
        out.writeInt(this.maxRideDurationSecondsOutsideOperatingArea);
        out.writeInt(this.maxRideDurationSecondsNoRideZone);
        out.writeInt(this.enableRideStartOutsideOperatingArea ? 1 : 0);
        out.writeInt(this.enableRideStartNoRideZone ? 1 : 0);
        out.writeInt(this.enableRideAccelerationRecording ? 1 : 0);
        out.writeInt(this.sensorSamplingPeriodUs);
        out.writeInt(this.accelerationSampleChunkDuration);
        this.warningConfig.writeToParcel(out, i);
        this.smartlockConfig.writeToParcel(out, i);
        out.writeString(this.rideLocationMode.name());
        out.writeInt(this.filterNestsByBird ? 1 : 0);
        out.writeInt(this.mustParkInNest ? 1 : 0);
        out.writeFloat(this.lockAckPollingIntervalSeconds);
        out.writeInt(this.bypassLockAckForBluetooth ? 1 : 0);
        out.writeInt(this.aggressiveEndRideLock ? 1 : 0);
        this.safeRideStart.writeToParcel(out, i);
        HelmetSelfieConfig helmetSelfieConfig = this.helmetSelfie;
        if (helmetSelfieConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            helmetSelfieConfig.writeToParcel(out, i);
        }
        this.endRide.writeToParcel(out, i);
        this.dispute.writeToParcel(out, i);
        out.writeInt(this.minRiderAge);
        out.writeInt(this.enableShakeToReport ? 1 : 0);
    }

    public RideConfig(long j, long j2, long j3, String currency, long j4, long j5, String str, int i, Boolean bool, boolean z, int i2, int i3, boolean z2, List<AutoPayPlanConfig> list, long j6, String str2, boolean z3, boolean z4, String str3, long j7, int i4, String str4, AdditionalFeesConfig additionalFees, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, double d, double d2, boolean z10, int i5, int i6, boolean z11, String str5, String str6, String str7, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i7, int i8, boolean z18, boolean z19, int i9, boolean z20, boolean z21, boolean z22, List<String> forceClientTracksByModel, boolean z23, boolean z24, boolean z25, boolean z26, int i10, int i11, int i12, String str8, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, int i13, int i14, boolean z32, boolean z33, boolean z34, int i15, int i16, RideWarningConfig warningConfig, SmartlockRideConfig smartlockConfig, RideLocationMode rideLocationMode, boolean z35, boolean z36, float f, boolean z37, boolean z38, SafeStartConfig safeRideStart, HelmetSelfieConfig helmetSelfieConfig, EndRideConfig endRide, DisputeConfig dispute, int i17, boolean z39) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(additionalFees, "additionalFees");
        Intrinsics.checkNotNullParameter(forceClientTracksByModel, "forceClientTracksByModel");
        Intrinsics.checkNotNullParameter(warningConfig, "warningConfig");
        Intrinsics.checkNotNullParameter(smartlockConfig, "smartlockConfig");
        Intrinsics.checkNotNullParameter(rideLocationMode, "rideLocationMode");
        Intrinsics.checkNotNullParameter(safeRideStart, "safeRideStart");
        Intrinsics.checkNotNullParameter(endRide, "endRide");
        Intrinsics.checkNotNullParameter(dispute, "dispute");
        this.basePrice = j;
        this.minutePrice = j2;
        this.parkingFinePrice = j3;
        this.currency = currency;
        this.maximumFreeRideAmount = j4;
        this.minimumUserBalance = j5;
        this.autoPayExpName = str;
        this.autoPayRefillAmount = i;
        this.autoPayUseFullscreenFlow = bool;
        this.autoPayPromptFirst = z;
        this.autoPayStartAfterRideCount = i2;
        this.autoPayNagEveryRideCount = i3;
        this.autoPayMandatory = z2;
        this.autoPayPlans = list;
        this.autoPayMandatoryMinBalance = j6;
        this.autoPayTitleOverride = str2;
        this.enableSingleAuthForPositiveBalance = z3;
        this.showPriceChangeModalWithoutHistory = z4;
        this.priceChangeExpName = str3;
        this.minimumRidePrice = j7;
        this.includedMinutes = i4;
        this.localizedDynamicPriceString = str4;
        this.additionalFees = additionalFees;
        this.enableLocationOptOut = z5;
        this.enableRideWithoutLocationServices = z6;
        this.enableScanlessReservedRideStart = z7;
        this.enableScanlessRideStart = z8;
        this.enableScanlessRideStartScanner = z9;
        this.scanlessUpdateDistance = d;
        this.scanlessRideBluetoothScanDuration = d2;
        this.enableScanlessRideBannerChirp = z10;
        this.scanlessRideBirdCacheExpirationTimeSeconds = i5;
        this.scanlessRideMaxApiScanLimit = i6;
        this.displayPartnerNameInRideReceipt = z11;
        this.supportContactNumber = str5;
        this.optionalLocalContactInfoTitle = str6;
        this.optionalLocalContactInfoNumber = str7;
        this.enableMultiModalMapPins = z12;
        this.enableMultiModalTutorialButton = z13;
        this.enableMultiModalTutorialSelection = z14;
        this.enableMapAreasByFleet = z15;
        this.enableDetailedVehicleInfo = z16;
        this.enableScannerCodeEntryV2 = z17;
        this.maxBirdCodeLength = i7;
        this.minBirdCodeLength = i8;
        this.enableOutsideServiceAreaParkingTicket = z18;
        this.enableOutsideServiceAreaParkingTicketAcceptFine = z19;
        this.outsideServiceAreaParkingTicketAmount = i9;
        this.enableFreeUnlockAfterBadScan = z20;
        this.enableFreeUnlockAfterCancelledRide = z21;
        this.enableFreeUnlockAfterLowBatteryRide = z22;
        this.forceClientTracksByModel = forceClientTracksByModel;
        this.forceClientTracks = z23;
        this.enableChirpOnScanlessRideStart = z24;
        this.preferChirpAlarmOnScanlessRideStart = z25;
        this.enableScannerCodeEntryTooltip = z26;
        this.scannerCodeEntryTooltipMaxEntries = i10;
        this.scannerCodeEntryTooltipMaxViews = i11;
        this.scannerCodeEntryTooltipMaxDuration = i12;
        this.scannerCodeEntryTooltipLocalizedCopy = str8;
        this.showEndRideParkingRules = z27;
        this.enableVehicleTipUi = z28;
        this.useUpdatedSummaryFields = z29;
        this.disableEndRidePhotoMiddleIcon = z30;
        this.enableAndroidScanToRide = z31;
        this.maxRideDurationSecondsOutsideOperatingArea = i13;
        this.maxRideDurationSecondsNoRideZone = i14;
        this.enableRideStartOutsideOperatingArea = z32;
        this.enableRideStartNoRideZone = z33;
        this.enableRideAccelerationRecording = z34;
        this.sensorSamplingPeriodUs = i15;
        this.accelerationSampleChunkDuration = i16;
        this.warningConfig = warningConfig;
        this.smartlockConfig = smartlockConfig;
        this.rideLocationMode = rideLocationMode;
        this.filterNestsByBird = z35;
        this.mustParkInNest = z36;
        this.lockAckPollingIntervalSeconds = f;
        this.bypassLockAckForBluetooth = z37;
        this.aggressiveEndRideLock = z38;
        this.safeRideStart = safeRideStart;
        this.helmetSelfie = helmetSelfieConfig;
        this.endRide = endRide;
        this.dispute = dispute;
        this.minRiderAge = i17;
        this.enableShakeToReport = z39;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RideConfig(long j, long j2, long j3, String str, long j4, long j5, String str2, int i, Boolean bool, boolean z, int i2, int i3, boolean z2, List list, long j6, String str3, boolean z3, boolean z4, String str4, long j7, int i4, String str5, AdditionalFeesConfig additionalFeesConfig, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, double d, double d2, boolean z10, int i5, int i6, boolean z11, String str6, String str7, String str8, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i7, int i8, boolean z18, boolean z19, int i9, boolean z20, boolean z21, boolean z22, List list2, boolean z23, boolean z24, boolean z25, boolean z26, int i10, int i11, int i12, String str9, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, int i13, int i14, boolean z32, boolean z33, boolean z34, int i15, int i16, RideWarningConfig rideWarningConfig, SmartlockRideConfig smartlockRideConfig, RideLocationMode rideLocationMode, boolean z35, boolean z36, float f, boolean z37, boolean z38, SafeStartConfig safeStartConfig, HelmetSelfieConfig helmetSelfieConfig, EndRideConfig endRideConfig, DisputeConfig disputeConfig, int i17, boolean z39, int i18, int i19, int i20, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r5, r7, r9, r10, r37, r201, r36, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r30, r32, r34, r35, r15, r12, r93, r39, r40, r41, r42, r44, r46, r92, r47, r48, r49, r50, r51, r52, r53, r198, r54, r55, r56, r57, r58, r59, r91, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r199, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r25, r90, r1, r29, r27, r13, (1048576 & i20) != 0 ? 18 : i17, (i20 & 2097152) != 0 ? true : z39);
        long j8;
        int i21;
        AdditionalFeesConfig additionalFeesConfig2;
        int i22;
        boolean z40;
        boolean z41;
        boolean z42;
        SafeStartConfig safeStartConfig2;
        HelmetSelfieConfig helmetSelfieConfig2;
        EndRideConfig endRideConfig2;
        DisputeConfig disputeConfig2;
        long j9 = (i18 & 1) != 0 ? 100L : j;
        long j10 = (i18 & 2) != 0 ? 15L : j2;
        long j11 = (i18 & 4) != 0 ? 1000L : j3;
        String str10 = (i18 & 8) != 0 ? Source.USD : str;
        long j12 = (i18 & 16) != 0 ? 500L : j4;
        long j13 = (i18 & 32) != 0 ? -100L : j5;
        String str11 = (i18 & 64) != 0 ? null : str2;
        int i23 = (i18 & 128) != 0 ? 0 : i;
        Boolean bool2 = (i18 & 256) != 0 ? null : bool;
        boolean z43 = (i18 & 512) != 0 ? false : z;
        int i24 = (i18 & 1024) != 0 ? -1 : i2;
        int i25 = (i18 & 2048) != 0 ? 0 : i3;
        boolean z44 = (i18 & 4096) != 0 ? false : z2;
        List list3 = (i18 & 8192) != 0 ? null : list;
        long j14 = (i18 & 16384) != 0 ? 0L : j6;
        String str12 = (i18 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : str3;
        boolean z45 = (i18 & 65536) != 0 ? true : z3;
        boolean z46 = (i18 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? false : z4;
        String str13 = (i18 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : str4;
        long j15 = (i18 & 524288) != 0 ? 0L : j7;
        int i26 = (i18 & 1048576) != 0 ? 0 : i4;
        String str14 = (i18 & 2097152) != 0 ? null : str5;
        if ((i18 & 4194304) != 0) {
            i21 = i23;
            j8 = j13;
            additionalFeesConfig2 = new AdditionalFeesConfig(false, 1, null);
        } else {
            j8 = j13;
            i21 = i23;
            additionalFeesConfig2 = additionalFeesConfig;
        }
        boolean z47 = (8388608 & i18) != 0 ? false : z5;
        boolean z48 = (16777216 & i18) != 0 ? false : z6;
        boolean z49 = (i18 & 33554432) != 0 ? false : z7;
        boolean z50 = (i18 & 67108864) != 0 ? false : z8;
        boolean z51 = (i18 & 134217728) != 0 ? false : z9;
        double d3 = (i18 & 268435456) != 0 ? 25.0d : d;
        double d4 = (i18 & 536870912) != 0 ? 2.0d : d2;
        boolean z52 = (i18 & 1073741824) != 0 ? true : z10;
        int i27 = (i18 & Integer.MIN_VALUE) != 0 ? 300 : i5;
        int i28 = (i19 & 1) != 0 ? 5 : i6;
        boolean z53 = (i19 & 2) != 0 ? false : z11;
        String str15 = (i19 & 4) != 0 ? null : str6;
        String str16 = (i19 & 8) != 0 ? null : str7;
        String str17 = (i19 & 16) != 0 ? null : str8;
        boolean z54 = (i19 & 32) != 0 ? false : z12;
        boolean z55 = (i19 & 64) != 0 ? false : z13;
        boolean z56 = (i19 & 128) != 0 ? false : z14;
        boolean z57 = (i19 & 256) != 0 ? false : z15;
        boolean z58 = (i19 & 512) != 0 ? false : z16;
        boolean z59 = (i19 & 1024) != 0 ? false : z17;
        int i29 = (i19 & 2048) != 0 ? 5 : i7;
        int i30 = (i19 & 4096) != 0 ? 4 : i8;
        boolean z60 = (i19 & 8192) != 0 ? false : z18;
        boolean z61 = (i19 & 16384) != 0 ? false : z19;
        int i31 = (i19 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? 0 : i9;
        boolean z62 = (i19 & 65536) != 0 ? false : z20;
        boolean z63 = (i19 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? false : z21;
        boolean z64 = (i19 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? false : z22;
        List emptyList = (i19 & 524288) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2;
        boolean z65 = (i19 & 1048576) != 0 ? false : z23;
        boolean z66 = (i19 & 2097152) != 0 ? false : z24;
        boolean z67 = (i19 & 4194304) != 0 ? false : z25;
        boolean z68 = (i19 & 8388608) != 0 ? false : z26;
        int i32 = (i19 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? 1 : i10;
        int i33 = (i19 & 33554432) != 0 ? 3 : i11;
        int i34 = (i19 & 67108864) != 0 ? 10 : i12;
        String str18 = (i19 & 134217728) != 0 ? null : str9;
        boolean z69 = (i19 & 268435456) != 0 ? false : z27;
        boolean z70 = (i19 & 536870912) != 0 ? false : z28;
        boolean z71 = (i19 & 1073741824) != 0 ? false : z29;
        boolean z72 = (i19 & Integer.MIN_VALUE) != 0 ? false : z30;
        boolean z73 = (i20 & 1) != 0 ? false : z31;
        int i35 = (i20 & 2) != 0 ? 180 : i13;
        int i36 = (i20 & 4) != 0 ? 180 : i14;
        boolean z74 = (i20 & 8) != 0 ? false : z32;
        boolean z75 = (i20 & 16) != 0 ? false : z33;
        boolean z76 = (i20 & 32) != 0 ? false : z34;
        int i37 = (i20 & 64) != 0 ? Level.INFO_INT : i15;
        boolean z77 = z72;
        int i38 = (i20 & 128) != 0 ? 40 : i16;
        RideWarningConfig rideWarningConfig2 = (i20 & 256) != 0 ? new RideWarningConfig(null, null, null, null, null, 31, null) : rideWarningConfig;
        SmartlockRideConfig smartlockRideConfig2 = (i20 & 512) != 0 ? new SmartlockRideConfig(null, null, null, null, null, null, 63, null) : smartlockRideConfig;
        RideLocationMode rideLocationMode2 = (i20 & 1024) != 0 ? RideLocationMode.LEGACY : rideLocationMode;
        boolean z78 = (i20 & 2048) != 0 ? false : z35;
        boolean z79 = (i20 & 4096) != 0 ? false : z36;
        float f2 = (i20 & 8192) != 0 ? 2.0f : f;
        boolean z80 = (i20 & 16384) != 0 ? false : z37;
        boolean z81 = (i20 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? false : z38;
        if ((i20 & 65536) != 0) {
            z40 = z80;
            i22 = i27;
            z41 = z48;
            z42 = z61;
            safeStartConfig2 = new SafeStartConfig(false, 1, null);
        } else {
            i22 = i27;
            z40 = z80;
            z41 = z48;
            z42 = z61;
            safeStartConfig2 = safeStartConfig;
        }
        HelmetSelfieConfig helmetSelfieConfig3 = (i20 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? new HelmetSelfieConfig(false, false, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null) : helmetSelfieConfig;
        EndRideConfig endRideConfig3 = (i20 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? new EndRideConfig(null, null, null, null, null, null, 63, null) : endRideConfig;
        if ((i20 & 524288) != 0) {
            endRideConfig2 = endRideConfig3;
            helmetSelfieConfig2 = helmetSelfieConfig3;
            disputeConfig2 = new DisputeConfig(null, null, 3, null);
        } else {
            helmetSelfieConfig2 = helmetSelfieConfig3;
            endRideConfig2 = endRideConfig3;
            disputeConfig2 = disputeConfig;
        }
    }
}
