package io.github.sceneview.node;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.Entity;
import com.google.android.filament.EntityInstance;
import com.google.android.filament.Scene;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.github.sceneview.SceneView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.reflect.KProperty;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.C36315Uc4;
import p000.C42577iC1;
import p000.InterfaceC48254rm5;
import p000.Q83;
@Metadata(m28433d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0017\u0018\u0000 \u00112\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0016B/\u0012\f\b\u0002\u0010C\u001a\u00060Aj\u0002`B\u0012\b\b\u0002\u0010D\u001a\u000200\u0012\f\b\u0002\u0010F\u001a\u00060Aj\u0002`E¢\u0006\u0006\bû\u0001\u0010ü\u0001B5\b\u0017\u0012\f\b\u0002\u0010C\u001a\u00060Aj\u0002`B\u0012\f\u0010î\u0001\u001a\u00070Aj\u0003`ë\u0001\u0012\f\b\u0002\u0010F\u001a\u00060Aj\u0002`E¢\u0006\u0006\bû\u0001\u0010ý\u0001J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J)\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J'\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u000e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010.\u001a\u00020\u00072\u0006\u0010)\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u00102\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00101\u001a\u000200H\u0016J\u0018\u00103\u001a\u00020\u00072\u0006\u0010)\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u00105\u001a\u00020\u00072\u0006\u0010)\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u00106\u001a\u00020\u00072\u0006\u0010)\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u00108\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000eH\u0016J\u0018\u00109\u001a\u00020\u00072\u0006\u0010)\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010:\u001a\u00020\u0007H\u0016J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0000H\u0016J\u0010\u0010=\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0000H\u0016J\u0010\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020>H\u0016J@\u0010J\u001a\u00020\u00072\f\b\u0002\u0010C\u001a\u00060Aj\u0002`B2\b\b\u0002\u0010D\u001a\u0002002\f\b\u0002\u0010F\u001a\u00060Aj\u0002`E2\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0002\u0010I\u001a\u00020\u000eJ6\u0010L\u001a\u00020\u00072\f\b\u0002\u0010C\u001a\u00060Aj\u0002`B2\b\b\u0002\u0010D\u001a\u0002002\f\b\u0002\u0010F\u001a\u00060Aj\u0002`E2\b\b\u0002\u0010K\u001a\u00020\u000eJ\u001c\u0010P\u001a\u00020\u00072\n\u0010O\u001a\u00060Mj\u0002`N2\b\b\u0002\u0010K\u001a\u00020\u000eJ\b\u0010Q\u001a\u00020\u0007H\u0016J\b\u0010S\u001a\u00020RH\u0016J\b\u0010T\u001a\u00020\u0000H\u0016J\u0012\u0010V\u001a\u00020\u00002\b\b\u0002\u0010U\u001a\u00020\u0000H\u0017J\b\u0010W\u001a\u00020\u0007H\u0016J)\u0010]\u001a\u00020\u00072!\u0010\\\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b([\u0012\u0004\u0012\u00020\u00070XR\u001c\u0010b\u001a\u0004\u0018\u00010#8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR*\u0010k\u001a\u00020c2\u0006\u0010d\u001a\u00020c8\u0016@VX\u0097\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR&\u0010C\u001a\u00060Aj\u0002`B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010D\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR&\u0010F\u001a\u00060Aj\u0002`E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010l\u001a\u0004\bw\u0010n\"\u0004\bx\u0010pR2\u0010O\u001a\u00060Mj\u0002`N2\n\u0010d\u001a\u00060Mj\u0002`N8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R'\u0010I\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R)\u0010\u0087\u0001\u001a\u00060Mj\u0002`N8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b/\u0010z\u001a\u0005\b\u0085\u0001\u0010|\"\u0005\b\u0086\u0001\u0010~R\u001f\u0010\u0088\u0001\u001a\n\u0018\u00010Mj\u0004\u0018\u0001`N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010zR\u001f\u0010\u0089\u0001\u001a\n\u0018\u00010Mj\u0004\u0018\u0001`N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010zR(\u0010\u008f\u0001\u001a\u00020G8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u008a\u0001\u0010w\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R/\u0010\u0092\u0001\u001a\u00020G2\u0006\u0010d\u001a\u00020G8\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0004\b*\u0010w\u001a\u0006\b\u0090\u0001\u0010\u008c\u0001\"\u0006\b\u0091\u0001\u0010\u008e\u0001R'\u0010\u0095\u0001\u001a\u00020G8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0004\b,\u0010w\u001a\u0006\b\u0093\u0001\u0010\u008c\u0001\"\u0006\b\u0094\u0001\u0010\u008e\u0001R'\u0010\u0098\u0001\u001a\u00020G8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0004\b\b\u0010w\u001a\u0006\b\u0096\u0001\u0010\u008c\u0001\"\u0006\b\u0097\u0001\u0010\u008e\u0001R(\u0010\u009b\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b \u0010\u0080\u0001\u001a\u0006\b\u0099\u0001\u0010\u0082\u0001\"\u0006\b\u009a\u0001\u0010\u0084\u0001R)\u0010\u009f\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u0080\u0001\u001a\u0006\b\u009d\u0001\u0010\u0082\u0001\"\u0006\b\u009e\u0001\u0010\u0084\u0001R0\u0010§\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010 \u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R4\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010d\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b<\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R/\u0010³\u0001\u001a\u0005\u0018\u00010®\u00012\n\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b6\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001RU\u0010»\u0001\u001a;\u00126\u00124\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\u001e\u0012\u0014\u0012\u00120\u0000¢\u0006\r\bY\u0012\t\bZ\u0012\u0005\b\b(¶\u0001\u0012\u0004\u0012\u00020\u00070µ\u00010´\u00018\u0006¢\u0006\u0010\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R=\u0010½\u0001\u001a$\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b([\u0012\u0004\u0012\u00020\u00070X0´\u00018\u0006¢\u0006\u000f\n\u0005\b3\u0010¸\u0001\u001a\u0006\b¼\u0001\u0010º\u0001R=\u0010¿\u0001\u001a$\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b([\u0012\u0004\u0012\u00020\u00070X0´\u00018\u0006¢\u0006\u000f\n\u0005\b\u000b\u0010¸\u0001\u001a\u0006\b¾\u0001\u0010º\u0001R>\u0010Á\u0001\u001a%\u0012 \u0012\u001e\u0012\u0014\u0012\u00120\u0000¢\u0006\r\bY\u0012\t\bZ\u0012\u0005\b\b(¶\u0001\u0012\u0004\u0012\u00020\u00070X0´\u00018\u0006¢\u0006\u000f\n\u0005\bS\u0010¸\u0001\u001a\u0006\bÀ\u0001\u0010º\u0001Rc\u0010Ç\u0001\u001a=\u0012\u0013\u0012\u00110!¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\"\u0012\u001b\u0012\u0019\u0018\u00010#j\u0004\u0018\u0001`$¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0007\u0018\u00010µ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\t\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R.\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000È\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b=\u0010¸\u0001\u001a\u0005\be\u0010º\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R\u0017\u0010Ì\u0001\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010wR\u0017\u0010Í\u0001\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010wR4\u0010Ó\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010d\u001a\u0004\u0018\u00010\u00008\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b+\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R0\u0010×\u0001\u001a\u00020G2\u0006\u0010d\u001a\u00020G8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bÔ\u0001\u0010w\u001a\u0006\bÕ\u0001\u0010\u008c\u0001\"\u0006\bÖ\u0001\u0010\u008e\u0001R\u0017\u0010Ù\u0001\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010Ø\u0001R6\u0010à\u0001\u001a\u0005\u0018\u00010Ú\u00012\t\u0010d\u001a\u0005\u0018\u00010Ú\u00018F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0015\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178TX\u0094\u0004¢\u0006\b\u001a\u0006\bá\u0001\u0010â\u0001R\u001a\u0010æ\u0001\u001a\u0005\u0018\u00010ã\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010å\u0001R\u0015\u0010è\u0001\u001a\u0004\u0018\u00010#8G¢\u0006\u0007\u001a\u0005\bç\u0001\u0010aR\u0014\u0010ê\u0001\u001a\u00020G8F¢\u0006\b\u001a\u0006\bé\u0001\u0010\u008c\u0001R1\u0010î\u0001\u001a\u00070Aj\u0003`ë\u00012\u000b\u0010d\u001a\u00070Aj\u0003`ë\u00018F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bì\u0001\u0010n\"\u0005\bí\u0001\u0010pR/\u0010ñ\u0001\u001a\u00060Aj\u0002`B2\n\u0010d\u001a\u00060Aj\u0002`B8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\bï\u0001\u0010n\"\u0005\bð\u0001\u0010pR'\u0010ô\u0001\u001a\u0002002\u0006\u0010d\u001a\u0002008V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\bò\u0001\u0010t\"\u0005\bó\u0001\u0010vR\u0016\u0010ö\u0001\u001a\u00020M8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bõ\u0001\u0010|R\u0017\u0010ø\u0001\u001a\u00020G8VX\u0096\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010\u008c\u0001R\u0016\u0010ú\u0001\u001a\u0004\u0018\u00010\u00008F¢\u0006\b\u001a\u0006\bù\u0001\u0010Ð\u0001¨\u0006þ\u0001"}, m28432d2 = {"Lio/github/sceneview/node/Node;", "LQ83;", "Lo96;", "Lrm5;", "LiC1$b;", "LP83;", "e", "", "p", "z", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "x", "e1", "e2", "", "velocityX", "velocityY", "H", "distanceX", "distanceY", "b", "G", C17296a.f69688o, "Lio/github/sceneview/SceneView;", "sceneView", "K", "O", "q0", "r0", "LPy1;", "frameTime", "g", "q", "Landroid/view/MotionEvent;", "motionEvent", "", "Lio/github/sceneview/renderable/Renderable;", "renderable", AbstractC26684u0.f100690q, "(Landroid/view/MotionEvent;Ljava/lang/Integer;)V", "LkW2;", "detector", "n", "D", "o", "LRb5;", "B", "j", "LUc4;", "rotationDelta", "s0", "w", "Lbj5;", "l", "u", "scaleFactor", "t0", "k", "v0", "child", "t", "A", "LLifecycleOwner;", "owner", "onDestroy", "Lhu1;", "Lio/github/sceneview/math/Position;", "position", "quaternion", "Lio/github/sceneview/math/Scale;", "scale", "", "smooth", "smoothSpeed", "L0", TransferTable.COLUMN_SPEED, "J0", "LyM2;", "Lio/github/sceneview/math/Transform;", "transform", "K0", "N0", "LjN2;", "y", "L", "toNode", "M", "N", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "scene", "action", "P", "c", "Ljava/lang/Integer;", "e0", "()Ljava/lang/Integer;", "transformEntity", "", "value", DateTokenConverter.CONVERTER_KEY, "[I", "a0", "()[I", "D0", "([I)V", "sceneEntities", "Lhu1;", "X", "()Lhu1;", "z0", "(Lhu1;)V", "f", "LUc4;", "Y", "()LUc4;", "A0", "(LUc4;)V", "Z", "C0", "h", "LyM2;", "d0", "()LyM2;", "H0", "(LyM2;)V", "i", "F", "getSmoothSpeed", "()F", "setSmoothSpeed", "(F)V", "getSmoothTransform", "setSmoothTransform", "smoothTransform", "lastFrameTransform", "lastFrameWorldTransform", "m", "m0", "()Z", "E0", "(Z)V", "isSelectable", "o0", "I0", "isVisible", "k0", "setRotationEditable", "isRotationEditable", "l0", "setScaleEditable", "isScaleEditable", "U", "setMinEditableScale", "minEditableScale", "r", "T", "setMaxEditableScale", "maxEditableScale", "Lkotlin/reflect/KProperty;", "s", "Lkotlin/reflect/KProperty;", "R", "()Lkotlin/reflect/KProperty;", "x0", "(Lkotlin/reflect/KProperty;)V", "currentEditingTransform", "LQ83;", "getParent", "()LQ83;", "y0", "(LQ83;)V", "parent", "Lmm0;", "<set-?>", "Lmm0;", "getCollider", "()Lmm0;", "collider", "", "Lkotlin/Function2;", "node", "v", "Ljava/util/List;", "getOnFrame", "()Ljava/util/List;", "onFrame", "V", "onAttachedToScene", "getOnDetachedFromScene", "onDetachedFromScene", "getOnTransformChanged", "onTransformChanged", "Lkotlin/jvm/functions/Function2;", "getOnTap", "()Lkotlin/jvm/functions/Function2;", "setOnTap", "(Lkotlin/jvm/functions/Function2;)V", "onTap", "", "setChildren", "(Ljava/util/List;)V", "children", "allowDispatchTransformChanged", "skipFirstRotateEdit", "Lio/github/sceneview/node/Node;", "c0", "()Lio/github/sceneview/node/Node;", "G0", "(Lio/github/sceneview/node/Node;)V", "selectionVisualizer", "E", "n0", "F0", "isSelected", "LjN2;", "_transformationMatrixInverted", "Lnm0;", "Lnm0;", "getCollisionShape", "()Lnm0;", "w0", "(Lnm0;)V", "collisionShape", "b0", "()Lio/github/sceneview/SceneView;", "Lzq2;", "S", "()Lzq2;", "lifecycleScope", "f0", "transformInstance", "j0", "isAttached", "Lio/github/sceneview/math/Rotation;", "getRotation", "B0", "rotation", "g0", "setWorldPosition", "worldPosition", "h0", "setWorldQuaternion", "worldQuaternion", "i0", "worldTransform", "p0", "isVisibleInHierarchy", "W", "parentNode", "<init>", "(Lhu1;LUc4;Lhu1;)V", "(Lhu1;Lhu1;Lhu1;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public class Node implements Q83, InterfaceC46112o96, InterfaceC48254rm5, C42577iC1.InterfaceC23148b {

    /* renamed from: H */
    public static final C23423a f88136H;

    /* renamed from: I */
    public static final int f88137I;

    /* renamed from: J */
    public static final C42400hu1 f88138J;

    /* renamed from: A */
    public List<? extends Node> f88139A;

    /* renamed from: B */
    public boolean f88140B;

    /* renamed from: C */
    public boolean f88141C;

    /* renamed from: D */
    public Node f88142D;

    /* renamed from: E */
    public boolean f88143E;

    /* renamed from: F */
    public final C43270jN2 f88144F;

    /* renamed from: G */
    public AbstractC45877nm0 f88145G;

    /* renamed from: b */
    public final /* synthetic */ C42577iC1.C23149c f88146b;
    @Entity

    /* renamed from: c */
    public final Integer f88147c;
    @Entity

    /* renamed from: d */
    public int[] f88148d;

    /* renamed from: e */
    public C42400hu1 f88149e;

    /* renamed from: f */
    public C36315Uc4 f88150f;

    /* renamed from: g */
    public C42400hu1 f88151g;

    /* renamed from: h */
    public C52154yM2 f88152h;

    /* renamed from: i */
    public float f88153i;

    /* renamed from: j */
    public C52154yM2 f88154j;

    /* renamed from: k */
    public C52154yM2 f88155k;

    /* renamed from: l */
    public C52154yM2 f88156l;

    /* renamed from: m */
    public boolean f88157m;

    /* renamed from: n */
    public boolean f88158n;

    /* renamed from: o */
    public boolean f88159o;

    /* renamed from: p */
    public boolean f88160p;

    /* renamed from: q */
    public float f88161q;

    /* renamed from: r */
    public float f88162r;

    /* renamed from: s */
    public KProperty<?> f88163s;

    /* renamed from: t */
    public Q83 f88164t;

    /* renamed from: u */
    public C45284mm0 f88165u;

    /* renamed from: v */
    public final List<Function2<C35340Py1, Node, Unit>> f88166v;

    /* renamed from: w */
    public final List<Function1<SceneView, Unit>> f88167w;

    /* renamed from: x */
    public final List<Function1<SceneView, Unit>> f88168x;

    /* renamed from: y */
    public final List<Function1<Node, Unit>> f88169y;

    /* renamed from: z */
    public Function2<? super MotionEvent, ? super Integer, Unit> f88170z;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0005R\u0015\u0010\u0010\u001a\u00060\u0002j\u0002`\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0013"}, m28432d2 = {"Lio/github/sceneview/node/Node$a;", "", "Lhu1;", "Lio/github/sceneview/math/Position;", C17296a.f69688o, "()Lhu1;", "DEFAULT_POSITION", "LUc4;", "b", "()LUc4;", "DEFAULT_QUATERNION", "DEFAULT_ROTATION", "Lhu1;", "c", "Lio/github/sceneview/math/Scale;", DateTokenConverter.CONVERTER_KEY, "DEFAULT_SCALE", "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.node.Node$a */
    /* loaded from: classes6.dex */
    public static final class C23423a {
        public /* synthetic */ C23423a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C42400hu1 m33187a() {
            return new C42400hu1(0.0f, 0.0f, 0.0f);
        }

        /* renamed from: b */
        public final C36315Uc4 m33186b() {
            return new C36315Uc4(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }

        /* renamed from: c */
        public final C42400hu1 m33185c() {
            return Node.f88138J;
        }

        /* renamed from: d */
        public final C42400hu1 m33184d() {
            return new C42400hu1(1.0f);
        }

        private C23423a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, m28432d2 = {"io/github/sceneview/node/Node$b", "Lkotlin/Function1;", "Lio/github/sceneview/SceneView;", "", "sceneView", C17296a.f69688o, "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.node.Node$b */
    /* loaded from: classes6.dex */
    public static final class C23424b implements Function1<SceneView, Unit> {

        /* renamed from: c */
        public final /* synthetic */ Function1<SceneView, Unit> f88172c;

        /* JADX WARN: Multi-variable type inference failed */
        public C23424b(Function1<? super SceneView, Unit> function1) {
            this.f88172c = function1;
        }

        /* renamed from: a */
        public void m33183a(SceneView sceneView) {
            Intrinsics.checkNotNullParameter(sceneView, "sceneView");
            Node.this.m33235V().remove(this);
            this.f88172c.invoke(sceneView);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SceneView sceneView) {
            m33183a(sceneView);
            return Unit.INSTANCE;
        }
    }

    static {
        C23423a c23423a = new C23423a(null);
        f88136H = c23423a;
        f88137I = 8;
        f88138J = c23423a.m33186b().m81258e();
    }

    public Node() {
        this(null, null, null, 7, null);
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m33244M0(Node node, C42400hu1 c42400hu1, C36315Uc4 c36315Uc4, C42400hu1 c42400hu12, boolean z, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                c42400hu1 = node.f88149e;
            }
            if ((i & 2) != 0) {
                c36315Uc4 = node.f88150f;
            }
            C36315Uc4 c36315Uc42 = c36315Uc4;
            if ((i & 4) != 0) {
                c42400hu12 = node.f88151g;
            }
            C42400hu1 c42400hu13 = c42400hu12;
            if ((i & 8) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                f = node.f88153i;
            }
            node.m33246L0(c42400hu1, c36315Uc42, c42400hu13, z2, f);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
    }

    @Override // p000.Q83
    /* renamed from: A */
    public void mo33267A(Node child) {
        Intrinsics.checkNotNullParameter(child, "child");
        Q83.C6686a.m88875g(this, child);
        mo33195v0();
    }

    /* renamed from: A0 */
    public final void m33266A0(C36315Uc4 c36315Uc4) {
        Intrinsics.checkNotNullParameter(c36315Uc4, "<set-?>");
        this.f88150f = c36315Uc4;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: B */
    public void mo33265B(C35605Rb5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        if (mo33213k0() && this.f88163s == null) {
            this.f88163s = new MutablePropertyReference0Impl(this) { // from class: io.github.sceneview.node.Node.d
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((Node) this.receiver).m33232Y();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(Object obj) {
                    ((Node) this.receiver).m33266A0((C36315Uc4) obj);
                }
            };
            this.f88141C = true;
        }
    }

    /* renamed from: B0 */
    public final void m33264B0(C42400hu1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f88150f = C36315Uc4.C8333a.m81253d(C36315Uc4.f37675e, value, null, 2, null);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: C */
    public void mo33263C(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f88146b.mo33263C(e);
    }

    /* renamed from: C0 */
    public final void m33262C0(C42400hu1 c42400hu1) {
        Intrinsics.checkNotNullParameter(c42400hu1, "<set-?>");
        this.f88151g = c42400hu1;
    }

    /* renamed from: D */
    public void mo33261D(C43944kW2 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
    }

    /* renamed from: D0 */
    public void m33260D0(int[] value) {
        boolean z;
        SceneView mo33227b0;
        Scene m33462Y;
        SceneView mo33227b02;
        Scene m33462Y2;
        Intrinsics.checkNotNullParameter(value, "value");
        int[] iArr = this.f88148d;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            iArr = null;
        }
        if (iArr != null && (mo33227b02 = mo33227b0()) != null && (m33462Y2 = mo33227b02.m33462Y()) != null) {
            m33462Y2.removeEntities(iArr);
        }
        this.f88148d = value;
        if (mo33204p0() && (mo33227b0 = mo33227b0()) != null && (m33462Y = mo33227b0.m33462Y()) != null) {
            m33462Y.addEntities(m33229a0());
        }
    }

    @Override // p000.Q83
    /* renamed from: E */
    public Node mo33259E(Node node) {
        return Q83.C6686a.m88875g(this, node);
    }

    /* renamed from: E0 */
    public void mo33258E0(boolean z) {
        this.f88157m = z;
    }

    /* renamed from: F0 */
    public final void m33257F0(boolean z) {
        Q83 q83;
        if (this.f88143E != z) {
            this.f88143E = z;
            Node m33226c0 = m33226c0();
            if (m33226c0 != null) {
                if (z) {
                    q83 = this;
                } else {
                    q83 = null;
                }
                m33226c0.m33190y0(q83);
            }
        }
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: G */
    public void mo33256G(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f88146b.mo33256G(e);
    }

    /* renamed from: G0 */
    public void m33255G0(Node node) {
        Node node2 = this.f88142D;
        Q83 q83 = null;
        if (node2 != null) {
            node2.m33190y0(null);
        }
        this.f88142D = node;
        if (node != null) {
            if (this.f88143E) {
                q83 = this;
            }
            node.m33190y0(q83);
        }
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: H */
    public void mo33254H(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f88146b.mo33254H(e);
    }

    /* renamed from: H0 */
    public void m33253H0(C52154yM2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.f88152h, value)) {
            this.f88152h = value;
            C42993iu1 m3579a = value.m3579a();
            this.f88149e = new C42400hu1(m3579a.m31660e(), m3579a.m31659f(), m3579a.m31658g());
            this.f88150f = C41491gN2.m39559f(value);
            C42993iu1 m3578b = value.m3578b();
            C42400hu1 c42400hu1 = new C42400hu1(m3578b.m31660e(), m3578b.m31659f(), m3578b.m31658g());
            C42993iu1 m3577c = value.m3577c();
            C42400hu1 c42400hu12 = new C42400hu1(m3577c.m31660e(), m3577c.m31659f(), m3577c.m31658g());
            C42993iu1 m3576d = value.m3576d();
            C42400hu1 c42400hu13 = new C42400hu1(m3576d.m31660e(), m3576d.m31659f(), m3576d.m31658g());
            this.f88151g = new C42400hu1((float) Math.sqrt((c42400hu1.m35576g() * c42400hu1.m35576g()) + (c42400hu1.m35575h() * c42400hu1.m35575h()) + (c42400hu1.m35574i() * c42400hu1.m35574i())), (float) Math.sqrt((c42400hu12.m35576g() * c42400hu12.m35576g()) + (c42400hu12.m35575h() * c42400hu12.m35575h()) + (c42400hu12.m35574i() * c42400hu12.m35574i())), (float) Math.sqrt((c42400hu13.m35576g() * c42400hu13.m35576g()) + (c42400hu13.m35575h() * c42400hu13.m35575h()) + (c42400hu13.m35574i() * c42400hu13.m35574i())));
        }
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: I */
    public void mo15405I(int i, int i2) {
        InterfaceC48254rm5.C27996a.m15402b(this, i, i2);
    }

    /* renamed from: I0 */
    public void m33252I0(boolean z) {
        if (this.f88158n != z) {
            this.f88158n = z;
            m33243N0();
        }
    }

    /* renamed from: J0 */
    public final void m33250J0(C42400hu1 position, C36315Uc4 quaternion, C42400hu1 scale, float f) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(quaternion, "quaternion");
        Intrinsics.checkNotNullParameter(scale, "scale");
        m33248K0(C41491gN2.m39564a(position, quaternion, scale), f);
    }

    /* renamed from: K */
    public void m33249K(SceneView sceneView) {
        Node node;
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        sceneView.getLifecycle().mo67008a(this);
        if (mo33204p0()) {
            sceneView.m33462Y().addEntities(m33229a0());
        }
        C46470om0 m33469Q = sceneView.m33469Q();
        C45284mm0 c45284mm0 = this.f88165u;
        if (c45284mm0 != null) {
            c45284mm0.m25037c(m33469Q);
        }
        if (m33226c0() == null) {
            Function0<Node> m33459b0 = sceneView.m33459b0();
            if (m33459b0 != null) {
                node = m33459b0.invoke();
            } else {
                node = null;
            }
            m33255G0(node);
        }
        for (Node node2 : mo33225d()) {
            node2.m33249K(sceneView);
        }
        mo33175q0(sceneView);
    }

    /* renamed from: K0 */
    public final void m33248K0(C52154yM2 transform, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.f88153i = f;
        C52154yM2 m33224d0 = m33224d0();
        C42993iu1 m3578b = m33224d0.m3578b();
        C42993iu1 m3578b2 = transform.m3578b();
        C42400hu1 c42400hu1 = new C42400hu1(m3578b.m31660e(), m3578b.m31659f(), m3578b.m31658g());
        C42400hu1 c42400hu12 = new C42400hu1(m3578b2.m31660e(), m3578b2.m31659f(), m3578b2.m31658g());
        C41807gu1 c41807gu1 = new C41807gu1(c42400hu1.m35576g(), c42400hu1.m35575h());
        C41807gu1 c41807gu12 = new C41807gu1(c42400hu12.m35576g(), c42400hu12.m35575h());
        if (Math.abs(c41807gu1.m37349a() - c41807gu12.m37349a()) < 0.001f) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(c41807gu1.m37348b() - c41807gu12.m37348b()) < 0.001f) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7878TY c7878ty = new C7878TY(z, z2);
        if (Math.abs(c42400hu1.m35574i() - c42400hu12.m35574i()) < 0.001f) {
            z3 = true;
        } else {
            z3 = false;
        }
        C8309UY c8309uy = new C8309UY(c7878ty, z3);
        if (Math.abs(m3578b.m31661d() - m3578b2.m31661d()) < 0.001f) {
            z4 = true;
        } else {
            z4 = false;
        }
        C8671VY c8671vy = new C8671VY(c8309uy, z4);
        if (c8671vy.m79791b() && c8671vy.m79790c() && c8671vy.m79789d() && c8671vy.m79792a()) {
            z5 = true;
        } else {
            z5 = false;
        }
        C42993iu1 m3577c = m33224d0.m3577c();
        C42993iu1 m3577c2 = transform.m3577c();
        C42400hu1 c42400hu13 = new C42400hu1(m3577c.m31660e(), m3577c.m31659f(), m3577c.m31658g());
        C42400hu1 c42400hu14 = new C42400hu1(m3577c2.m31660e(), m3577c2.m31659f(), m3577c2.m31658g());
        C41807gu1 c41807gu13 = new C41807gu1(c42400hu13.m35576g(), c42400hu13.m35575h());
        C41807gu1 c41807gu14 = new C41807gu1(c42400hu14.m35576g(), c42400hu14.m35575h());
        if (Math.abs(c41807gu13.m37349a() - c41807gu14.m37349a()) < 0.001f) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (Math.abs(c41807gu13.m37348b() - c41807gu14.m37348b()) < 0.001f) {
            z7 = true;
        } else {
            z7 = false;
        }
        C7878TY c7878ty2 = new C7878TY(z6, z7);
        if (Math.abs(c42400hu13.m35574i() - c42400hu14.m35574i()) < 0.001f) {
            z8 = true;
        } else {
            z8 = false;
        }
        C8309UY c8309uy2 = new C8309UY(c7878ty2, z8);
        if (Math.abs(m3577c.m31661d() - m3577c2.m31661d()) < 0.001f) {
            z9 = true;
        } else {
            z9 = false;
        }
        C8671VY c8671vy2 = new C8671VY(c8309uy2, z9);
        if (c8671vy2.m79791b() && c8671vy2.m79790c() && c8671vy2.m79789d() && c8671vy2.m79792a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C42993iu1 m3576d = m33224d0.m3576d();
        C42993iu1 m3576d2 = transform.m3576d();
        C42400hu1 c42400hu15 = new C42400hu1(m3576d.m31660e(), m3576d.m31659f(), m3576d.m31658g());
        C42400hu1 c42400hu16 = new C42400hu1(m3576d2.m31660e(), m3576d2.m31659f(), m3576d2.m31658g());
        C41807gu1 c41807gu15 = new C41807gu1(c42400hu15.m35576g(), c42400hu15.m35575h());
        C41807gu1 c41807gu16 = new C41807gu1(c42400hu16.m35576g(), c42400hu16.m35575h());
        if (Math.abs(c41807gu15.m37349a() - c41807gu16.m37349a()) < 0.001f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (Math.abs(c41807gu15.m37348b() - c41807gu16.m37348b()) < 0.001f) {
            z12 = true;
        } else {
            z12 = false;
        }
        C7878TY c7878ty3 = new C7878TY(z11, z12);
        if (Math.abs(c42400hu15.m35574i() - c42400hu16.m35574i()) < 0.001f) {
            z13 = true;
        } else {
            z13 = false;
        }
        C8309UY c8309uy3 = new C8309UY(c7878ty3, z13);
        if (Math.abs(m3576d.m31661d() - m3576d2.m31661d()) < 0.001f) {
            z14 = true;
        } else {
            z14 = false;
        }
        C8671VY c8671vy3 = new C8671VY(c8309uy3, z14);
        if (c8671vy3.m79791b() && c8671vy3.m79790c() && c8671vy3.m79789d() && c8671vy3.m79792a()) {
            z15 = true;
        } else {
            z15 = false;
        }
        C42993iu1 m3579a = m33224d0.m3579a();
        C42993iu1 m3579a2 = transform.m3579a();
        C42400hu1 c42400hu17 = new C42400hu1(m3579a.m31660e(), m3579a.m31659f(), m3579a.m31658g());
        C42400hu1 c42400hu18 = new C42400hu1(m3579a2.m31660e(), m3579a2.m31659f(), m3579a2.m31658g());
        C41807gu1 c41807gu17 = new C41807gu1(c42400hu17.m35576g(), c42400hu17.m35575h());
        C41807gu1 c41807gu18 = new C41807gu1(c42400hu18.m35576g(), c42400hu18.m35575h());
        if (Math.abs(c41807gu17.m37349a() - c41807gu18.m37349a()) < 0.001f) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (Math.abs(c41807gu17.m37348b() - c41807gu18.m37348b()) < 0.001f) {
            z17 = true;
        } else {
            z17 = false;
        }
        C7878TY c7878ty4 = new C7878TY(z16, z17);
        if (Math.abs(c42400hu17.m35574i() - c42400hu18.m35574i()) < 0.001f) {
            z18 = true;
        } else {
            z18 = false;
        }
        C8309UY c8309uy4 = new C8309UY(c7878ty4, z18);
        if (Math.abs(m3579a.m31661d() - m3579a2.m31661d()) < 0.001f) {
            z19 = true;
        } else {
            z19 = false;
        }
        C8671VY c8671vy4 = new C8671VY(c8309uy4, z19);
        if (c8671vy4.m79791b() && c8671vy4.m79790c() && c8671vy4.m79789d() && c8671vy4.m79792a()) {
            z20 = true;
        } else {
            z20 = false;
        }
        C8671VY c8671vy5 = new C8671VY(z5, z10, z15, z20);
        if (c8671vy5.m79791b() && c8671vy5.m79790c() && c8671vy5.m79789d() && c8671vy5.m79792a()) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (!z21) {
            this.f88154j = transform;
        } else {
            m33253H0(transform);
        }
    }

    /* renamed from: L */
    public Node m33247L() {
        return m33245M(new Node(null, null, null, 7, null));
    }

    /* renamed from: L0 */
    public final void m33246L0(C42400hu1 position, C36315Uc4 quaternion, C42400hu1 scale, boolean z, float f) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(quaternion, "quaternion");
        Intrinsics.checkNotNullParameter(scale, "scale");
        if (z) {
            m33250J0(position, quaternion, scale, f);
            return;
        }
        this.f88149e = position;
        this.f88150f = quaternion;
        this.f88151g = scale;
    }

    @JvmOverloads
    /* renamed from: M */
    public Node m33245M(Node toNode) {
        Intrinsics.checkNotNullParameter(toNode, "toNode");
        toNode.f88149e = this.f88149e;
        toNode.f88150f = this.f88150f;
        toNode.f88151g = this.f88151g;
        return toNode;
    }

    /* renamed from: N */
    public void mo33178N() {
        m33190y0(null);
    }

    /* renamed from: N0 */
    public void m33243N0() {
        Scene m33462Y;
        Scene m33462Y2;
        if (mo33204p0()) {
            SceneView mo33227b0 = mo33227b0();
            if (mo33227b0 != null && (m33462Y2 = mo33227b0.m33462Y()) != null) {
                m33462Y2.addEntities(m33229a0());
            }
        } else {
            SceneView mo33227b02 = mo33227b0();
            if (mo33227b02 != null && (m33462Y = mo33227b02.m33462Y()) != null) {
                m33462Y.removeEntities(m33229a0());
            }
        }
        for (Node node : mo33225d()) {
            node.m33243N0();
        }
    }

    /* renamed from: O */
    public void m33242O(SceneView sceneView) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        sceneView.getLifecycle().mo67006d(this);
        sceneView.m33462Y().removeEntities(m33229a0());
        C45284mm0 c45284mm0 = this.f88165u;
        if (c45284mm0 != null) {
            c45284mm0.m25037c(null);
        }
        for (Node node : mo33225d()) {
            node.m33242O(sceneView);
        }
        mo33174r0(sceneView);
    }

    /* renamed from: P */
    public final void m33241P(Function1<? super SceneView, Unit> action) {
        Unit unit;
        Intrinsics.checkNotNullParameter(action, "action");
        SceneView mo33227b0 = mo33227b0();
        if (mo33227b0 != null) {
            action.invoke(mo33227b0);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f88167w.add(new C23424b(action));
        }
    }

    /* renamed from: Q */
    public List<Node> m33240Q() {
        return Q83.C6686a.m88880b(this);
    }

    /* renamed from: R */
    public final KProperty<?> m33239R() {
        return this.f88163s;
    }

    /* renamed from: S */
    public final AbstractC53033zq2 m33238S() {
        SceneView mo33227b0 = mo33227b0();
        if (mo33227b0 != null) {
            return C33163Gq2.m104689a(mo33227b0);
        }
        return null;
    }

    /* renamed from: T */
    public final float m33237T() {
        return this.f88162r;
    }

    /* renamed from: U */
    public final float m33236U() {
        return this.f88161q;
    }

    /* renamed from: V */
    public final List<Function1<SceneView, Unit>> m33235V() {
        return this.f88167w;
    }

    /* renamed from: W */
    public final Node m33234W() {
        Q83 q83 = this.f88164t;
        if (q83 instanceof Node) {
            return (Node) q83;
        }
        return null;
    }

    /* renamed from: X */
    public final C42400hu1 m33233X() {
        return this.f88149e;
    }

    /* renamed from: Y */
    public final C36315Uc4 m33232Y() {
        return this.f88150f;
    }

    /* renamed from: Z */
    public final C42400hu1 m33231Z() {
        return this.f88151g;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: a */
    public void mo33230a(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f88146b.mo33230a(e);
    }

    /* renamed from: a0 */
    public int[] m33229a0() {
        return this.f88148d;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: b */
    public void mo33228b(P83 e1, P83 e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e1, "e1");
        Intrinsics.checkNotNullParameter(e2, "e2");
        this.f88146b.mo33228b(e1, e2, f, f2);
    }

    /* renamed from: b0 */
    public SceneView mo33227b0() {
        Q83 q83 = this.f88164t;
        SceneView sceneView = q83 instanceof SceneView ? (SceneView) q83 : null;
        if (sceneView == null) {
            Node m33234W = m33234W();
            if (m33234W != null) {
                return m33234W.mo33227b0();
            }
            return null;
        }
        return sceneView;
    }

    /* renamed from: c0 */
    public Node m33226c0() {
        return this.f88142D;
    }

    @Override // p000.Q83
    /* renamed from: d */
    public List<Node> mo33225d() {
        return this.f88139A;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C52154yM2 m33224d0() {
        boolean z;
        C52154yM2 c52154yM2 = this.f88152h;
        C42993iu1 m3579a = c52154yM2.m3579a();
        if (Intrinsics.areEqual(new C42400hu1(m3579a.m31660e(), m3579a.m31659f(), m3579a.m31658g()), this.f88149e) && Intrinsics.areEqual(C41491gN2.m39559f(c52154yM2), this.f88150f)) {
            C42993iu1 m3578b = c52154yM2.m3578b();
            C42400hu1 c42400hu1 = new C42400hu1(m3578b.m31660e(), m3578b.m31659f(), m3578b.m31658g());
            C42993iu1 m3577c = c52154yM2.m3577c();
            C42400hu1 c42400hu12 = new C42400hu1(m3577c.m31660e(), m3577c.m31659f(), m3577c.m31658g());
            C42993iu1 m3576d = c52154yM2.m3576d();
            C42400hu1 c42400hu13 = new C42400hu1(m3576d.m31660e(), m3576d.m31659f(), m3576d.m31658g());
            if (Intrinsics.areEqual(new C42400hu1((float) Math.sqrt((c42400hu1.m35576g() * c42400hu1.m35576g()) + (c42400hu1.m35575h() * c42400hu1.m35575h()) + (c42400hu1.m35574i() * c42400hu1.m35574i())), (float) Math.sqrt((c42400hu12.m35576g() * c42400hu12.m35576g()) + (c42400hu12.m35575h() * c42400hu12.m35575h()) + (c42400hu12.m35574i() * c42400hu12.m35574i())), (float) Math.sqrt((c42400hu13.m35576g() * c42400hu13.m35576g()) + (c42400hu13.m35575h() * c42400hu13.m35575h()) + (c42400hu13.m35574i() * c42400hu13.m35574i()))), this.f88151g)) {
                z = true;
                if (!z) {
                    c52154yM2 = null;
                }
                if (c52154yM2 != null) {
                    return C41491gN2.m39564a(this.f88149e, this.f88150f, this.f88151g);
                }
                return c52154yM2;
            }
        }
        z = false;
        if (!z) {
        }
        if (c52154yM2 != null) {
        }
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: e */
    public void mo33223e(P83 e1, P83 e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e1, "e1");
        Intrinsics.checkNotNullParameter(e2, "e2");
        this.f88146b.mo33223e(e1, e2, f, f2);
    }

    /* renamed from: e0 */
    public Integer mo33222e0() {
        return this.f88147c;
    }

    @Override // p000.Q83
    /* renamed from: f */
    public Node mo33221f(Node node) {
        return Q83.C6686a.m88881a(this, node);
    }

    @EntityInstance
    /* renamed from: f0 */
    public final Integer m33220f0() {
        Integer mo33222e0 = mo33222e0();
        if (mo33222e0 != null) {
            return Integer.valueOf(C39939dl1.m43777j().getInstance(mo33222e0.intValue()));
        }
        return null;
    }

    /* renamed from: g */
    public void mo15404g(C35340Py1 frameTime) {
        Integer m33220f0;
        Intrinsics.checkNotNullParameter(frameTime, "frameTime");
        InterfaceC48254rm5.C27996a.m15403a(this, frameTime);
        if (!C41491gN2.m39560e(this.f88154j, m33224d0(), 0.0f, 2, null)) {
            if (!Intrinsics.areEqual(m33224d0(), this.f88155k)) {
                this.f88154j = m33224d0();
            } else {
                m33253H0(C41491gN2.m39555j(m33224d0(), this.f88154j, frameTime.m89221d(), this.f88153i, 0.0f, 16, null));
            }
        } else {
            this.f88154j = m33224d0();
        }
        this.f88155k = m33224d0();
        if (!Intrinsics.areEqual(mo33217i0(), this.f88156l) && (m33220f0 = m33220f0()) != null) {
            C40531el1.m42577c(C39939dl1.m43777j(), m33220f0.intValue(), mo33217i0());
        }
        this.f88156l = mo33217i0();
        Iterator<T> it = this.f88166v.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(frameTime, this);
        }
    }

    /* renamed from: g0 */
    public C42400hu1 m33219g0() {
        C42993iu1 m3579a = mo33217i0().m3579a();
        return new C42400hu1(m3579a.m31660e(), m3579a.m31659f(), m3579a.m31658g());
    }

    /* renamed from: h0 */
    public C36315Uc4 m33218h0() {
        return mo33217i0().m3573g();
    }

    /* renamed from: i0 */
    public C52154yM2 mo33217i0() {
        C52154yM2 m3575e;
        Node m33234W = m33234W();
        return (m33234W == null || (m3575e = m33234W.mo33217i0().m3575e(m33224d0())) == null) ? m33224d0() : m3575e;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: j */
    public void mo33216j(C35605Rb5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        if (mo33213k0() && Intrinsics.areEqual(this.f88163s, new MutablePropertyReference0Impl(this) { // from class: io.github.sceneview.node.Node.c
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((Node) this.receiver).m33232Y();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Node) this.receiver).m33266A0((C36315Uc4) obj);
            }
        })) {
            if (this.f88141C) {
                this.f88141C = false;
                return;
            }
            mo33201s0(e, C36315Uc4.f37675e.m81256a(new C42400hu1(0.0f, 1.0f, 0.0f, 5, null), (-(detector.m86570a() - detector.m86569b())) * 57.295776f));
        }
    }

    /* renamed from: j0 */
    public final boolean m33215j0() {
        return mo33227b0() != null;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: k */
    public void mo33214k(C38719bj5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        if (mo33211l0() && Intrinsics.areEqual(this.f88163s, new MutablePropertyReference0Impl(this) { // from class: io.github.sceneview.node.Node.h
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((Node) this.receiver).m33231Z();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Node) this.receiver).m33262C0((C42400hu1) obj);
            }
        })) {
            this.f88163s = null;
        }
    }

    /* renamed from: k0 */
    public boolean mo33213k0() {
        return this.f88159o;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: l */
    public void mo33212l(C38719bj5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        if (mo33211l0() && this.f88163s == null) {
            this.f88163s = new MutablePropertyReference0Impl(this) { // from class: io.github.sceneview.node.Node.g
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((Node) this.receiver).m33231Z();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(Object obj) {
                    ((Node) this.receiver).m33262C0((C42400hu1) obj);
                }
            };
        }
    }

    /* renamed from: l0 */
    public boolean mo33211l0() {
        return this.f88160p;
    }

    /* renamed from: m0 */
    public boolean mo33210m0() {
        return this.f88157m;
    }

    /* renamed from: n */
    public void mo33209n(C43944kW2 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
    }

    /* renamed from: n0 */
    public final boolean m33208n0() {
        return this.f88143E;
    }

    /* renamed from: o */
    public void mo33207o(C43944kW2 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
    }

    /* renamed from: o0 */
    public boolean m33206o0() {
        return this.f88158n;
    }

    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        mo33178N();
        super.onDestroy(owner);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: p */
    public void mo33205p(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f88146b.mo33205p(e);
    }

    /* renamed from: p0 */
    public boolean mo33204p0() {
        if (m33206o0()) {
            Node m33234W = m33234W();
            if (m33234W != null ? m33234W.mo33204p0() : true) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: q */
    public void mo33203q(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        m33197u0(e.m90711a(), e.m90709c());
    }

    /* renamed from: q0 */
    public void mo33175q0(SceneView sceneView) {
        List<Function1> list;
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        list = CollectionsKt___CollectionsKt.toList(this.f88167w);
        for (Function1 function1 : list) {
            function1.invoke(sceneView);
        }
    }

    /* renamed from: r0 */
    public void mo33174r0(SceneView sceneView) {
        List<Function1> list;
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        list = CollectionsKt___CollectionsKt.toList(this.f88168x);
        for (Function1 function1 : list) {
            function1.invoke(sceneView);
        }
    }

    @Override // p000.Q83
    /* renamed from: s */
    public Function1<Node, Unit> mo33202s() {
        return Q83.C6686a.m88878d(this);
    }

    /* renamed from: s0 */
    public void mo33201s0(P83 e, C36315Uc4 rotationDelta) {
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(rotationDelta, "rotationDelta");
        C36315Uc4 c36315Uc4 = this.f88150f;
        this.f88150f = new C36315Uc4((((c36315Uc4.m81262a() * rotationDelta.m81261b()) + (c36315Uc4.m81261b() * rotationDelta.m81262a())) + (c36315Uc4.m81260c() * rotationDelta.m81259d())) - (c36315Uc4.m81259d() * rotationDelta.m81260c()), ((c36315Uc4.m81262a() * rotationDelta.m81260c()) - (c36315Uc4.m81261b() * rotationDelta.m81259d())) + (c36315Uc4.m81260c() * rotationDelta.m81262a()) + (c36315Uc4.m81259d() * rotationDelta.m81261b()), (((c36315Uc4.m81262a() * rotationDelta.m81259d()) + (c36315Uc4.m81261b() * rotationDelta.m81260c())) - (c36315Uc4.m81260c() * rotationDelta.m81261b())) + (c36315Uc4.m81259d() * rotationDelta.m81262a()), (((c36315Uc4.m81262a() * rotationDelta.m81262a()) - (c36315Uc4.m81261b() * rotationDelta.m81261b())) - (c36315Uc4.m81260c() * rotationDelta.m81260c())) - (c36315Uc4.m81259d() * rotationDelta.m81259d()));
    }

    @Override // p000.Q83
    public void setChildren(List<? extends Node> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f88139A = list;
    }

    @Override // p000.Q83
    /* renamed from: t */
    public void mo33200t(Node child) {
        Intrinsics.checkNotNullParameter(child, "child");
        Q83.C6686a.m88877e(this, child);
        mo33195v0();
    }

    /* renamed from: t0 */
    public void mo33199t0(P83 e, float f) {
        Intrinsics.checkNotNullParameter(e, "e");
        C42400hu1 c42400hu1 = this.f88151g;
        C42400hu1 c42400hu12 = new C42400hu1(c42400hu1.m35576g() * f, c42400hu1.m35575h() * f, c42400hu1.m35574i() * f);
        float f2 = this.f88161q;
        float f3 = this.f88162r;
        float m35576g = c42400hu12.m35576g();
        if (m35576g < f2) {
            m35576g = f2;
        } else if (m35576g > f3) {
            m35576g = f3;
        }
        float m35575h = c42400hu12.m35575h();
        if (m35575h < f2) {
            m35575h = f2;
        } else if (m35575h > f3) {
            m35575h = f3;
        }
        float m35574i = c42400hu12.m35574i();
        if (m35574i >= f2) {
            if (m35574i > f3) {
                f2 = f3;
            } else {
                f2 = m35574i;
            }
        }
        this.f88151g = new C42400hu1(m35576g, m35575h, f2);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: u */
    public void mo33198u(C38719bj5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        if (mo33211l0() && Intrinsics.areEqual(this.f88163s, new MutablePropertyReference0Impl(this) { // from class: io.github.sceneview.node.Node.f
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((Node) this.receiver).m33231Z();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Node) this.receiver).m33262C0((C42400hu1) obj);
            }
        })) {
            mo33199t0(e, detector.getScaleFactor());
        }
    }

    /* renamed from: u0 */
    public void m33197u0(MotionEvent motionEvent, Integer num) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Function2<? super MotionEvent, ? super Integer, Unit> function2 = this.f88170z;
        if (function2 != null) {
            function2.invoke(motionEvent, num);
        }
        Node m33234W = m33234W();
        if (m33234W != null) {
            m33234W.m33197u0(motionEvent, num);
        }
    }

    @Override // p000.Q83
    /* renamed from: v */
    public Function1<Node, Unit> mo33196v() {
        return Q83.C6686a.m88879c(this);
    }

    /* renamed from: v0 */
    public void mo33195v0() {
        C45284mm0 c45284mm0 = this.f88165u;
        if (c45284mm0 != null) {
            c45284mm0.m25038b();
        }
        for (Node node : mo33225d()) {
            node.mo33195v0();
        }
        Iterator<T> it = this.f88169y.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this);
        }
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: w */
    public void mo33194w(C35605Rb5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        if (mo33213k0() && Intrinsics.areEqual(this.f88163s, new MutablePropertyReference0Impl(this) { // from class: io.github.sceneview.node.Node.e
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((Node) this.receiver).m33232Y();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Node) this.receiver).m33266A0((C36315Uc4) obj);
            }
        })) {
            this.f88163s = null;
        }
    }

    /* renamed from: w0 */
    public final void m33193w0(AbstractC45877nm0 abstractC45877nm0) {
        this.f88145G = abstractC45877nm0;
        C46470om0 c46470om0 = null;
        if (abstractC45877nm0 != null) {
            C45284mm0 c45284mm0 = this.f88165u;
            if (c45284mm0 == null) {
                C45284mm0 c45284mm02 = new C45284mm0(this, abstractC45877nm0);
                SceneView mo33227b0 = mo33227b0();
                if (mo33227b0 != null) {
                    c46470om0 = mo33227b0.m33469Q();
                }
                if (c46470om0 != null) {
                    SceneView mo33227b02 = mo33227b0();
                    Intrinsics.checkNotNull(mo33227b02);
                    c45284mm02.m25037c(mo33227b02.m33469Q());
                }
                this.f88165u = c45284mm02;
                return;
            }
            Intrinsics.checkNotNull(c45284mm0);
            if (!Intrinsics.areEqual(c45284mm0.m25039a(), abstractC45877nm0)) {
                C45284mm0 c45284mm03 = this.f88165u;
                Intrinsics.checkNotNull(c45284mm03);
                c45284mm03.m25036d(abstractC45877nm0);
                return;
            }
            return;
        }
        C45284mm0 c45284mm04 = this.f88165u;
        if (c45284mm04 != null) {
            c45284mm04.m25037c(null);
        }
        this.f88165u = null;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: x */
    public void mo33192x(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f88146b.mo33192x(e);
    }

    /* renamed from: x0 */
    public final void m33191x0(KProperty<?> kProperty) {
        this.f88163s = kProperty;
    }

    @Override // p000.InterfaceC46112o96
    /* renamed from: y */
    public C43270jN2 mo21708y() {
        return new C43270jN2(C41491gN2.m39554k(mo33217i0()));
    }

    /* renamed from: y0 */
    public final void m33190y0(Q83 q83) {
        if (!Intrinsics.areEqual(this.f88164t, q83)) {
            SceneView mo33227b0 = mo33227b0();
            if (mo33227b0 != null) {
                m33242O(mo33227b0);
            }
            Q83 q832 = this.f88164t;
            if (q832 != null) {
                q832.mo33259E(this);
            }
            this.f88164t = q83;
            if (q83 != null) {
                q83.mo33221f(this);
            }
            SceneView mo33227b02 = mo33227b0();
            if (mo33227b02 != null) {
                m33249K(mo33227b02);
            }
        }
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: z */
    public void mo33189z(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f88146b.mo33189z(e);
    }

    /* renamed from: z0 */
    public final void m33188z0(C42400hu1 c42400hu1) {
        Intrinsics.checkNotNullParameter(c42400hu1, "<set-?>");
        this.f88149e = c42400hu1;
    }

    public Node(C42400hu1 position, C36315Uc4 quaternion, C42400hu1 scale) {
        List<? extends Node> emptyList;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(quaternion, "quaternion");
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.f88146b = new C42577iC1.C23149c();
        this.f88148d = new int[0];
        this.f88149e = position;
        this.f88150f = quaternion;
        this.f88151g = scale;
        this.f88152h = C41491gN2.m39564a(position, quaternion, scale);
        this.f88153i = 5.0f;
        this.f88154j = new C52154yM2(m33224d0());
        this.f88158n = true;
        this.f88161q = 0.1f;
        this.f88162r = 10.0f;
        this.f88166v = new ArrayList();
        this.f88167w = new ArrayList();
        this.f88168x = new ArrayList();
        this.f88169y = new ArrayList();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f88139A = emptyList;
        this.f88140B = true;
        this.f88144F = new C43270jN2();
    }

    public /* synthetic */ Node(C42400hu1 c42400hu1, C36315Uc4 c36315Uc4, C42400hu1 c42400hu12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f88136H.m33187a() : c42400hu1, (i & 2) != 0 ? f88136H.m33186b() : c36315Uc4, (i & 4) != 0 ? f88136H.m33184d() : c42400hu12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Node(C42400hu1 position, C42400hu1 rotation, C42400hu1 scale) {
        this(position, null, scale, 2, null);
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        m33264B0(rotation);
    }
}
