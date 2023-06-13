package io.github.sceneview.p052ar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Scene;
import com.google.android.filament.utils.Manipulator;
import com.google.p034ar.core.AugmentedFace;
import com.google.p034ar.core.AugmentedImage;
import com.google.p034ar.core.Camera;
import com.google.p034ar.core.CameraConfig;
import com.google.p034ar.core.CameraConfigFilter;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.HitResult;
import com.google.p034ar.core.Session;
import com.google.p034ar.core.TrackingFailureReason;
import com.google.p034ar.sceneform.ArCameraNode;
import io.github.sceneview.SceneView;
import io.github.sceneview.node.Node;
import io.github.sceneview.p052ar.ArSceneView;
import io.github.sceneview.p052ar.arcore.ArSession;
import io.github.sceneview.p052ar.arcore.LightEstimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.InterfaceC30295xm;
import p000.InterfaceC30697ym;
@Metadata(m28433d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BV\b\u0007\u0012\b\u0010\u0080\u0002\u001a\u00030ÿ\u0001\u0012\f\b\u0002\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0081\u0002\u0012\t\b\u0002\u0010\u0083\u0002\u001a\u00020 \u0012\t\b\u0002\u0010\u0084\u0002\u001a\u00020 \u0012\u0011\b\u0002\u0010\u0087\u0002\u001a\n\u0012\u0005\u0012\u00030\u0086\u00020\u0085\u0002\u0012\b\b\u0002\u0010;\u001a\u000206¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\u000b\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J \u0010\u001b\u001a\u00020\u00062\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0019J1\u0010#\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J,\u0010/\u001a\u0004\u0018\u00010%2\n\u0010*\u001a\u00060(j\u0002`)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020+J:\u00104\u001a\u0004\u0018\u00010%2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020+2\b\b\u0002\u00103\u001a\u000200J\b\u00105\u001a\u00020\u0006H\u0016R\u001a\u0010;\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010^\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010]R\u0016\u0010a\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010]R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR*\u0010n\u001a\u00020f2\u0006\u0010g\u001a\u00020f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010t\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0017\u0010y\u001a\u00020u8\u0006¢\u0006\f\n\u0004\b\u0015\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010\u007f\u001a\u00020z8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001c\u0010\u0084\u0001\u001a\u00020\u00168\u0006¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001RC\u0010\u008c\u0001\u001a\u000b\u0018\u00010 j\u0005\u0018\u0001`\u0085\u00012\u000f\u0010g\u001a\u000b\u0018\u00010 j\u0005\u0018\u0001`\u0085\u00018\u0006@BX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R7\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008d\u00012\t\u0010g\u001a\u0005\u0018\u00010\u008d\u00018\u0006@BX\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R6\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\u0010g\u001a\u0005\u0018\u00010\u0095\u00018\u0006@BX\u0086\u000e¢\u0006\u0017\n\u0005\b9\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R7\u0010£\u0001\u001a\u0005\u0018\u00010\u009c\u00012\t\u0010g\u001a\u0005\u0018\u00010\u009c\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001RH\u0010¬\u0001\u001a\"\u0012\u0015\u0012\u00130\u0004¢\u0006\u000e\b¥\u0001\u0012\t\b¦\u0001\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b?\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001RM\u0010°\u0001\u001a&\u0012\u0019\u0012\u00170\bj\u0002`\t¢\u0006\u000e\b¥\u0001\u0012\t\b¦\u0001\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010§\u0001\u001a\u0006\b®\u0001\u0010©\u0001\"\u0006\b¯\u0001\u0010«\u0001RH\u0010³\u0001\u001a\"\u0012\u0015\u0012\u00130\u0004¢\u0006\u000e\b¥\u0001\u0012\t\b¦\u0001\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b}\u0010§\u0001\u001a\u0006\b±\u0001\u0010©\u0001\"\u0006\b²\u0001\u0010«\u0001R^\u0010¹\u0001\u001a8\u0012\u0015\u0012\u00130\u0004¢\u0006\u000e\b¥\u0001\u0012\t\b¦\u0001\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u00130\r¢\u0006\u000e\b¥\u0001\u0012\t\b¦\u0001\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b4\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001RH\u0010¼\u0001\u001a\"\u0012\u0015\u0012\u00130\u0013¢\u0006\u000e\b¥\u0001\u0012\t\b¦\u0001\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b/\u0010§\u0001\u001a\u0006\bº\u0001\u0010©\u0001\"\u0006\b»\u0001\u0010«\u0001R^\u0010¿\u0001\u001a8\u0012\u0015\u0012\u00130%¢\u0006\u000e\b¥\u0001\u0012\t\b¦\u0001\u0012\u0004\b\b(&\u0012\u0015\u0012\u00130\u001c¢\u0006\u000e\b¥\u0001\u0012\t\b¦\u0001\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0018\u0010´\u0001\u001a\u0006\b½\u0001\u0010¶\u0001\"\u0006\b¾\u0001\u0010¸\u0001RO\u0010Ç\u0001\u001a)\u0012$\u0012\"\u0012\u0017\u0012\u00150Á\u0001¢\u0006\u000f\b¥\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(Â\u0001\u0012\u0004\u0012\u00020\u00060¤\u00010À\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b'\u0010Ã\u0001\u001a\u0006\b\u00ad\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001RK\u0010Ì\u0001\u001a$\u0012\u0017\u0012\u00150È\u0001¢\u0006\u000f\b¥\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(É\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010§\u0001\u001a\u0006\bÊ\u0001\u0010©\u0001\"\u0006\bË\u0001\u0010«\u0001RM\u0010Ï\u0001\u001a&\u0012\u0019\u0012\u0017\u0018\u00010\u009c\u0001¢\u0006\u000f\b¥\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(£\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010§\u0001\u001a\u0006\bÍ\u0001\u0010©\u0001\"\u0006\bÎ\u0001\u0010«\u0001R\"\u0010Ó\u0001\u001a\u0005\u0018\u00010Ð\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010Ñ\u0001\u001a\u0006\b\u0086\u0001\u0010Ò\u0001R\"\u0010Õ\u0001\u001a\u0005\u0018\u00010Ð\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Ñ\u0001\u001a\u0006\b\u008e\u0001\u0010Ò\u0001R)\u0010Ú\u0001\u001a\u00020P2\u0006\u0010g\u001a\u00020P8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R)\u0010ß\u0001\u001a\u00020T2\u0006\u0010g\u001a\u00020T8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R)\u0010à\u0001\u001a\u00020+2\u0006\u0010g\u001a\u00020+8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R)\u0010æ\u0001\u001a\u00020+2\u0006\u0010g\u001a\u00020+8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bä\u0001\u0010á\u0001\"\u0006\bå\u0001\u0010ã\u0001R)\u0010ê\u0001\u001a\u00020X2\u0006\u0010g\u001a\u00020X8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009d\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R)\u0010í\u0001\u001a\u00020+2\u0006\u0010g\u001a\u00020+8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bë\u0001\u0010á\u0001\"\u0006\bì\u0001\u0010ã\u0001R)\u0010ð\u0001\u001a\u00020+2\u0006\u0010g\u001a\u00020+8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bî\u0001\u0010á\u0001\"\u0006\bï\u0001\u0010ã\u0001R)\u0010ó\u0001\u001a\u00020+2\u0006\u0010g\u001a\u00020+8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bñ\u0001\u0010á\u0001\"\u0006\bò\u0001\u0010ã\u0001R)\u0010ø\u0001\u001a\u00020b2\u0006\u0010g\u001a\u00020b8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R+\u0010þ\u0001\u001a\u00030ù\u00012\u0007\u0010g\u001a\u00030ù\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001¨\u0006\u008a\u0002"}, m28432d2 = {"Lio/github/sceneview/ar/ArSceneView;", "Lio/github/sceneview/SceneView;", "Lym;", "Lxm;", "Lio/github/sceneview/ar/arcore/ArSession;", "session", "", "m", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "F", "c", "Lcom/google/ar/core/Config;", "config", "i", "LPy1;", "frameTime", "M", "Lrm;", "arFrame", "q0", "Lio/github/sceneview/ar/arcore/LightEstimator;", "lightEstimation", "C0", "Lkotlin/Function2;", "applyConfig", "p0", "Landroid/view/MotionEvent;", "motionEvent", "Lio/github/sceneview/node/Node;", "node", "", "Lio/github/sceneview/renderable/Renderable;", "renderable", "h0", "(Landroid/view/MotionEvent;Lio/github/sceneview/node/Node;Ljava/lang/Integer;)V", "Lcom/google/ar/core/HitResult;", "hitResult", "D0", "Lhu1;", "Lio/github/sceneview/math/Position;", "position", "", "plane", "depth", "instant", "B0", "", "xPx", "yPx", "approximateDistance", "A0", "L", "Lcom/google/ar/sceneform/ArCameraNode;", "G", "Lcom/google/ar/sceneform/ArCameraNode;", "v0", "()Lcom/google/ar/sceneform/ArCameraNode;", "cameraNode", "Lio/github/sceneview/ar/ArSceneLifecycle;", "H", "Lkotlin/Lazy;", "x0", "()Lio/github/sceneview/ar/ArSceneLifecycle;", "lifecycle", "Lio/github/sceneview/ar/ARCore;", "I", "Lio/github/sceneview/ar/ARCore;", "F3", "()Lio/github/sceneview/ar/ARCore;", "arCore", "Lio/github/sceneview/SceneView$b;", "J", "Lio/github/sceneview/SceneView$b;", "S", "()Lio/github/sceneview/SceneView$b;", "setFrameRate", "(Lio/github/sceneview/SceneView$b;)V", "frameRate", "Lcom/google/ar/core/Config$FocusMode;", "K", "Lcom/google/ar/core/Config$FocusMode;", "_focusMode", "Lcom/google/ar/core/Config$PlaneFindingMode;", "P", "Lcom/google/ar/core/Config$PlaneFindingMode;", "_planeFindingMode", "Lcom/google/ar/core/Config$DepthMode;", "Q", "Lcom/google/ar/core/Config$DepthMode;", "_depthMode", "R", "Z", "_instantPlacementEnabled", "_cloudAnchorEnabled", "T", "_geospatialEnabled", "Lcom/google/ar/core/Config$LightEstimationMode;", "U", "Lcom/google/ar/core/Config$LightEstimationMode;", "_sessionLightEstimationMode", "Lcom/google/ar/core/CameraConfig$FacingDirection;", "value", "W", "Lcom/google/ar/core/CameraConfig$FacingDirection;", "getCameraFacingDirection", "()Lcom/google/ar/core/CameraConfig$FacingDirection;", "setCameraFacingDirection", "(Lcom/google/ar/core/CameraConfig$FacingDirection;)V", "cameraFacingDirection", "Lrm;", "getCurrentFrame", "()Lrm;", "setCurrentFrame", "(Lrm;)V", "currentFrame", "Lqm;", "Lqm;", "getArCameraStream", "()Lqm;", "arCameraStream", "LnV3;", "r0", "LnV3;", "z0", "()LnV3;", "planeRenderer", "s0", "Lio/github/sceneview/ar/arcore/LightEstimator;", "getLightEstimator", "()Lio/github/sceneview/ar/arcore/LightEstimator;", "lightEstimator", "Lio/github/sceneview/light/Light;", "t0", "Ljava/lang/Integer;", "getMainLightEstimated", "()Ljava/lang/Integer;", "G0", "(Ljava/lang/Integer;)V", "mainLightEstimated", "Lwf1;", AbstractC26684u0.f100690q, "Lwf1;", "getEnvironmentEstimated", "()Lwf1;", "E0", "(Lwf1;)V", "environmentEstimated", "Lcom/google/android/filament/IndirectLight;", "Lcom/google/android/filament/IndirectLight;", "getIndirectLightEstimated", "()Lcom/google/android/filament/IndirectLight;", "F0", "(Lcom/google/android/filament/IndirectLight;)V", "indirectLightEstimated", "Lcom/google/ar/core/TrackingFailureReason;", "w0", "Lcom/google/ar/core/TrackingFailureReason;", "getTrackingFailureReason", "()Lcom/google/ar/core/TrackingFailureReason;", "setTrackingFailureReason", "(Lcom/google/ar/core/TrackingFailureReason;)V", "trackingFailureReason", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlin/jvm/functions/Function1;", "getOnArSessionCreated", "()Lkotlin/jvm/functions/Function1;", "setOnArSessionCreated", "(Lkotlin/jvm/functions/Function1;)V", "onArSessionCreated", "y0", "getOnArSessionFailed", "setOnArSessionFailed", "onArSessionFailed", "getOnArSessionResumed", "setOnArSessionResumed", "onArSessionResumed", "Lkotlin/jvm/functions/Function2;", "getOnArSessionConfigChanged", "()Lkotlin/jvm/functions/Function2;", "setOnArSessionConfigChanged", "(Lkotlin/jvm/functions/Function2;)V", "onArSessionConfigChanged", "getOnArFrame", "setOnArFrame", "onArFrame", "getOnTapAr", "setOnTapAr", "onTapAr", "", "Lcom/google/ar/core/AugmentedImage;", "augmentedImage", "Ljava/util/List;", "()Ljava/util/List;", "setOnAugmentedImageUpdate", "(Ljava/util/List;)V", "onAugmentedImageUpdate", "Lcom/google/ar/core/AugmentedFace;", "augmentedFace", "getOnAugmentedFaceUpdate", "setOnAugmentedFaceUpdate", "onAugmentedFaceUpdate", "getOnArTrackingFailureChanged", "setOnArTrackingFailureChanged", "onArTrackingFailureChanged", "", "Ljava/lang/Void;", "()Ljava/lang/Void;", "cameraGestureDetector", "H0", "cameraManipulator", "getFocusMode", "()Lcom/google/ar/core/Config$FocusMode;", "setFocusMode", "(Lcom/google/ar/core/Config$FocusMode;)V", "focusMode", "getPlaneFindingMode", "()Lcom/google/ar/core/Config$PlaneFindingMode;", "setPlaneFindingMode", "(Lcom/google/ar/core/Config$PlaneFindingMode;)V", "planeFindingMode", "isDepthOcclusionEnabled", "()Z", "setDepthOcclusionEnabled", "(Z)V", "getDepthEnabled", "setDepthEnabled", "depthEnabled", "()Lcom/google/ar/core/Config$DepthMode;", "setDepthMode", "(Lcom/google/ar/core/Config$DepthMode;)V", "depthMode", "getInstantPlacementEnabled", "setInstantPlacementEnabled", "instantPlacementEnabled", "getCloudAnchorEnabled", "setCloudAnchorEnabled", "cloudAnchorEnabled", "getGeospatialEnabled", "setGeospatialEnabled", "geospatialEnabled", "getSessionLightEstimationMode", "()Lcom/google/ar/core/Config$LightEstimationMode;", "setSessionLightEstimationMode", "(Lcom/google/ar/core/Config$LightEstimationMode;)V", "sessionLightEstimationMode", "LLq2;", "getLightEstimationMode", "()LLq2;", "setLightEstimationMode", "(LLq2;)V", "lightEstimationMode", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "", "Lcom/google/ar/core/Session$Feature;", "sessionFeatures", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/util/Set;Lcom/google/ar/sceneform/ArCameraNode;)V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: io.github.sceneview.ar.ArSceneView */
/* loaded from: classes6.dex */
public class ArSceneView extends SceneView implements InterfaceC30697ym, InterfaceC30295xm {

    /* renamed from: A0 */
    public Function2<? super ArSession, ? super Config, Unit> f87958A0;

    /* renamed from: B0 */
    public Function1<? super C27991rm, Unit> f87959B0;

    /* renamed from: C0 */
    public Function2<? super HitResult, ? super MotionEvent, Unit> f87960C0;

    /* renamed from: D0 */
    public List<Function1<AugmentedImage, Unit>> f87961D0;

    /* renamed from: E0 */
    public Function1<? super AugmentedFace, Unit> f87962E0;

    /* renamed from: F0 */
    public Function1<? super TrackingFailureReason, Unit> f87963F0;

    /* renamed from: G */
    public final ArCameraNode f87964G;

    /* renamed from: G0 */
    public final Void f87965G0;

    /* renamed from: H */
    public final Lazy f87966H;

    /* renamed from: H0 */
    public final Void f87967H0;

    /* renamed from: I */
    public final ARCore f87968I;

    /* renamed from: J */
    public SceneView.AbstractC23369b f87969J;

    /* renamed from: K */
    public Config.FocusMode f87970K;

    /* renamed from: P */
    public Config.PlaneFindingMode f87971P;

    /* renamed from: Q */
    public Config.DepthMode f87972Q;

    /* renamed from: R */
    public boolean f87973R;

    /* renamed from: S */
    public boolean f87974S;

    /* renamed from: T */
    public boolean f87975T;

    /* renamed from: U */
    public Config.LightEstimationMode f87976U;

    /* renamed from: W */
    public CameraConfig.FacingDirection f87977W;

    /* renamed from: p0 */
    public C27991rm f87978p0;

    /* renamed from: q0 */
    public final C27679qm f87979q0;

    /* renamed from: r0 */
    public final C45715nV3 f87980r0;

    /* renamed from: s0 */
    public final LightEstimator f87981s0;

    /* renamed from: t0 */
    public Integer f87982t0;

    /* renamed from: u0 */
    public C51143wf1 f87983u0;

    /* renamed from: v0 */
    public IndirectLight f87984v0;

    /* renamed from: w0 */
    public TrackingFailureReason f87985w0;

    /* renamed from: x0 */
    public Function1<? super ArSession, Unit> f87986x0;

    /* renamed from: y0 */
    public Function1<? super Exception, Unit> f87987y0;

    /* renamed from: z0 */
    public Function1<? super ArSession, Unit> f87988z0;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/github/sceneview/ar/arcore/ArSession;", "arSession", "Lcom/google/ar/core/Config;", "config", "", C17296a.f69688o, "(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.ArSceneView$a */
    /* loaded from: classes6.dex */
    public static final class C23388a extends Lambda implements Function2<ArSession, Config, Unit> {

        /* renamed from: g */
        public final /* synthetic */ CameraConfig.FacingDirection f87989g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23388a(CameraConfig.FacingDirection facingDirection) {
            super(2);
            this.f87989g = facingDirection;
        }

        /* renamed from: a */
        public final void m33386a(ArSession arSession, Config config) {
            Intrinsics.checkNotNullParameter(arSession, "arSession");
            Intrinsics.checkNotNullParameter(config, "config");
            CameraConfigFilter cameraConfigFilter = new CameraConfigFilter(arSession);
            cameraConfigFilter.setFacingDirection(this.f87989g);
            Unit unit = Unit.INSTANCE;
            arSession.setCameraConfig(arSession.getSupportedCameraConfigs(cameraConfigFilter).get(0));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ArSession arSession, Config config) {
            m33386a(arSession, config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/github/sceneview/ar/arcore/ArSession;", "session", "", C17296a.f69688o, "(Lio/github/sceneview/ar/arcore/ArSession;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.ArSceneView$b */
    /* loaded from: classes6.dex */
    public static final class C23389b extends Lambda implements Function1<ArSession, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<ArSession, Config, Unit> f87990g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Config;", "config", "", C17296a.f69688o, "(Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: io.github.sceneview.ar.ArSceneView$b$a */
        /* loaded from: classes6.dex */
        public static final class C23390a extends Lambda implements Function1<Config, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function2<ArSession, Config, Unit> f87991g;

            /* renamed from: h */
            public final /* synthetic */ ArSession f87992h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C23390a(Function2<? super ArSession, ? super Config, Unit> function2, ArSession arSession) {
                super(1);
                this.f87991g = function2;
                this.f87992h = arSession;
            }

            /* renamed from: a */
            public final void m33384a(Config config) {
                Intrinsics.checkNotNullParameter(config, "config");
                this.f87991g.invoke(this.f87992h, config);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Config config) {
                m33384a(config);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23389b(Function2<? super ArSession, ? super Config, Unit> function2) {
            super(1);
            this.f87990g = function2;
        }

        /* renamed from: a */
        public final void m33385a(ArSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            session.m33375a(new C23390a(this.f87990g, session));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ArSession arSession) {
            m33385a(arSession);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/github/sceneview/ar/ArSceneLifecycle;", "b", "()Lio/github/sceneview/ar/ArSceneLifecycle;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.ArSceneView$c */
    /* loaded from: classes6.dex */
    public static final class C23391c extends Lambda implements Function0<ArSceneLifecycle> {
        public C23391c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ArSceneLifecycle invoke() {
            return new ArSceneLifecycle(ArSceneView.this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: io.github.sceneview.ar.ArSceneView$d */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C23392d extends FunctionReferenceImpl implements Function1<LightEstimator, Unit> {
        public C23392d(Object obj) {
            super(1, obj, ArSceneView.class, "onLightEstimationUpdate", "onLightEstimationUpdate(Lio/github/sceneview/ar/arcore/LightEstimator;)V", 0);
        }

        /* renamed from: a */
        public final void m33382a(LightEstimator p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ArSceneView) this.receiver).m33407C0(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LightEstimator lightEstimator) {
            m33382a(lightEstimator);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Config;", "config", "", C17296a.f69688o, "(Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.ArSceneView$e */
    /* loaded from: classes6.dex */
    public static final class C23393e extends Lambda implements Function1<Config, Unit> {
        public C23393e() {
            super(1);
        }

        /* renamed from: a */
        public final void m33381a(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            config.setPlaneFindingMode(ArSceneView.this.f87971P);
            config.setDepthMode(ArSceneView.this.f87972Q);
            C0204Am.m115304g(config, ArSceneView.this.f87973R);
            C0204Am.m115306e(config, ArSceneView.this.f87974S);
            config.setLightEstimationMode(ArSceneView.this.f87976U);
            C0204Am.m115305f(config, ArSceneView.this.f87975T);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m33381a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Config;", "config", "", C17296a.f69688o, "(Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.ArSceneView$f */
    /* loaded from: classes6.dex */
    public static final class C23394f extends Lambda implements Function1<Config, Unit> {
        public C23394f() {
            super(1);
        }

        /* renamed from: a */
        public final void m33380a(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            config.setFocusMode(ArSceneView.this.f87970K);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m33380a(config);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ArSceneView(Context context) {
        this(context, null, 0, 0, null, null, 62, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ HitResult hitTest$default(ArSceneView arSceneView, float f, float f2, boolean z, boolean z2, boolean z3, float f3, int i, Object obj) {
        if (obj == null) {
            if ((i & 32) != 0) {
                f3 = 2.0f;
            }
            return arSceneView.m33409A0(f, f2, z, z2, z3, f3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hitTest");
    }

    /* renamed from: r0 */
    public static final void m33395r0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* renamed from: A0 */
    public final HitResult m33409A0(float f, float f2, boolean z, boolean z2, boolean z3, float f3) {
        C27991rm c27991rm = this.f87978p0;
        if (c27991rm != null) {
            return c27991rm.m15440j(f, f2, z, z2, z3, f3);
        }
        return null;
    }

    /* renamed from: B0 */
    public final HitResult m33408B0(C42400hu1 position, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(position, "position");
        C27991rm c27991rm = this.f87978p0;
        if (c27991rm != null) {
            return c27991rm.m15439k(position, z, z2, z3);
        }
        return null;
    }

    /* renamed from: C0 */
    public void m33407C0(LightEstimator lightEstimation) {
        Intrinsics.checkNotNullParameter(lightEstimation, "lightEstimation");
        m33403G0(lightEstimation.m33344e());
        m33405E0(lightEstimation.m33345d());
    }

    /* renamed from: D0 */
    public void m33406D0(HitResult hitResult, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(hitResult, "hitResult");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Function2<? super HitResult, ? super MotionEvent, Unit> function2 = this.f87960C0;
        if (function2 != null) {
            function2.invoke(hitResult, motionEvent);
        }
    }

    /* renamed from: E0 */
    public final void m33405E0(C51143wf1 c51143wf1) {
        IndirectLight indirectLight;
        this.f87983u0 = c51143wf1;
        if (c51143wf1 != null) {
            indirectLight = c51143wf1.m6540b();
        } else {
            indirectLight = null;
        }
        m33404F0(indirectLight);
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: F */
    public void mo4733F(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        InterfaceC30295xm.C30296a.m4725d(this, exception);
        Function1<? super Exception, Unit> function1 = this.f87987y0;
        if (function1 != null) {
            function1.invoke(exception);
        }
    }

    /* renamed from: F0 */
    public final void m33404F0(IndirectLight indirectLight) {
        if (!Intrinsics.areEqual(this.f87984v0, indirectLight)) {
            this.f87984v0 = indirectLight;
            Scene m33462Y = m33462Y();
            if (indirectLight == null) {
                indirectLight = m33466U();
            }
            m33462Y.setIndirectLight(indirectLight);
        }
    }

    @Override // p000.InterfaceC30697ym
    /* renamed from: F3 */
    public ARCore mo2633F3() {
        return this.f87968I;
    }

    /* renamed from: G0 */
    public final void m33403G0(Integer num) {
        if (!Intrinsics.areEqual(this.f87982t0, num)) {
            Integer num2 = this.f87982t0;
            if (num2 == null) {
                num2 = m33465V();
            }
            if (num2 != null) {
                m33449m0(num2.intValue());
            }
            this.f87982t0 = num;
            if (num == null) {
                num = m33465V();
            }
            if (num != null) {
                m33473K(num.intValue());
            }
        }
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: I */
    public void mo15405I(int i, int i2) {
        InterfaceC30295xm.C30296a.m4722g(this, i, i2);
    }

    @Override // io.github.sceneview.SceneView
    /* renamed from: L */
    public void mo33402L() {
        super.mo33402L();
        try {
            this.f87979q0.m17119b();
        } catch (Exception unused) {
        }
        try {
            this.f87980r0.m23603b();
        } catch (Exception unused2) {
        }
    }

    @Override // io.github.sceneview.SceneView
    /* renamed from: M */
    public void mo33401M(C35340Py1 frameTime) {
        C27991rm m33376D;
        C35340Py1 c35340Py1;
        Intrinsics.checkNotNullParameter(frameTime, "frameTime");
        ArSession m33394s0 = m33394s0();
        if (m33394s0 != null && (m33376D = m33394s0.m33376D(frameTime)) != null && m33376D.m15447c().getTimestamp() != 0) {
            C35340Py1 m15445e = m33376D.m15445e();
            C27991rm c27991rm = this.f87978p0;
            if (c27991rm != null) {
                c35340Py1 = c27991rm.m15445e();
            } else {
                c35340Py1 = null;
            }
            if (!Intrinsics.areEqual(m15445e, c35340Py1)) {
                this.f87978p0 = m33376D;
                m33396q0(m33376D);
                super.mo33401M(frameTime);
            }
        }
    }

    @Override // io.github.sceneview.SceneView
    /* renamed from: S */
    public SceneView.AbstractC23369b mo33400S() {
        return this.f87969J;
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: c */
    public void mo4732c(ArSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        InterfaceC30295xm.C30296a.m4724e(this, session);
        session.m33375a(new C23394f());
        Function1<? super ArSession, Unit> function1 = this.f87988z0;
        if (function1 != null) {
            function1.invoke(session);
        }
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: g */
    public void mo15404g(C35340Py1 c35340Py1) {
        InterfaceC30295xm.C30296a.m4723f(this, c35340Py1);
    }

    @Override // io.github.sceneview.SceneView
    public /* bridge */ /* synthetic */ C33260Hb0 getCameraGestureDetector() {
        return (C33260Hb0) m33393t0();
    }

    @Override // io.github.sceneview.SceneView
    public /* bridge */ /* synthetic */ Manipulator getCameraManipulator() {
        return (Manipulator) m33392u0();
    }

    @Override // io.github.sceneview.SceneView
    /* renamed from: h0 */
    public void mo33399h0(MotionEvent motionEvent, Node node, Integer num) {
        ArSession m33394s0;
        C27991rm m33372e;
        HitResult m15437m;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        super.mo33399h0(motionEvent, node, num);
        if (node == null && (m33394s0 = m33394s0()) != null && (m33372e = m33394s0.m33372e()) != null && (m15437m = C27991rm.m15437m(m33372e, motionEvent, false, false, false, 0.0f, 30, null)) != null) {
            m33406D0(m15437m, motionEvent);
        }
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: i */
    public void mo4731i(ArSession session, Config config) {
        boolean z;
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(config, "config");
        InterfaceC30295xm.C30296a.m4727b(this, session, config);
        if (session.getCameraConfig().getFacingDirection() == CameraConfig.FacingDirection.FRONT) {
            z = true;
        } else {
            z = false;
        }
        setFrontFaceWindingInverted(z);
        Function2<? super ArSession, ? super Config, Unit> function2 = this.f87958A0;
        if (function2 != null) {
            function2.invoke(session, config);
        }
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: m */
    public void mo4730m(ArSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        InterfaceC30295xm.C30296a.m4726c(this, session);
        session.setCameraTextureNames(this.f87979q0.m17118c());
        session.m33375a(new C23393e());
        m33474J(this.f87979q0.m17117d());
        Function1<? super ArSession, Unit> function1 = this.f87986x0;
        if (function1 != null) {
            function1.invoke(session);
        }
    }

    /* renamed from: p0 */
    public final void m33397p0(Function2<? super ArSession, ? super Config, Unit> applyConfig) {
        Intrinsics.checkNotNullParameter(applyConfig, "applyConfig");
        getLifecycle().m33414u(new C23389b(applyConfig));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (r1 != false) goto L7;
     */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m33396q0(C27991rm arFrame) {
        TrackingFailureReason trackingFailureReason;
        Consumer consumer;
        boolean z;
        Intrinsics.checkNotNullParameter(arFrame, "arFrame");
        Camera m15448b = arFrame.m15448b();
        C34093Kp5.m98261a(m33472N(), C34430Mb0.m95150a(m15448b));
        getCameraNode().m48382X0(m15448b);
        this.f87979q0.m17113h(arFrame);
        this.f87980r0.m23598g(arFrame);
        if (!C34430Mb0.m95150a(m15448b)) {
            trackingFailureReason = m15448b.getTrackingFailureReason();
            if (trackingFailureReason != TrackingFailureReason.NONE) {
                z = true;
            } else {
                z = false;
            }
        }
        trackingFailureReason = null;
        setTrackingFailureReason(trackingFailureReason);
        if (!this.f87961D0.isEmpty()) {
            for (AugmentedImage augmentedImage : arFrame.m15443g()) {
                Iterator<T> it = this.f87961D0.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(augmentedImage);
                }
            }
        }
        if (this.f87962E0 != null) {
            List<AugmentedFace> m15444f = arFrame.m15444f();
            final Function1<? super AugmentedFace, Unit> function1 = this.f87962E0;
            if (function1 != null) {
                consumer = new Consumer() { // from class: zm
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ArSceneView.m33395r0(Function1.this, obj);
                    }
                };
            } else {
                consumer = null;
            }
            m15444f.forEach(consumer);
        }
        ArrayList<InterfaceC30295xm> arrayList = new ArrayList();
        for (InterfaceC32929Fq2 interfaceC32929Fq2 : getLifecycle().m83453q()) {
            if (!(interfaceC32929Fq2 instanceof InterfaceC30295xm)) {
                interfaceC32929Fq2 = null;
            }
            InterfaceC30295xm interfaceC30295xm = (InterfaceC30295xm) interfaceC32929Fq2;
            if (interfaceC30295xm != null) {
                arrayList.add(interfaceC30295xm);
            }
        }
        for (InterfaceC30295xm interfaceC30295xm2 : arrayList) {
            interfaceC30295xm2.mo4729r(arFrame);
        }
        Function1<? super C27991rm, Unit> function12 = this.f87959B0;
        if (function12 != null) {
            function12.invoke(arFrame);
        }
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: r */
    public void mo4729r(C27991rm c27991rm) {
        InterfaceC30295xm.C30296a.m4728a(this, c27991rm);
    }

    /* renamed from: s0 */
    public ArSession m33394s0() {
        return InterfaceC30697ym.C30698a.m2632a(this);
    }

    public final void setCameraFacingDirection(CameraConfig.FacingDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87977W = value;
        m33397p0(new C23388a(value));
    }

    public final void setCloudAnchorEnabled(boolean z) {
        this.f87974S = z;
        ArSession m33394s0 = m33394s0();
        if (m33394s0 != null) {
            m33394s0.m33359w(z);
        }
    }

    public final void setCurrentFrame(C27991rm c27991rm) {
        this.f87978p0 = c27991rm;
    }

    public final void setDepthEnabled(boolean z) {
        Config.DepthMode depthMode;
        if (z) {
            depthMode = Config.DepthMode.AUTOMATIC;
        } else {
            depthMode = Config.DepthMode.DISABLED;
        }
        setDepthMode(depthMode);
    }

    public final void setDepthMode(Config.DepthMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87972Q = value;
        ArSession m33394s0 = m33394s0();
        if (m33394s0 != null) {
            m33394s0.m33358x(value);
        }
    }

    public final void setDepthOcclusionEnabled(boolean z) {
        this.f87979q0.m17115f(z);
    }

    public final void setFocusMode(Config.FocusMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87970K = value;
        ArSession m33394s0 = m33394s0();
        if (m33394s0 != null) {
            m33394s0.m33357y(value);
        }
    }

    @Override // io.github.sceneview.SceneView
    public void setFrameRate(SceneView.AbstractC23369b abstractC23369b) {
        Intrinsics.checkNotNullParameter(abstractC23369b, "<set-?>");
        this.f87969J = abstractC23369b;
    }

    public final void setGeospatialEnabled(boolean z) {
        this.f87975T = z;
        ArSession m33394s0 = m33394s0();
        if (m33394s0 != null) {
            m33394s0.m33356z(z);
        }
    }

    public final void setInstantPlacementEnabled(boolean z) {
        this.f87973R = z;
        ArSession m33394s0 = m33394s0();
        if (m33394s0 != null) {
            m33394s0.m33379A(z);
        }
    }

    public final void setLightEstimationMode(EnumC34333Lq2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87981s0.m33337p(value);
    }

    public final void setOnArFrame(Function1<? super C27991rm, Unit> function1) {
        this.f87959B0 = function1;
    }

    public final void setOnArSessionConfigChanged(Function2<? super ArSession, ? super Config, Unit> function2) {
        this.f87958A0 = function2;
    }

    public final void setOnArSessionCreated(Function1<? super ArSession, Unit> function1) {
        this.f87986x0 = function1;
    }

    public final void setOnArSessionFailed(Function1<? super Exception, Unit> function1) {
        this.f87987y0 = function1;
    }

    public final void setOnArSessionResumed(Function1<? super ArSession, Unit> function1) {
        this.f87988z0 = function1;
    }

    public final void setOnArTrackingFailureChanged(Function1<? super TrackingFailureReason, Unit> function1) {
        this.f87963F0 = function1;
    }

    public final void setOnAugmentedFaceUpdate(Function1<? super AugmentedFace, Unit> function1) {
        this.f87962E0 = function1;
    }

    public final void setOnAugmentedImageUpdate(List<Function1<AugmentedImage, Unit>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f87961D0 = list;
    }

    public final void setOnTapAr(Function2<? super HitResult, ? super MotionEvent, Unit> function2) {
        this.f87960C0 = function2;
    }

    public final void setPlaneFindingMode(Config.PlaneFindingMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87971P = value;
        ArSession m33394s0 = m33394s0();
        if (m33394s0 != null) {
            m33394s0.m33377C(value);
        }
    }

    public final void setSessionLightEstimationMode(Config.LightEstimationMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87976U = value;
        ArSession m33394s0 = m33394s0();
        if (m33394s0 != null) {
            m33394s0.m33378B(value);
        }
    }

    public void setTrackingFailureReason(TrackingFailureReason trackingFailureReason) {
        if (this.f87985w0 != trackingFailureReason) {
            this.f87985w0 = trackingFailureReason;
            Function1<? super TrackingFailureReason, Unit> function1 = this.f87963F0;
            if (function1 != null) {
                function1.invoke(trackingFailureReason);
            }
        }
    }

    /* renamed from: t0 */
    public Void m33393t0() {
        return this.f87965G0;
    }

    /* renamed from: u0 */
    public Void m33392u0() {
        return this.f87967H0;
    }

    @Override // io.github.sceneview.SceneView
    /* renamed from: v0 */
    public ArCameraNode getCameraNode() {
        return this.f87964G;
    }

    /* renamed from: w0 */
    public final Config.DepthMode m33390w0() {
        Config.DepthMode m33370j;
        ArSession m33394s0 = m33394s0();
        return (m33394s0 == null || (m33370j = m33394s0.m33370j()) == null) ? this.f87972Q : m33370j;
    }

    @Override // io.github.sceneview.SceneView, p000.LifecycleOwner
    /* renamed from: x0 */
    public ArSceneLifecycle getLifecycle() {
        return (ArSceneLifecycle) this.f87966H.getValue();
    }

    /* renamed from: y0 */
    public final List<Function1<AugmentedImage, Unit>> m33388y0() {
        return this.f87961D0;
    }

    /* renamed from: z0 */
    public final C45715nV3 m33387z0() {
        return this.f87980r0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ArSceneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ArSceneView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, null, null, 56, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ArSceneView(Context context, AttributeSet attributeSet, int i, int i2, Set set, ArCameraNode arCameraNode, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? SetsKt__SetsKt.emptySet() : set, (i3 & 32) != 0 ? new ArCameraNode() : arCameraNode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ArSceneView(Context context, AttributeSet attributeSet, int i, int i2, Set<? extends Session.Feature> sessionFeatures, ArCameraNode cameraNode) {
        super(context, attributeSet, i, i2, cameraNode);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionFeatures, "sessionFeatures");
        Intrinsics.checkNotNullParameter(cameraNode, "cameraNode");
        this.f87964G = cameraNode;
        lazy = LazyKt__LazyJVMKt.lazy(new C23391c());
        this.f87966H = lazy;
        this.f87968I = new ARCore(m33472N(), getLifecycle(), sessionFeatures);
        this.f87969J = SceneView.AbstractC23369b.C23371b.f87915b;
        this.f87970K = Config.FocusMode.AUTO;
        this.f87971P = Config.PlaneFindingMode.HORIZONTAL_AND_VERTICAL;
        this.f87972Q = Config.DepthMode.DISABLED;
        this.f87973R = true;
        this.f87976U = Config.LightEstimationMode.ENVIRONMENTAL_HDR;
        this.f87977W = CameraConfig.FacingDirection.BACK;
        this.f87979q0 = new C27679qm(this, null, null, 6, null);
        this.f87980r0 = new C45715nV3(this);
        this.f87981s0 = new LightEstimator(getLifecycle(), new C23392d(this));
        this.f87961D0 = new ArrayList();
    }
}
