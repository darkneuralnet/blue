package io.github.sceneview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Colors;
import com.google.android.filament.Entity;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.Skybox;
import com.google.android.filament.SwapChain;
import com.google.android.filament.View;
import com.google.android.filament.Viewport;
import com.google.android.filament.android.DisplayHelper;
import com.google.android.filament.android.UiHelper;
import com.google.android.filament.utils.KTX1Loader;
import com.google.android.filament.utils.Manipulator;
import com.google.p034ar.sceneform.CameraNode;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.github.sceneview.SceneView;
import io.github.sceneview.node.ModelNode;
import io.github.sceneview.node.Node;
import io.github.sceneview.utils.SurfaceMirrorer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C33260Hb0;
import p000.C42577iC1;
import p000.Q83;
@Metadata(m28433d1 = {"\u0000Ê\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0004'%\\bBE\b\u0007\u0012\b\u0010¿\u0002\u001a\u00030¾\u0002\u0012\f\b\u0002\u0010Á\u0002\u001a\u0005\u0018\u00010À\u0002\u0012\t\b\u0002\u0010Â\u0002\u001a\u000201\u0012\t\b\u0002\u0010Ã\u0002\u001a\u000201\u0012\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0080\u0001¢\u0006\u0006\bÄ\u0002\u0010Å\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J)\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0096\u0001J\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010 \u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010!\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0019\u0010\"\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J)\u0010%\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012H\u0096\u0001J\u0011\u0010&\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0011\u0010'\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0007H\u0014J\b\u0010,\u001a\u00020\u0007H\u0014J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016J0\u00106\u001a\u00020\u00072\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00104\u001a\u0002012\u0006\u00105\u001a\u000201H\u0014J\u0010\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u000207H\u0016J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010>\u001a\u00020\u00072\b\b\u0001\u0010=\u001a\u000201J\u0010\u0010?\u001a\u00020\u00072\b\b\u0001\u0010=\u001a\u000201J\u0014\u0010B\u001a\u00020\u00072\f\b\u0001\u0010A\u001a\u000601j\u0002`@J\u0014\u0010C\u001a\u00020\u00072\f\b\u0001\u0010A\u001a\u000601j\u0002`@J\u0012\u0010F\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010DH\u0017J\u0010\u0010I\u001a\u00020/2\u0006\u0010H\u001a\u00020GH\u0017J\u0010\u0010J\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J1\u0010O\u001a\u00020\u00072\u0006\u0010H\u001a\u00020G2\b\u0010L\u001a\u0004\u0018\u00010K2\u000e\u0010N\u001a\n\u0018\u000101j\u0004\u0018\u0001`MH\u0016¢\u0006\u0004\bO\u0010PJT\u0010W\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u0002012\u0006\u0010Q\u001a\u0002012<\u0010V\u001a8\u0012\u0015\u0012\u0013\u0018\u00010S¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(L\u0012\u0017\u0012\u001501j\u0002`M¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(N\u0012\u0004\u0012\u00020\u00070RJ1\u0010Y\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020G2!\u0010V\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070XJ\b\u0010Z\u001a\u00020\u0007H\u0016R\u001b\u0010`\u001a\u00020[8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R \u0010\u0085\u0001\u001a\u00030\u0080\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001RB\u0010\u008d\u0001\u001a\n\u0018\u000101j\u0004\u0018\u0001`@2\u000f\u0010\u0086\u0001\u001a\n\u0018\u000101j\u0004\u0018\u0001`@8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R7\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008e\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u001c\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R7\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0095\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\"\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R1\u0010\u009d\u0001\u001a\u00020/2\u0007\u0010\u0086\u0001\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b!\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R\u001d\u0010¦\u0001\u001a\u00030¡\u00018\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001d\u0010ª\u0001\u001a\u0004\u0018\u00010K8F¢\u0006\u000f\n\u0005\b\u0019\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R)\u0010±\u0001\u001a\u00030«\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u001a\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R'\u0010¶\u0001\u001a\u000b\u0012\u0004\u0012\u00020K\u0018\u00010²\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\f\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001RE\u0010¼\u0001\u001a\u001f\u0012\u0013\u0012\u00110:¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\u0007\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bJ\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R{\u0010Ä\u0001\u001aT\u0012\u0013\u0012\u00110G¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(H\u0012\u0015\u0012\u0013\u0018\u00010K¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(L\u0012\u001b\u0012\u0019\u0018\u000101j\u0004\u0018\u0001`M¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(N\u0012\u0004\u0012\u00020\u0007\u0018\u00010½\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010È\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010Ì\u0001\u001a\u00030É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u001b\u0010Ï\u0001\u001a\u0005\u0018\u00010Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010Î\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R.\u0010Ù\u0001\u001a\t\u0012\u0004\u0012\u00020K0Ô\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b\u001e\u0010Õ\u0001\u001a\u0005\bb\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R\u001f\u0010Ý\u0001\u001a\u00030Ú\u00018FX\u0086\u0084\u0002¢\u0006\u000e\n\u0004\b\u000f\u0010]\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u001f\u0010á\u0001\u001a\u00030Þ\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bQ\u0010]\u001a\u0006\bß\u0001\u0010à\u0001R\u0018\u0010ã\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010â\u0001R\u001b\u0010æ\u0001\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001f\u0010ê\u0001\u001a\u00030ç\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u001d\u0010]\u001a\u0006\bè\u0001\u0010é\u0001R!\u0010î\u0001\u001a\u0005\u0018\u00010ë\u00018TX\u0094\u0084\u0002¢\u0006\u000e\n\u0004\b\u000e\u0010]\u001a\u0006\bì\u0001\u0010í\u0001R!\u0010ò\u0001\u001a\u0005\u0018\u00010ï\u00018TX\u0094\u0084\u0002¢\u0006\u000e\n\u0004\b\u0018\u0010]\u001a\u0006\bð\u0001\u0010ñ\u0001R\u0018\u0010ô\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bó\u0001\u0010>R \u0010ù\u0001\u001a\u00030õ\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bö\u0001\u0010]\u001a\u0006\b÷\u0001\u0010ø\u0001R,\u0010ÿ\u0001\u001a\u00030ú\u00012\b\u0010\u0086\u0001\u001a\u00030ú\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R,\u0010\u0085\u0002\u001a\u00030\u0080\u00022\b\u0010\u0086\u0001\u001a\u00030\u0080\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R,\u0010\u008b\u0002\u001a\u00030\u0086\u00022\b\u0010\u0086\u0001\u001a\u00030\u0086\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R,\u0010\u0091\u0002\u001a\u00030\u008c\u00022\b\u0010\u0086\u0001\u001a\u00030\u008c\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002\"\u0006\b\u008f\u0002\u0010\u0090\u0002R,\u0010\u0097\u0002\u001a\u00030\u0092\u00022\b\u0010\u0086\u0001\u001a\u00030\u0092\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0006\b\u0095\u0002\u0010\u0096\u0002R,\u0010\u009d\u0002\u001a\u00030\u0098\u00022\b\u0010\u0086\u0001\u001a\u00030\u0098\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002\"\u0006\b\u009b\u0002\u0010\u009c\u0002R,\u0010£\u0002\u001a\u00030\u009e\u00022\b\u0010\u0086\u0001\u001a\u00030\u009e\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009f\u0002\u0010 \u0002\"\u0006\b¡\u0002\u0010¢\u0002R0\u0010©\u0002\u001a\u0005\u0018\u00010¤\u00022\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010¤\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¥\u0002\u0010¦\u0002\"\u0006\b§\u0002\u0010¨\u0002R>\u0010°\u0002\u001a\f\u0018\u00010ª\u0002j\u0005\u0018\u0001`«\u00022\u0011\u0010\u0086\u0001\u001a\f\u0018\u00010ª\u0002j\u0005\u0018\u0001`«\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¬\u0002\u0010\u00ad\u0002\"\u0006\b®\u0002\u0010¯\u0002R*\u0010³\u0002\u001a\u00020/2\u0007\u0010\u0086\u0001\u001a\u00020/8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b±\u0002\u0010\u009e\u0001\"\u0006\b²\u0002\u0010 \u0001R8\u0010¶\u0002\u001a\t\u0012\u0004\u0012\u00020K0Ô\u00012\u000e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020K0Ô\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b´\u0002\u0010Ö\u0001\"\u0006\bµ\u0002\u0010Ø\u0001R.\u0010¹\u0002\u001a\u0004\u0018\u00010K2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010K8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010©\u0001\"\u0006\b·\u0002\u0010¸\u0002R\u0018\u0010½\u0002\u001a\u00030º\u00028DX\u0084\u0004¢\u0006\b\u001a\u0006\b»\u0002\u0010¼\u0002¨\u0006Æ\u0002"}, m28432d2 = {"Lio/github/sceneview/SceneView;", "Landroid/view/SurfaceView;", "", "LVX0;", "Landroid/view/Choreographer$FrameCallback;", "LQ83;", "LiC1$b;", "", "f0", "n0", "LP83;", "e", "p", "z", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "x", "e1", "e2", "", "velocityX", "velocityY", "H", "LkW2;", "detector", "D", "n", "o", "LRb5;", "j", "B", "w", "Lbj5;", "u", "l", "k", "distanceX", "distanceY", "b", "G", C17296a.f69688o, "LLifecycleOwner;", "owner", "onCreate", "onAttachedToWindow", "onDetachedFromWindow", "onResume", "onPause", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "", "frameTimeNanos", "doFrame", "LPy1;", "frameTime", "M", "entity", "J", "l0", "Lio/github/sceneview/light/Light;", "light", "K", "m0", "Landroid/graphics/drawable/Drawable;", "background", "setBackgroundDrawable", "Landroid/view/MotionEvent;", "motionEvent", "onTouchEvent", "q", "Lio/github/sceneview/node/Node;", "node", "Lio/github/sceneview/renderable/Renderable;", "renderable", "h0", "(Landroid/view/MotionEvent;Lio/github/sceneview/node/Node;Ljava/lang/Integer;)V", "y", "Lkotlin/Function2;", "Lio/github/sceneview/node/ModelNode;", "Lkotlin/ParameterName;", "name", "onPickingCompleted", "i0", "Lkotlin/Function1;", "j0", "L", "Lqm5;", "c", "Lkotlin/Lazy;", "getLifecycle", "()Lqm5;", "lifecycle", "Lio/github/sceneview/SceneView$b;", DateTokenConverter.CONVERTER_KEY, "Lio/github/sceneview/SceneView$b;", "S", "()Lio/github/sceneview/SceneView$b;", "setFrameRate", "(Lio/github/sceneview/SceneView$b;)V", "frameRate", "Lcom/google/android/filament/Scene;", "Lcom/google/android/filament/Scene;", "Y", "()Lcom/google/android/filament/Scene;", "setScene", "(Lcom/google/android/filament/Scene;)V", "scene", "Lcom/google/android/filament/View;", "f", "Lcom/google/android/filament/View;", "d0", "()Lcom/google/android/filament/View;", "setView", "(Lcom/google/android/filament/View;)V", "view", "Lcom/google/android/filament/Renderer;", "g", "Lcom/google/android/filament/Renderer;", "X", "()Lcom/google/android/filament/Renderer;", "setRenderer", "(Lcom/google/android/filament/Renderer;)V", "renderer", "Lcom/google/ar/sceneform/CameraNode;", "h", "Lcom/google/ar/sceneform/CameraNode;", "getCameraNode", "()Lcom/google/ar/sceneform/CameraNode;", "cameraNode", "value", "i", "Ljava/lang/Integer;", "V", "()Ljava/lang/Integer;", "setMainLight", "(Ljava/lang/Integer;)V", "mainLight", "Lwf1;", "Lwf1;", "R", "()Lwf1;", "setEnvironment", "(Lwf1;)V", "environment", "Lcom/google/android/filament/IndirectLight;", "Lcom/google/android/filament/IndirectLight;", "U", "()Lcom/google/android/filament/IndirectLight;", "setIndirectLight", "(Lcom/google/android/filament/IndirectLight;)V", "indirectLight", "Z", "isTranslucent", "()Z", "setTranslucent", "(Z)V", "Lom0;", "m", "Lom0;", "Q", "()Lom0;", "collisionSystem", "Lio/github/sceneview/node/Node;", "P", "()Lio/github/sceneview/node/Node;", "cameraManipulatorTarget", "Lio/github/sceneview/SceneView$c;", "Lio/github/sceneview/SceneView$c;", "getSelectionMode", "()Lio/github/sceneview/SceneView$c;", "setSelectionMode", "(Lio/github/sceneview/SceneView$c;)V", "selectionMode", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "b0", "()Lkotlin/jvm/functions/Function0;", "selectionVisualizer", "Lkotlin/jvm/functions/Function1;", "getOnFrame", "()Lkotlin/jvm/functions/Function1;", "setOnFrame", "(Lkotlin/jvm/functions/Function1;)V", "onFrame", "Lkotlin/Function3;", "r", "Lkotlin/jvm/functions/Function3;", "getOnTap", "()Lkotlin/jvm/functions/Function3;", "setOnTap", "(Lkotlin/jvm/functions/Function3;)V", "onTap", "Lcom/google/android/filament/android/UiHelper;", "s", "Lcom/google/android/filament/android/UiHelper;", "uiHelper", "Lcom/google/android/filament/android/DisplayHelper;", "t", "Lcom/google/android/filament/android/DisplayHelper;", "displayHelper", "Lcom/google/android/filament/SwapChain;", "Lcom/google/android/filament/SwapChain;", "swapChain", "Landroidx/lifecycle/i;", "v", "Landroidx/lifecycle/i;", "parentLifecycleObserver", "", "Ljava/util/List;", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "children", "LFp6;", "e0", "()LFp6;", "viewAttachmentManager", "Landroid/os/Handler;", "W", "()Landroid/os/Handler;", "pickingHandler", "LPy1;", "currentFrameTime", "A", "Landroid/view/MotionEvent;", "lastTouchEvent", "LiC1;", "T", "()LiC1;", "gestureDetector", "LHb0;", "getCameraGestureDetector", "()LHb0;", "cameraGestureDetector", "Lcom/google/android/filament/utils/Manipulator;", "getCameraManipulator", "()Lcom/google/android/filament/utils/Manipulator;", "cameraManipulator", "E", "lastTick", "Lio/github/sceneview/utils/SurfaceMirrorer;", "F", "getSurfaceMirrorer", "()Lio/github/sceneview/utils/SurfaceMirrorer;", "surfaceMirrorer", "Lcom/google/android/filament/View$RenderQuality;", "getRenderQuality", "()Lcom/google/android/filament/View$RenderQuality;", "setRenderQuality", "(Lcom/google/android/filament/View$RenderQuality;)V", "renderQuality", "Lcom/google/android/filament/View$DynamicResolutionOptions;", "getDynamicResolution", "()Lcom/google/android/filament/View$DynamicResolutionOptions;", "setDynamicResolution", "(Lcom/google/android/filament/View$DynamicResolutionOptions;)V", "dynamicResolution", "Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;", "getMultiSampleAntiAliasingOptions", "()Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;", "setMultiSampleAntiAliasingOptions", "(Lcom/google/android/filament/View$MultiSampleAntiAliasingOptions;)V", "multiSampleAntiAliasingOptions", "Lcom/google/android/filament/View$AntiAliasing;", "getAntiAliasing", "()Lcom/google/android/filament/View$AntiAliasing;", "setAntiAliasing", "(Lcom/google/android/filament/View$AntiAliasing;)V", "antiAliasing", "Lcom/google/android/filament/View$AmbientOcclusionOptions;", "getAmbientOcclusionOptions", "()Lcom/google/android/filament/View$AmbientOcclusionOptions;", "setAmbientOcclusionOptions", "(Lcom/google/android/filament/View$AmbientOcclusionOptions;)V", "ambientOcclusionOptions", "Lcom/google/android/filament/View$BloomOptions;", "getBloomOptions", "()Lcom/google/android/filament/View$BloomOptions;", "setBloomOptions", "(Lcom/google/android/filament/View$BloomOptions;)V", "bloomOptions", "Lcom/google/android/filament/View$Dithering;", "getDithering", "()Lcom/google/android/filament/View$Dithering;", "setDithering", "(Lcom/google/android/filament/View$Dithering;)V", "dithering", "Lcom/google/android/filament/Skybox;", "c0", "()Lcom/google/android/filament/Skybox;", "setSkybox", "(Lcom/google/android/filament/Skybox;)V", "skybox", "Liu1;", "Lio/github/sceneview/utils/Color;", "getBackgroundColor", "()Liu1;", "setBackgroundColor", "(Liu1;)V", "backgroundColor", "g0", "setFrontFaceWindingInverted", "isFrontFaceWindingInverted", "a0", "setSelectedNodes", "selectedNodes", "setSelectedNode", "(Lio/github/sceneview/node/Node;)V", "selectedNode", "Landroidx/activity/ComponentActivity;", "N", "()Landroidx/activity/ComponentActivity;", "activity", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public class SceneView extends SurfaceView implements LifecycleOwner, VX0, Choreographer.FrameCallback, Q83, C42577iC1.InterfaceC23148b {

    /* renamed from: A */
    public MotionEvent f87881A;

    /* renamed from: B */
    public final Lazy f87882B;

    /* renamed from: C */
    public final Lazy f87883C;

    /* renamed from: D */
    public final Lazy f87884D;

    /* renamed from: E */
    public long f87885E;

    /* renamed from: F */
    public final Lazy f87886F;

    /* renamed from: b */
    public final /* synthetic */ C42577iC1.C23149c f87887b;

    /* renamed from: c */
    public final Lazy f87888c;

    /* renamed from: d */
    public AbstractC23369b f87889d;

    /* renamed from: e */
    public Scene f87890e;

    /* renamed from: f */
    public View f87891f;

    /* renamed from: g */
    public Renderer f87892g;

    /* renamed from: h */
    public final CameraNode f87893h;
    @Entity

    /* renamed from: i */
    public Integer f87894i;

    /* renamed from: j */
    public C51143wf1 f87895j;

    /* renamed from: k */
    public IndirectLight f87896k;

    /* renamed from: l */
    public boolean f87897l;

    /* renamed from: m */
    public final C46470om0 f87898m;

    /* renamed from: n */
    public final Node f87899n;

    /* renamed from: o */
    public EnumC23372c f87900o;

    /* renamed from: p */
    public final Function0<Node> f87901p;

    /* renamed from: q */
    public Function1<? super C35340Py1, Unit> f87902q;

    /* renamed from: r */
    public Function3<? super MotionEvent, ? super Node, ? super Integer, Unit> f87903r;

    /* renamed from: s */
    public final UiHelper f87904s;

    /* renamed from: t */
    public final DisplayHelper f87905t;

    /* renamed from: u */
    public SwapChain f87906u;

    /* renamed from: v */
    public final InterfaceC11728i f87907v;

    /* renamed from: w */
    public List<? extends Node> f87908w;

    /* renamed from: x */
    public final Lazy f87909x;

    /* renamed from: y */
    public final Lazy f87910y;

    /* renamed from: z */
    public C35340Py1 f87911z;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, m28432d2 = {"Lio/github/sceneview/SceneView$a;", "LHb0$b;", "", "x", "y", "", "scrollDelta", "", "onScroll", "", "strafe", "b", "c", C17296a.f69688o, "<init>", "(Lio/github/sceneview/SceneView;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$a */
    /* loaded from: classes6.dex */
    public final class C23368a implements C33260Hb0.InterfaceC3171b {
        public C23368a() {
        }

        @Override // p000.C33260Hb0.InterfaceC3171b
        /* renamed from: a */
        public void mo33446a() {
            Manipulator cameraManipulator = SceneView.this.getCameraManipulator();
            if (cameraManipulator != null) {
                cameraManipulator.grabEnd();
            }
        }

        @Override // p000.C33260Hb0.InterfaceC3171b
        /* renamed from: b */
        public void mo33445b(int i, int i2, boolean z) {
            Manipulator cameraManipulator = SceneView.this.getCameraManipulator();
            if (cameraManipulator != null) {
                cameraManipulator.grabBegin(i, i2, z);
            }
        }

        @Override // p000.C33260Hb0.InterfaceC3171b
        /* renamed from: c */
        public void mo33444c(int i, int i2) {
            Manipulator cameraManipulator = SceneView.this.getCameraManipulator();
            if (cameraManipulator != null) {
                cameraManipulator.grabUpdate(i, i2);
            }
        }

        @Override // p000.C33260Hb0.InterfaceC3171b
        public void onScroll(int i, int i2, float f) {
            Manipulator cameraManipulator = SceneView.this.getCameraManipulator();
            if (cameraManipulator != null) {
                cameraManipulator.scroll(i, i2, f);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\tB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m28432d2 = {"Lio/github/sceneview/SceneView$b;", "", "", C17296a.f69688o, "J", "()J", "factor", "<init>", "(J)V", "b", "Lio/github/sceneview/SceneView$b$a;", "Lio/github/sceneview/SceneView$b$b;", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC23369b {

        /* renamed from: a */
        public final long f87913a;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lio/github/sceneview/SceneView$b$a;", "Lio/github/sceneview/SceneView$b;", "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: io.github.sceneview.SceneView$b$a */
        /* loaded from: classes6.dex */
        public static final class C23370a extends AbstractC23369b {

            /* renamed from: b */
            public static final C23370a f87914b = new C23370a();

            private C23370a() {
                super(1L, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lio/github/sceneview/SceneView$b$b;", "Lio/github/sceneview/SceneView$b;", "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: io.github.sceneview.SceneView$b$b */
        /* loaded from: classes6.dex */
        public static final class C23371b extends AbstractC23369b {

            /* renamed from: b */
            public static final C23371b f87915b = new C23371b();

            private C23371b() {
                super(2L, null);
            }
        }

        public /* synthetic */ AbstractC23369b(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: a */
        public final long m33443a() {
            return this.f87913a;
        }

        public AbstractC23369b(long j) {
            this.f87913a = j;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"Lio/github/sceneview/SceneView$c;", "", "", "b", "Z", "()Z", "setAllowDeselection", "(Z)V", "allowDeselection", "<init>", "(Ljava/lang/String;I)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$c */
    /* loaded from: classes6.dex */
    public enum EnumC23372c {
        NONE,
        SINGLE,
        MULTIPLE;
        

        /* renamed from: b */
        public boolean f87920b = true;

        EnumC23372c() {
        }

        /* renamed from: b */
        public final boolean m33441b() {
            return this.f87920b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\r"}, m28432d2 = {"Lio/github/sceneview/SceneView$d;", "Lcom/google/android/filament/android/UiHelper$RendererCallback;", "Landroid/view/Surface;", "surface", "", "onNativeWindowChanged", "onDetachedFromSurface", "", "width", "height", "onResized", "<init>", "(Lio/github/sceneview/SceneView;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$d */
    /* loaded from: classes6.dex */
    public final class C23373d implements UiHelper.RendererCallback {
        public C23373d() {
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onDetachedFromSurface() {
            SceneView.this.f87905t.detach();
            SwapChain swapChain = SceneView.this.f87906u;
            if (swapChain != null) {
                SceneView sceneView = SceneView.this;
                try {
                    Result.Companion companion = Result.Companion;
                    C39939dl1.m43784c().destroySwapChain(swapChain);
                    Result.m116783constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.m116783constructorimpl(ResultKt.createFailure(th));
                }
                C39939dl1.m43784c().flushAndWait();
                sceneView.f87906u = null;
            }
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onNativeWindowChanged(Surface surface) {
            Object m116783constructorimpl;
            Intrinsics.checkNotNullParameter(surface, "surface");
            SwapChain swapChain = SceneView.this.f87906u;
            if (swapChain != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    C39939dl1.m43784c().destroySwapChain(swapChain);
                    m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                }
                Result.m116782boximpl(m116783constructorimpl);
            }
            SceneView.this.f87906u = C39939dl1.m43784c().createSwapChain(surface);
            SceneView.this.f87905t.attach(SceneView.this.m33463X(), SceneView.this.getDisplay());
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onResized(int i, int i2) {
            SceneView.this.m33457d0().setViewport(new Viewport(0, 0, i, i2));
            Manipulator cameraManipulator = SceneView.this.getCameraManipulator();
            if (cameraManipulator != null) {
                cameraManipulator.setViewport(i, i2);
            }
            SceneView.this.getCameraNode().mo48375U0();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: io.github.sceneview.SceneView$e */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C23374e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC23372c.values().length];
            try {
                iArr[EnumC23372c.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23372c.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LHb0;", "b", "()LHb0;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$f */
    /* loaded from: classes6.dex */
    public static final class C23375f extends Lambda implements Function0<C33260Hb0> {
        public C23375f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C33260Hb0 invoke() {
            SceneView sceneView = SceneView.this;
            return new C33260Hb0(sceneView, new C23368a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lcom/google/android/filament/utils/Manipulator;", "b", "()Lcom/google/android/filament/utils/Manipulator;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$g */
    /* loaded from: classes6.dex */
    public static final class C23376g extends Lambda implements Function0<Manipulator> {

        /* renamed from: h */
        public final /* synthetic */ CameraNode f87924h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23376g(CameraNode cameraNode) {
            super(0);
            this.f87924h = cameraNode;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Manipulator invoke() {
            C42400hu1 m33219g0;
            Manipulator.Builder builder = new Manipulator.Builder();
            CameraNode cameraNode = this.f87924h;
            SceneView sceneView = SceneView.this;
            C42400hu1 m33219g02 = cameraNode.m33219g0();
            builder.orbitHomePosition(m33219g02.m35582a(), m33219g02.m35581b(), m33219g02.m35580c());
            Node m33470P = sceneView.m33470P();
            if (m33470P != null && (m33219g0 = m33470P.m33219g0()) != null) {
                builder.targetPosition(m33219g0.m35582a(), m33219g0.m35581b(), m33219g0.m35580c());
            }
            return builder.viewport(SceneView.this.getWidth(), SceneView.this.getHeight()).zoomSpeed(0.05f).build(Manipulator.Mode.ORBIT);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LiC1;", "b", "()LiC1;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$h */
    /* loaded from: classes6.dex */
    public static final class C23377h extends Lambda implements Function0<C42577iC1> {

        /* renamed from: g */
        public final /* synthetic */ Context f87925g;

        /* renamed from: h */
        public final /* synthetic */ SceneView f87926h;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: io.github.sceneview.SceneView$h$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C23378a extends FunctionReferenceImpl implements Function2<MotionEvent, Function1<? super P83, ? extends Unit>, Unit> {
            public C23378a(Object obj) {
                super(2, obj, SceneView.class, "pickNode", "pickNode(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function1;)V", 0);
            }

            /* renamed from: a */
            public final void m33437a(MotionEvent p0, Function1<? super P83, Unit> p1) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                ((SceneView) this.receiver).m33452j0(p0, p1);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent, Function1<? super P83, ? extends Unit> function1) {
                m33437a(motionEvent, function1);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23377h(Context context, SceneView sceneView) {
            super(0);
            this.f87925g = context;
            this.f87926h = sceneView;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C42577iC1 invoke() {
            return new C42577iC1(this.f87925g, new C23378a(this.f87926h), this.f87926h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lqm5;", "b", "()Lqm5;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$i */
    /* loaded from: classes6.dex */
    public static final class C23379i extends Lambda implements Function0<C47661qm5> {
        public C23379i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C47661qm5 invoke() {
            return new C47661qm5(SceneView.this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/github/sceneview/node/ModelNode;", "node", "", "Lio/github/sceneview/renderable/Renderable;", "renderable", "", C17296a.f69688o, "(Lio/github/sceneview/node/ModelNode;I)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$j */
    /* loaded from: classes6.dex */
    public static final class C23380j extends Lambda implements Function2<ModelNode, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<P83, Unit> f87928g;

        /* renamed from: h */
        public final /* synthetic */ MotionEvent f87929h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23380j(Function1<? super P83, Unit> function1, MotionEvent motionEvent) {
            super(2);
            this.f87928g = function1;
            this.f87929h = motionEvent;
        }

        /* renamed from: a */
        public final void m33435a(ModelNode modelNode, int i) {
            this.f87928g.invoke(new P83(this.f87929h, modelNode, Integer.valueOf(i)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ModelNode modelNode, Integer num) {
            m33435a(modelNode, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: io.github.sceneview.SceneView$k */
    /* loaded from: classes6.dex */
    public static final class C23381k extends Lambda implements Function0<Handler> {

        /* renamed from: g */
        public static final C23381k f87930g = new C23381k();

        public C23381k() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/github/sceneview/node/ModelNode;", "b", "()Lio/github/sceneview/node/ModelNode;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$l */
    /* loaded from: classes6.dex */
    public static final class C23382l extends Lambda implements Function0<ModelNode> {

        /* renamed from: g */
        public static final C23382l f87931g = new C23382l();

        public C23382l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ModelNode invoke() {
            ModelNode modelNode = new ModelNode("sceneview/models/node_selector.glb", false, null, null, null, null, 62, null);
            modelNode.mo33258E0(false);
            modelNode.m33193w0(null);
            return modelNode;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/github/sceneview/utils/SurfaceMirrorer;", "b", "()Lio/github/sceneview/utils/SurfaceMirrorer;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$m */
    /* loaded from: classes6.dex */
    public static final class C23383m extends Lambda implements Function0<SurfaceMirrorer> {
        public C23383m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final SurfaceMirrorer invoke() {
            return new SurfaceMirrorer(SceneView.this.getLifecycle());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LFp6;", "b", "()LFp6;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.SceneView$n */
    /* loaded from: classes6.dex */
    public static final class C23384n extends Lambda implements Function0<C32924Fp6> {

        /* renamed from: g */
        public final /* synthetic */ Context f87933g;

        /* renamed from: h */
        public final /* synthetic */ SceneView f87934h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23384n(Context context, SceneView sceneView) {
            super(0);
            this.f87933g = context;
            this.f87934h = sceneView;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C32924Fp6 invoke() {
            return new C32924Fp6(this.f87933g, this.f87934h);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SceneView(Context context) {
        this(context, null, 0, 0, null, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: f0 */
    private final void m33455f0() {
        C39939dl1.f77162a.m43775l();
        Renderer createRenderer = C39939dl1.m43784c().createRenderer();
        Intrinsics.checkNotNullExpressionValue(createRenderer, "engine.createRenderer()");
        setRenderer(createRenderer);
        Scene createScene = C39939dl1.m43784c().createScene();
        Intrinsics.checkNotNullExpressionValue(createScene, "engine.createScene()");
        setScene(createScene);
        View createView = C39939dl1.m43784c().createView();
        Intrinsics.checkNotNullExpressionValue(createView, "engine.createView()");
        setView(createView);
        m33457d0().setScene(m33462Y());
        m33457d0().setCamera(getCameraNode().f73857Q);
        View m33457d0 = m33457d0();
        ColorGrading.Builder builder = new ColorGrading.Builder().toneMapping(ColorGrading.ToneMapping.FILMIC);
        Intrinsics.checkNotNullExpressionValue(builder, "Builder()\n            .t…ading.ToneMapping.FILMIC)");
        m33457d0.setColorGrading(C32240Cr6.m111401a(builder));
        float[] cct = Colors.cct(6500.0f);
        Intrinsics.checkNotNullExpressionValue(cct, "cct(6_500.0f)");
        LightManager.Builder castShadows = new LightManager.Builder(LightManager.Type.DIRECTIONAL).color(cct[0], cct[1], cct[2]).intensity(100000.0f).direction(0.0f, -1.0f, 0.0f).castShadows(true);
        Intrinsics.checkNotNullExpressionValue(castShadows, "Builder(LightManager.Typ…       .castShadows(true)");
        setMainLight(Integer.valueOf(C34801Nq2.m93307a(castShadows)));
        KTX1Loader kTX1Loader = KTX1Loader.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setEnvironment(C34504Mj2.m94990g(kTX1Loader, context, getLifecycle(), "sceneview/environments/indoor_studio/indoor_studio_ibl.ktx", null, 8, null));
        getCameraNode().m33190y0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k0 */
    public static final void m33451k0(SceneView this$0, Function2 onPickingCompleted, View.PickingQueryResult pickResult) {
        ModelNode modelNode;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onPickingCompleted, "$onPickingCompleted");
        Intrinsics.checkNotNullParameter(pickResult, "pickResult");
        int i = pickResult.renderable;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this$0.m33471O().iterator();
        while (true) {
            modelNode = null;
            if (!it.hasNext()) {
                break;
            }
            Node node = (Node) it.next();
            if (node instanceof ModelNode) {
                modelNode = (ModelNode) node;
            }
            if (modelNode != null) {
                arrayList.add(modelNode);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((ModelNode) next).mo33181P0().contains(Integer.valueOf(i))) {
                modelNode = next;
                break;
            }
        }
        onPickingCompleted.invoke(modelNode, Integer.valueOf(i));
    }

    @Override // p000.Q83
    /* renamed from: A */
    public void mo33267A(Node node) {
        Q83.C6686a.m88876f(this, node);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: B */
    public void mo33265B(C35605Rb5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33265B(detector, e);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: C */
    public void mo33263C(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33263C(e);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: D */
    public void mo33261D(C43944kW2 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33261D(detector, e);
    }

    @Override // p000.Q83
    /* renamed from: E */
    public Node mo33259E(Node node) {
        return Q83.C6686a.m88875g(this, node);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: G */
    public void mo33256G(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33256G(e);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: H */
    public void mo33254H(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33254H(e);
    }

    /* renamed from: J */
    public final void m33474J(@Entity int i) {
        m33462Y().addEntity(i);
    }

    /* renamed from: K */
    public final void m33473K(@Entity int i) {
        m33462Y().addEntity(i);
    }

    /* renamed from: L */
    public void mo33402L() {
        Unit unit;
        Unit unit2;
        try {
            Result.Companion companion = Result.Companion;
            this.f87904s.detach();
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        try {
            getCameraNode().mo33178N();
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th2));
        }
        Unit unit3 = null;
        try {
            Integer num = this.f87894i;
            if (num != null) {
                C34801Nq2.m93305c(num.intValue());
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            Result.m116783constructorimpl(unit2);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th3));
        }
        try {
            IndirectLight indirectLight = this.f87896k;
            if (indirectLight != null) {
                D12.m111039b(indirectLight);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m116783constructorimpl(unit);
        } catch (Throwable th4) {
            Result.Companion companion5 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th4));
        }
        try {
            Skybox m33458c0 = m33458c0();
            if (m33458c0 != null) {
                WD5.m78693b(m33458c0);
                unit3 = Unit.INSTANCE;
            }
            Result.m116783constructorimpl(unit3);
        } catch (Throwable th5) {
            Result.Companion companion6 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th5));
        }
        try {
            C45635nM4.m23939d().m23940c();
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th6) {
            Result.Companion companion7 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th6));
        }
        try {
            C39939dl1.m43784c().destroyRenderer(m33463X());
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th7) {
            Result.Companion companion8 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th7));
        }
        try {
            C39939dl1.m43784c().destroyView(m33457d0());
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th8) {
            Result.Companion companion9 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th8));
        }
        try {
            C39939dl1.m43784c().destroyScene(m33462Y());
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th9) {
            Result.Companion companion10 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th9));
        }
        C39939dl1.f77162a.m43776k();
    }

    /* renamed from: M */
    public void mo33401M(C35340Py1 frameTime) {
        Manipulator cameraManipulator;
        Intrinsics.checkNotNullParameter(frameTime, "frameTime");
        if (this.f87904s.isReadyToRender()) {
            C39939dl1.m43777j().openLocalTransformTransaction();
            if (this.f87881A != null && (cameraManipulator = getCameraManipulator()) != null) {
                cameraManipulator.update((float) frameTime.m89221d());
                getCameraNode().m33253H0(C33494Ib0.m101898a(cameraManipulator));
            }
            ArrayList<InterfaceC48254rm5> arrayList = new ArrayList();
            for (InterfaceC32929Fq2 interfaceC32929Fq2 : getLifecycle().m83453q()) {
                if (!(interfaceC32929Fq2 instanceof InterfaceC48254rm5)) {
                    interfaceC32929Fq2 = null;
                }
                InterfaceC48254rm5 interfaceC48254rm5 = (InterfaceC48254rm5) interfaceC32929Fq2;
                if (interfaceC48254rm5 != null) {
                    arrayList.add(interfaceC48254rm5);
                }
            }
            for (InterfaceC48254rm5 interfaceC48254rm52 : arrayList) {
                interfaceC48254rm52.mo15404g(frameTime);
            }
            Function1<? super C35340Py1, Unit> function1 = this.f87902q;
            if (function1 != null) {
                function1.invoke(frameTime);
            }
            C39939dl1.m43777j().commitLocalTransformTransaction();
            Renderer m33463X = m33463X();
            SwapChain swapChain = this.f87906u;
            Intrinsics.checkNotNull(swapChain);
            if (m33463X.beginFrame(swapChain, frameTime.m89219f())) {
                m33463X().render(m33457d0());
                m33463X().endFrame();
            }
        }
    }

    /* renamed from: N */
    public final ComponentActivity m33472N() {
        try {
            FragmentActivity requireActivity = C31772Ar6.m115022a(this).requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "{\n            findFragme…quireActivity()\n        }");
            return requireActivity;
        } catch (Exception unused) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            ComponentActivity m113432a = C32006Br6.m113432a(context);
            Intrinsics.checkNotNull(m113432a);
            return m113432a;
        }
    }

    /* renamed from: O */
    public List<Node> m33471O() {
        return Q83.C6686a.m88880b(this);
    }

    /* renamed from: P */
    public final Node m33470P() {
        Node node;
        Node node2 = this.f87899n;
        if (node2 == null) {
            Node m33461Z = m33461Z();
            if (m33461Z == null) {
                List<Node> m33471O = m33471O();
                ListIterator<Node> listIterator = m33471O.listIterator(m33471O.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        node = listIterator.previous();
                        if (node instanceof ModelNode) {
                            break;
                        }
                    } else {
                        node = null;
                        break;
                    }
                }
                return node;
            }
            return m33461Z;
        }
        return node2;
    }

    /* renamed from: Q */
    public final C46470om0 m33469Q() {
        return this.f87898m;
    }

    /* renamed from: R */
    public final C51143wf1 m33468R() {
        return this.f87895j;
    }

    /* renamed from: S */
    public AbstractC23369b mo33400S() {
        return this.f87889d;
    }

    /* renamed from: T */
    public final C42577iC1 m33467T() {
        return (C42577iC1) this.f87882B.getValue();
    }

    /* renamed from: U */
    public final IndirectLight m33466U() {
        return this.f87896k;
    }

    /* renamed from: V */
    public final Integer m33465V() {
        return this.f87894i;
    }

    /* renamed from: W */
    public final Handler m33464W() {
        return (Handler) this.f87910y.getValue();
    }

    /* renamed from: X */
    public final Renderer m33463X() {
        Renderer renderer = this.f87892g;
        if (renderer != null) {
            return renderer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("renderer");
        return null;
    }

    /* renamed from: Y */
    public final Scene m33462Y() {
        Scene scene = this.f87890e;
        if (scene != null) {
            return scene;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scene");
        return null;
    }

    /* renamed from: Z */
    public final Node m33461Z() {
        Object firstOrNull;
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m33460a0());
        return (Node) firstOrNull;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: a */
    public void mo33230a(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33230a(e);
    }

    /* renamed from: a0 */
    public final List<Node> m33460a0() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : m33471O()) {
            if (((Node) obj).m33208n0()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: b */
    public void mo33228b(P83 e1, P83 e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e1, "e1");
        Intrinsics.checkNotNullParameter(e2, "e2");
        this.f87887b.mo33228b(e1, e2, f, f2);
    }

    /* renamed from: b0 */
    public Function0<Node> m33459b0() {
        return this.f87901p;
    }

    /* renamed from: c0 */
    public final Skybox m33458c0() {
        return m33462Y().getSkybox();
    }

    @Override // p000.Q83
    /* renamed from: d */
    public List<Node> mo33225d() {
        return this.f87908w;
    }

    /* renamed from: d0 */
    public final View m33457d0() {
        View view = this.f87891f;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("view");
        return null;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        if (this.f87885E / mo33400S().m33443a() != (System.nanoTime() / (TimeUnit.SECONDS.toNanos(1L) / 60)) / mo33400S().m33443a()) {
            C35340Py1 c35340Py1 = new C35340Py1(j, Long.valueOf(this.f87911z.m89219f()));
            this.f87911z = c35340Py1;
            mo33401M(c35340Py1);
        }
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: e */
    public void mo33223e(P83 e1, P83 e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e1, "e1");
        Intrinsics.checkNotNullParameter(e2, "e2");
        this.f87887b.mo33223e(e1, e2, f, f2);
    }

    /* renamed from: e0 */
    public final C32924Fp6 m33456e0() {
        return (C32924Fp6) this.f87909x.getValue();
    }

    @Override // p000.Q83
    /* renamed from: f */
    public Node mo33221f(Node node) {
        return Q83.C6686a.m88881a(this, node);
    }

    /* renamed from: g0 */
    public final boolean m33454g0() {
        return m33457d0().isFrontFaceWindingInverted();
    }

    public C33260Hb0 getCameraGestureDetector() {
        return (C33260Hb0) this.f87883C.getValue();
    }

    public Manipulator getCameraManipulator() {
        return (Manipulator) this.f87884D.getValue();
    }

    public CameraNode getCameraNode() {
        return this.f87893h;
    }

    /* renamed from: h0 */
    public void mo33399h0(MotionEvent motionEvent, Node node, Integer num) {
        List<? extends Node> minus;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (node != null) {
            int i = C23374e.$EnumSwitchMapping$0[this.f87900o.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (this.f87900o.m33441b()) {
                        setSelectedNode(null);
                    }
                } else {
                    if (!node.mo33210m0() || node.m33208n0()) {
                        minus = CollectionsKt___CollectionsKt.minus(m33460a0(), node);
                    } else {
                        minus = CollectionsKt___CollectionsKt.plus((Collection<? extends Node>) ((Collection<? extends Object>) m33460a0()), node);
                    }
                    setSelectedNodes(minus);
                }
            } else if (node.mo33210m0() && !node.m33208n0()) {
                setSelectedNode(node);
            } else if (this.f87900o.m33441b()) {
                setSelectedNode(null);
            }
        } else if (this.f87900o.m33441b()) {
            setSelectedNode(null);
        }
        Function3<? super MotionEvent, ? super Node, ? super Integer, Unit> function3 = this.f87903r;
        if (function3 != null) {
            function3.invoke(motionEvent, node, num);
        }
    }

    /* renamed from: i0 */
    public final void m33453i0(int i, int i2, final Function2<? super ModelNode, ? super Integer, Unit> onPickingCompleted) {
        Intrinsics.checkNotNullParameter(onPickingCompleted, "onPickingCompleted");
        try {
            m33457d0().pick(i, (getHeight() - 1) - i2, m33464W(), new View.OnPickCallback() { // from class: sm5
                @Override // com.google.android.filament.View.OnPickCallback
                public final void onPick(View.PickingQueryResult pickingQueryResult) {
                    SceneView.m33451k0(SceneView.this, onPickingCompleted, pickingQueryResult);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: j */
    public void mo33216j(C35605Rb5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33216j(detector, e);
    }

    /* renamed from: j0 */
    public final void m33452j0(MotionEvent e, Function1<? super P83, Unit> onPickingCompleted) {
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(onPickingCompleted, "onPickingCompleted");
        m33453i0((int) e.getX(), (int) e.getY(), new C23380j(onPickingCompleted, e));
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: k */
    public void mo33214k(C38719bj5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33214k(detector, e);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: l */
    public void mo33212l(C38719bj5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33212l(detector, e);
    }

    /* renamed from: l0 */
    public final void m33450l0(@Entity int i) {
        m33462Y().removeEntity(i);
    }

    /* renamed from: m0 */
    public final void m33449m0(@Entity int i) {
        m33462Y().removeEntity(i);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: n */
    public void mo33209n(C43944kW2 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33209n(detector, e);
    }

    /* renamed from: n0 */
    public final void m33448n0() {
        int i;
        ColorDrawable colorDrawable = null;
        if (((getBackground() instanceof ColorDrawable) && getBackground().getAlpha() == 255) || m33458c0() != null) {
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                colorDrawable = (ColorDrawable) background;
            }
            if (colorDrawable != null) {
                i = colorDrawable.getColor();
            } else {
                i = -16777216;
            }
            setBackgroundColor(C50027um0.m9791c(i));
            setTranslucent(false);
            return;
        }
        setBackgroundColor(C50027um0.m9789e(0.0f, 0.0f, 1, null));
        setTranslucent(true);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: o */
    public void mo33207o(C43944kW2 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33207o(detector, e);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        AbstractC11719f lifecycle;
        super.onAttachedToWindow();
        getLifecycle().mo67008a(this);
        LifecycleOwner m87653a = C35534Qt6.m87653a(this);
        if (m87653a != null && (lifecycle = m87653a.getLifecycle()) != null) {
            lifecycle.mo67008a(this.f87907v);
            if (getLifecycle().mo67007b() != lifecycle.mo67007b()) {
                getLifecycle().m66995o(lifecycle.mo67007b());
            }
        }
    }

    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        m33455f0();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        AbstractC11719f lifecycle;
        LifecycleOwner m87653a = C35534Qt6.m87653a(this);
        if (m87653a != null && (lifecycle = m87653a.getLifecycle()) != null) {
            lifecycle.mo67006d(this.f87907v);
        }
        AbstractC11719f.EnumC11724b mo67007b = getLifecycle().mo67007b();
        AbstractC11719f.EnumC11724b enumC11724b = AbstractC11719f.EnumC11724b.DESTROYED;
        if (mo67007b != enumC11724b) {
            getLifecycle().m66995o(enumC11724b);
        }
        mo33402L();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ArrayList<InterfaceC48254rm5> arrayList = new ArrayList();
        for (InterfaceC32929Fq2 interfaceC32929Fq2 : getLifecycle().m83453q()) {
            if (!(interfaceC32929Fq2 instanceof InterfaceC48254rm5)) {
                interfaceC32929Fq2 = null;
            }
            InterfaceC48254rm5 interfaceC48254rm5 = (InterfaceC48254rm5) interfaceC32929Fq2;
            if (interfaceC48254rm5 != null) {
                arrayList.add(interfaceC48254rm5);
            }
        }
        for (InterfaceC48254rm5 interfaceC48254rm52 : arrayList) {
            interfaceC48254rm52.mo15405I(getWidth(), getHeight());
        }
    }

    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        Choreographer.getInstance().removeFrameCallback(this);
        m33456e0().m106432f();
    }

    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        m33456e0().m106431g();
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (!super.onTouchEvent(motionEvent)) {
            this.f87881A = motionEvent;
            m33467T().onTouchEvent(motionEvent);
            C33260Hb0 cameraGestureDetector = getCameraGestureDetector();
            if (cameraGestureDetector != null) {
                cameraGestureDetector.m103689e(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: p */
    public void mo33205p(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33205p(e);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: q */
    public void mo33203q(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        mo33399h0(e.m90711a(), e.m90710b(), e.m90709c());
    }

    @Override // p000.Q83
    /* renamed from: s */
    public Function1<Node, Unit> mo33202s() {
        return Q83.C6686a.m88878d(this);
    }

    public final void setAmbientOcclusionOptions(View.AmbientOcclusionOptions value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m33457d0().setAmbientOcclusionOptions(value);
    }

    public final void setAntiAliasing(View.AntiAliasing value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m33457d0().setAntiAliasing(value);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setBackgroundColor(C42993iu1 c42993iu1) {
        boolean z;
        boolean z2;
        Renderer m33463X = m33463X();
        Renderer.ClearOptions clearOptions = new Renderer.ClearOptions();
        boolean z3 = true;
        clearOptions.clear = true;
        if (c42993iu1 != null) {
            if (c42993iu1.m31661d() == 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z = false;
                setTranslucent(z);
                if (c42993iu1 != null) {
                    if (c42993iu1.m31661d() != 0.0f) {
                        z3 = false;
                    }
                    if (!z3) {
                        clearOptions.clearColor = c42993iu1.m31657h();
                    }
                }
                m33463X.setClearOptions(clearOptions);
            }
        }
        z = true;
        setTranslucent(z);
        if (c42993iu1 != null) {
        }
        m33463X.setClearOptions(clearOptions);
    }

    @Override // android.view.View
    @Deprecated(message = "Deprecated in Java")
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (getHolder() != null) {
            m33448n0();
        }
    }

    public final void setBloomOptions(View.BloomOptions value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m33457d0().setBloomOptions(value);
    }

    @Override // p000.Q83
    public void setChildren(List<? extends Node> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f87908w = list;
    }

    public final void setDithering(View.Dithering value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m33457d0().setDithering(value);
    }

    public final void setDynamicResolution(View.DynamicResolutionOptions value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m33457d0().setDynamicResolutionOptions(value);
    }

    public final void setEnvironment(C51143wf1 c51143wf1) {
        IndirectLight indirectLight;
        this.f87895j = c51143wf1;
        Skybox skybox = null;
        if (c51143wf1 != null) {
            indirectLight = c51143wf1.m6540b();
        } else {
            indirectLight = null;
        }
        setIndirectLight(indirectLight);
        if (c51143wf1 != null) {
            skybox = c51143wf1.m6539c();
        }
        setSkybox(skybox);
    }

    public void setFrameRate(AbstractC23369b abstractC23369b) {
        Intrinsics.checkNotNullParameter(abstractC23369b, "<set-?>");
        this.f87889d = abstractC23369b;
    }

    public final void setFrontFaceWindingInverted(boolean z) {
        m33457d0().setFrontFaceWindingInverted(z);
    }

    public final void setIndirectLight(IndirectLight indirectLight) {
        this.f87896k = indirectLight;
        m33462Y().setIndirectLight(indirectLight);
    }

    public final void setMainLight(Integer num) {
        Integer num2 = this.f87894i;
        if (num2 != null) {
            m33449m0(num2.intValue());
        }
        this.f87894i = num;
        if (num != null) {
            num.intValue();
            m33473K(num.intValue());
        }
    }

    public final void setMultiSampleAntiAliasingOptions(View.MultiSampleAntiAliasingOptions value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m33457d0().setMultiSampleAntiAliasingOptions(value);
    }

    public final void setOnFrame(Function1<? super C35340Py1, Unit> function1) {
        this.f87902q = function1;
    }

    public final void setOnTap(Function3<? super MotionEvent, ? super Node, ? super Integer, Unit> function3) {
        this.f87903r = function3;
    }

    public final void setRenderQuality(View.RenderQuality value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m33457d0().setRenderQuality(value);
    }

    public final void setRenderer(Renderer renderer) {
        Intrinsics.checkNotNullParameter(renderer, "<set-?>");
        this.f87892g = renderer;
    }

    public final void setScene(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<set-?>");
        this.f87890e = scene;
    }

    public final void setSelectedNode(Node node) {
        List<? extends Node> listOfNotNull;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(node);
        setSelectedNodes(listOfNotNull);
    }

    public final void setSelectedNodes(List<? extends Node> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        for (Node node : m33471O()) {
            node.m33257F0(value.contains(node));
        }
    }

    public final void setSelectionMode(EnumC23372c enumC23372c) {
        Intrinsics.checkNotNullParameter(enumC23372c, "<set-?>");
        this.f87900o = enumC23372c;
    }

    public final void setSkybox(Skybox skybox) {
        m33462Y().setSkybox(skybox);
    }

    public final void setTranslucent(boolean z) {
        int i;
        View.BlendMode blendMode;
        if (this.f87897l != z) {
            this.f87897l = z;
            setZOrderOnTop(z);
            SurfaceHolder holder = getHolder();
            if (z) {
                i = -3;
            } else {
                i = -1;
            }
            holder.setFormat(i);
            View m33457d0 = m33457d0();
            if (z) {
                blendMode = View.BlendMode.TRANSLUCENT;
            } else {
                blendMode = View.BlendMode.OPAQUE;
            }
            m33457d0.setBlendMode(blendMode);
        }
    }

    public final void setView(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f87891f = view;
    }

    @Override // p000.Q83
    /* renamed from: t */
    public void mo33200t(Node node) {
        Q83.C6686a.m88877e(this, node);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: u */
    public void mo33198u(C38719bj5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33198u(detector, e);
    }

    @Override // p000.Q83
    /* renamed from: v */
    public Function1<Node, Unit> mo33196v() {
        return Q83.C6686a.m88879c(this);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: w */
    public void mo33194w(C35605Rb5 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33194w(detector, e);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: x */
    public void mo33192x(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33192x(e);
    }

    @Override // p000.C42577iC1.InterfaceC23148b
    /* renamed from: z */
    public void mo33189z(P83 e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f87887b.mo33189z(e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SceneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p000.LifecycleOwner
    public C47661qm5 getLifecycle() {
        return (C47661qm5) this.f87888c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SceneView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SceneView(Context context, AttributeSet attributeSet, int i, int i2, CameraNode cameraNode, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? new CameraNode() : cameraNode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SceneView(Context context, AttributeSet attributeSet, int i, int i2, CameraNode cameraNode) {
        super(context, attributeSet, i, i2);
        Lazy lazy;
        List<? extends Node> emptyList;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraNode, "cameraNode");
        this.f87887b = new C42577iC1.C23149c();
        lazy = LazyKt__LazyJVMKt.lazy(new C23379i());
        this.f87888c = lazy;
        this.f87889d = AbstractC23369b.C23370a.f87914b;
        this.f87893h = cameraNode;
        this.f87898m = new C46470om0();
        this.f87900o = EnumC23372c.SINGLE;
        this.f87901p = C23382l.f87931g;
        UiHelper uiHelper = new UiHelper(UiHelper.ContextErrorPolicy.DONT_CHECK);
        uiHelper.setRenderCallback(new C23373d());
        uiHelper.attachTo(this);
        this.f87904s = uiHelper;
        this.f87905t = new DisplayHelper(context);
        this.f87907v = new InterfaceC11728i() { // from class: io.github.sceneview.SceneView$parentLifecycleObserver$1
            @Override // androidx.lifecycle.InterfaceC11728i
            public final void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                SceneView.this.getLifecycle().m66995o(event.m67019c());
            }
        };
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f87908w = emptyList;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C23384n(context, this));
        this.f87909x = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(C23381k.f87930g);
        this.f87910y = lazy3;
        this.f87911z = new C35340Py1(0L, null, 2, null);
        lazy4 = LazyKt__LazyJVMKt.lazy(new C23377h(context, this));
        this.f87882B = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C23375f());
        this.f87883C = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new C23376g(cameraNode));
        this.f87884D = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new C23383m());
        this.f87886F = lazy7;
    }
}
