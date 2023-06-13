package co.bird.android.app.feature.ride.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEventImpl;
import co.bird.android.app.feature.map.presenter.MapPresenter;
import co.bird.android.app.feature.map.presenter.MapPresenterImplFactory;
import co.bird.android.app.feature.ride.activity.RideActivity;
import co.bird.android.core.map.BaseMapActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RideState;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.destination.Destination;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.widget.BannerView;
import co.bird.android.widget.ControlButton;
import co.bird.android.widget.PillButton;
import co.bird.android.widget.PillDropdownButton;
import co.bird.android.widget.SingleBannerFlightView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.C41707gk1;
@Metadata(m28433d1 = {"\u0000à\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ã\u00022\u00020\u00012\u00020\u0002:\u0005ä\u0002 å\u0002B\t¢\u0006\u0006\bá\u0002\u0010â\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001c\u0010\b\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\u001c\u0010\n\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J*\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0003H\u0014J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016R\u001a\u0010*\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010Q\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0087.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R)\u0010 \u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\u0018\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010°\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R*\u0010¸\u0001\u001a\u00030±\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R*\u0010À\u0001\u001a\u00030¹\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R*\u0010È\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R*\u0010Ð\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R*\u0010Ô\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ë\u0001\u001a\u0006\bÒ\u0001\u0010Í\u0001\"\u0006\bÓ\u0001\u0010Ï\u0001R*\u0010Ø\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ë\u0001\u001a\u0006\bÖ\u0001\u0010Í\u0001\"\u0006\b×\u0001\u0010Ï\u0001R*\u0010Ü\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ë\u0001\u001a\u0006\bÚ\u0001\u0010Í\u0001\"\u0006\bÛ\u0001\u0010Ï\u0001R)\u0010ã\u0001\u001a\u00030Ý\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\u0019\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R*\u0010ë\u0001\u001a\u00030ä\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R*\u0010ó\u0001\u001a\u00030ì\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R*\u0010û\u0001\u001a\u00030ô\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R)\u0010\u0082\u0002\u001a\u00030ü\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\u0004\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R)\u0010\u0089\u0002\u001a\u00030\u0083\u00028\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bF\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002\"\u0006\b\u0087\u0002\u0010\u0088\u0002R*\u0010\u0091\u0002\u001a\u00030\u008a\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008b\u0002\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002\"\u0006\b\u008f\u0002\u0010\u0090\u0002R\u001e\u0010\u0095\u0002\u001a\u00020\u00148\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\b\u0092\u0002\u0010,\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R!\u0010\u009b\u0002\u001a\u00030\u0096\u00028TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001c\u0010\u009f\u0002\u001a\u0005\u0018\u00010\u009c\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u001c\u0010¢\u0002\u001a\u0005\u0018\u00010 \u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010¡\u0002R\u001c\u0010¥\u0002\u001a\u0005\u0018\u00010£\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010¤\u0002R\u0019\u0010§\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008d\u0001\u0010¦\u0002R\u001c\u0010ª\u0002\u001a\u0005\u0018\u00010¨\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010©\u0002R\u001c\u0010®\u0002\u001a\u0005\u0018\u00010«\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010\u00ad\u0002R\u001c\u0010²\u0002\u001a\u0005\u0018\u00010¯\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0002\u0010±\u0002R\u001c\u0010µ\u0002\u001a\u0005\u0018\u00010³\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010´\u0002R\u0019\u0010·\u0002\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009c\u0001\u0010¶\u0002R\u001c\u0010º\u0002\u001a\u0005\u0018\u00010¸\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010¹\u0002R\u001c\u0010¾\u0002\u001a\u0005\u0018\u00010»\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R\u0019\u0010Á\u0002\u001a\u00030¿\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b.\u0010À\u0002R\u001b\u0010Ä\u0002\u001a\u0005\u0018\u00010Â\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\be\u0010Ã\u0002R\u001c\u0010È\u0002\u001a\u0005\u0018\u00010Å\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010Ç\u0002R\u001a\u0010Ë\u0002\u001a\u00030É\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b÷\u0001\u0010Ê\u0002R\u001c\u0010Î\u0002\u001a\u0005\u0018\u00010Ì\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010Í\u0002R\u001b\u0010Ñ\u0002\u001a\u0005\u0018\u00010Ï\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b]\u0010Ð\u0002R\u0019\u0010Ô\u0002\u001a\u00030Ò\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bM\u0010Ó\u0002R\u001a\u0010Ø\u0002\u001a\u00030Õ\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÖ\u0002\u0010×\u0002R\u001a\u0010Ü\u0002\u001a\u00030Ù\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÚ\u0002\u0010Û\u0002R\u001c\u0010à\u0002\u001a\u0005\u0018\u00010Ý\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0002\u0010ß\u0002¨\u0006æ\u0002"}, m28432d2 = {"Lco/bird/android/app/feature/ride/activity/RideActivity;", "Lco/bird/android/core/map/BaseMapActivity;", "Lcom/google/android/material/navigation/NavigationView$c;", "", "E0", "Lkotlin/Function1;", "LhY4;", "action", AbstractC3831J1.f16564d, "LsJ4;", "F1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "LcD1;", "map", "onMapReady", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "q0", "A0", "onPause", "onDestroy", "onBackPressed", "Landroid/view/MenuItem;", "item", "", "b", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "onOptionsItemSelected", "LJy;", "H", "LJy;", "Q", "()LJy;", "kind", "LBK2;", "I", "LBK2;", "U0", "()LBK2;", "setMapMarkerOverridesManager", "(LBK2;)V", "mapMarkerOverridesManager", "LL65;", "J", "LL65;", "u1", "()LL65;", "setRideStartedTutorialsPresenterFactory", "(LL65;)V", "rideStartedTutorialsPresenterFactory", "LZ95;", "K", "LZ95;", "B1", "()LZ95;", "setRiderModalPresenterFactory", "(LZ95;)V", "riderModalPresenterFactory", "Ly9;", "P", "Ly9;", "F0", "()Ly9;", "setAlertPresenterFactory", "(Ly9;)V", "alertPresenterFactory", "LF03;", "LF03;", "a1", "()LF03;", "setNavigationDrawerPresenterFactory", "(LF03;)V", "navigationDrawerPresenterFactory", "LmU4;", "R", "LmU4;", "o1", "()LmU4;", "setRideMapStartDialogPresenterFactory", "(LmU4;)V", "rideMapStartDialogPresenterFactory", "LI95;", "S", "LI95;", "Z0", "()LI95;", "setMapUiFactory", "(LI95;)V", "mapUiFactory", "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;", "T", "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;", "V0", "()Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;", "setMapPresenterFactory", "(Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;)V", "mapPresenterFactory", "LL25;", "U", "LL25;", "r1", "()LL25;", "setRidePresenterImplFactory", "(LL25;)V", "ridePresenterImplFactory", "LWJ4;", "W", "LWJ4;", "k1", "()LWJ4;", "setRequirementPresenterImplFactory", "(LWJ4;)V", "requirementPresenterImplFactory", "LAL4;", "X", "LAL4;", "n1", "()LAL4;", "setReservationPresenterImplFactory", "(LAL4;)V", "reservationPresenterImplFactory", "Ldz1;", "Y", "Ldz1;", "S0", "()Ldz1;", "setFreeRideDelegateFactory", "(Ldz1;)V", "freeRideDelegateFactory", "LHP4;", "Z", "LHP4;", "M0", "()LHP4;", "setBannerPresenterFactory", "(LHP4;)V", "bannerPresenterFactory", "LhH3;", "p0", "LhH3;", "f1", "()LhH3;", "setParkingPresenterImplFactory", "(LhH3;)V", "parkingPresenterImplFactory", "Lhs1;", "Lhs1;", "R0", "()Lhs1;", "setFlightBannerCoordinatorImplFactory", "(Lhs1;)V", "flightBannerCoordinatorImplFactory", "Lh54;", "r0", "Lh54;", "i1", "()Lh54;", "setPrivateBirdPresenterImplFactory", "(Lh54;)V", "privateBirdPresenterImplFactory", "LcL4;", "s0", "LcL4;", "l1", "()LcL4;", "setReservationPaymentIntentDelegateFactory", "(LcL4;)V", "reservationPaymentIntentDelegateFactory", "LKO;", "t0", "LKO;", "N0", "()LKO;", "setBirdPayPresenterImplFactory", "(LKO;)V", "birdPayPresenterImplFactory", "Lh65;", AbstractC26684u0.f100690q, "Lh65;", "s1", "()Lh65;", "setRideStartInBadAreaPresenterImplFactory", "(Lh65;)V", "rideStartInBadAreaPresenterImplFactory", "Lva5;", "v0", "Lva5;", "C1", "()Lva5;", "setRiderProfilePresenterImplFactory", "(Lva5;)V", "riderProfilePresenterImplFactory", "Luk1;", "w0", "Luk1;", "y1", "()Luk1;", "setRiderMapAnnouncementPresenterFactory", "(Luk1;)V", "riderMapAnnouncementPresenterFactory", "x0", "t1", "setRideStartedAnnouncementPresenterFactory", "rideStartedAnnouncementPresenterFactory", "y0", "h1", "setPostRideAnnouncementPresenterFactory", "postRideAnnouncementPresenterFactory", "z0", "D1", "setSideMenuBannerAnnouncementPresenterFactory", "sideMenuBannerAnnouncementPresenterFactory", "Lbn;", "Lbn;", "L0", "()Lbn;", "setAreaManager", "(Lbn;)V", "areaManager", "Lgl;", "B0", "Lgl;", "K0", "()Lgl;", "setAppPreferences", "(Lgl;)V", "appPreferences", "LO01;", "C0", "LO01;", "Q0", "()LO01;", "setDestinationManager", "(LO01;)V", "destinationManager", "LpU4;", "D0", "LpU4;", "X0", "()LpU4;", "setMapStateManager", "(LpU4;)V", "mapStateManager", "LCx4;", "LCx4;", "j1", "()LCx4;", "setRentalManager", "(LCx4;)V", "rentalManager", "LIL2;", "LIL2;", "Y0", "()LIL2;", "setMapStyler", "(LIL2;)V", "mapStyler", "LP75;", "G0", "LP75;", "x1", "()LP75;", "setRideUi", "(LP75;)V", "rideUi", "H0", "o0", "()I", "layoutResource", "Lcom/google/android/gms/maps/MapView;", "I0", "Lkotlin/Lazy;", "n0", "()Lcom/google/android/gms/maps/MapView;", "googleMapView", "LN95;", "J0", "LN95;", "riderModalPresenter", "Lco/bird/android/app/feature/map/presenter/MapPresenter;", "Lco/bird/android/app/feature/map/presenter/MapPresenter;", "mapPresenter", "LaZ2;", "LaZ2;", "navigationDrawerPresenter", "LhY4;", "ridePresenter", "Lh11;", "Lh11;", "destinationPresenter", "LfP4;", "O0", "LfP4;", "bannerPresenter", "Lq9;", "P0", "Lq9;", "alertPresenter", "LiU4;", "LiU4;", "obstructiveUiPresenter", "LsJ4;", "requirementPresenter", "LfL4;", "LfL4;", "reservationPresenter", "LGG3;", "T0", "LGG3;", "parkingPresenter", "LZr1;", "LZr1;", "flightBannerCoordinatorPresenter", "LUK4;", "LUK4;", "reservationPaymentIntentDelegate", "LwT3;", "W0", "LwT3;", "pillButtonPresenter", "LL44;", "LL44;", "privateBirdPresenter", "LuO;", "LuO;", "birdPayPresenter", "Lka5;", "Lka5;", "riderProfilePresenter", "Lbz1;", "Lbz1;", "freeRideDelegate", "LF5;", "b1", "LF5;", "binding", "LUq6;", "c1", "LUq6;", "drawerFooterBinding", "LG95;", "d1", "LG95;", "mapUi", "<init>", "()V", "e1", C17296a.f69688o, "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideActivity.kt\nco/bird/android/app/feature/ride/activity/RideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,578:1\n1#2:579\n44#3:580\n44#3:581\n*S KotlinDebug\n*F\n+ 1 RideActivity.kt\nco/bird/android/app/feature/ride/activity/RideActivity\n*L\n184#1:580\n388#1:581\n*E\n"})
/* loaded from: classes2.dex */
public final class RideActivity extends BaseMapActivity implements NavigationView.InterfaceC17850c {

    /* renamed from: e1 */
    public static final C14210a f62350e1 = new C14210a(null);

    /* renamed from: f1 */
    public static final int f62351f1 = 8;

    /* renamed from: A0 */
    public InterfaceC12495bn f62352A0;

    /* renamed from: B0 */
    public C22454gl f62353B0;

    /* renamed from: C0 */
    public O01 f62354C0;

    /* renamed from: D0 */
    public InterfaceC46893pU4 f62355D0;

    /* renamed from: E0 */
    public InterfaceC32292Cx4 f62356E0;

    /* renamed from: F0 */
    public IL2 f62357F0;

    /* renamed from: G0 */
    public P75 f62358G0;

    /* renamed from: H */
    public final EnumC4283Jy f62359H;

    /* renamed from: H0 */
    public final int f62360H0;

    /* renamed from: I */
    public BK2 f62361I;

    /* renamed from: I0 */
    public final Lazy f62362I0;

    /* renamed from: J */
    public L65 f62363J;

    /* renamed from: J0 */
    public N95 f62364J0;

    /* renamed from: K */
    public Z95 f62365K;

    /* renamed from: K0 */
    public MapPresenter f62366K0;

    /* renamed from: L0 */
    public InterfaceC38024aZ2 f62367L0;

    /* renamed from: M0 */
    public InterfaceC42185hY4 f62368M0;

    /* renamed from: N0 */
    public InterfaceC41876h11 f62369N0;

    /* renamed from: O0 */
    public InterfaceC40918fP4 f62370O0;

    /* renamed from: P */
    public InterfaceC30430y9 f62371P;

    /* renamed from: P0 */
    public InterfaceC27513q9 f62372P0;

    /* renamed from: Q */
    public F03 f62373Q;

    /* renamed from: Q0 */
    public InterfaceC42742iU4 f62374Q0;

    /* renamed from: R */
    public InterfaceC45114mU4 f62375R;

    /* renamed from: R0 */
    public InterfaceC48572sJ4 f62376R0;

    /* renamed from: S */
    public I95 f62377S;

    /* renamed from: S0 */
    public InterfaceC40882fL4 f62378S0;

    /* renamed from: T */
    public MapPresenterImplFactory f62379T;

    /* renamed from: T0 */
    public GG3 f62380T0;

    /* renamed from: U */
    public L25 f62381U;

    /* renamed from: U0 */
    public InterfaceC37617Zr1 f62382U0;

    /* renamed from: V0 */
    public UK4 f62383V0;

    /* renamed from: W */
    public WJ4 f62384W;

    /* renamed from: W0 */
    public InterfaceC51032wT3 f62385W0;

    /* renamed from: X */
    public AL4 f62386X;

    /* renamed from: X0 */
    public L44 f62387X0;

    /* renamed from: Y */
    public InterfaceC40078dz1 f62388Y;

    /* renamed from: Y0 */
    public InterfaceC29188uO f62389Y0;

    /* renamed from: Z */
    public HP4 f62390Z;

    /* renamed from: Z0 */
    public InterfaceC43983ka5 f62391Z0;

    /* renamed from: a1 */
    public InterfaceC38875bz1 f62392a1;

    /* renamed from: b1 */
    public C2136F5 f62393b1;

    /* renamed from: c1 */
    public C36443Uq6 f62394c1;

    /* renamed from: d1 */
    public G95 f62395d1;

    /* renamed from: p0 */
    public InterfaceC42031hH3 f62396p0;

    /* renamed from: q0 */
    public InterfaceC42380hs1 f62397q0;

    /* renamed from: r0 */
    public InterfaceC41919h54 f62398r0;

    /* renamed from: s0 */
    public InterfaceC39086cL4 f62399s0;

    /* renamed from: t0 */
    public InterfaceC4417KO f62400t0;

    /* renamed from: u0 */
    public InterfaceC41930h65 f62401u0;

    /* renamed from: v0 */
    public InterfaceC50504va5 f62402v0;

    /* renamed from: w0 */
    public InterfaceC50008uk1 f62403w0;

    /* renamed from: x0 */
    public InterfaceC50008uk1 f62404x0;

    /* renamed from: y0 */
    public InterfaceC50008uk1 f62405y0;

    /* renamed from: z0 */
    public InterfaceC50008uk1 f62406z0;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/ride/activity/RideActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14210a {
        public /* synthetic */ C14210a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m59571a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, RideActivity.class);
        }

        private C14210a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/ride/activity/RideActivity$b;", "", "LY75;", "impl", "LP75;", "b", "rideUi", "Lxk1;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC14211b {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC51786xk1 m59570a(Y75 y75);

        @Binds
        /* renamed from: b */
        public abstract P75 m59569b(Y75 y75);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/ride/activity/RideActivity$c;", "", "Lco/bird/android/app/feature/ride/activity/RideActivity;", "activity", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14211b.class})
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC14212c {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Jf\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0013H&¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/app/feature/ride/activity/RideActivity$c$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "lifecycleScopeProvider", "LF5;", "binding", "LDt6;", "sideMenuBinding", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/f;", "lifecycle", "LDQ3;", "permissionManager", "Lco/bird/android/app/feature/ride/activity/RideActivity$c;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$c$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC14213a {
            /* renamed from: a */
            InterfaceC14212c mo59538a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, @BindsInstance C2136F5 c2136f5, @BindsInstance C32492Dt6 c32492Dt6, @BindsInstance FragmentManager fragmentManager, @BindsInstance AbstractC11719f abstractC11719f, @BindsInstance DQ3 dq3);
        }

        /* renamed from: a */
        void mo59537a(RideActivity rideActivity);
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/google/android/gms/maps/MapView;", "kotlin.jvm.PlatformType", "b", "()Lcom/google/android/gms/maps/MapView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$d */
    /* loaded from: classes2.dex */
    public static final class C14214d extends Lambda implements Function0<MapView> {
        public C14214d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final MapView invoke() {
            return (MapView) RideActivity.this.findViewById(C36585Vg4.mapView);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LsJ4;", "it", "", C17296a.f69688o, "(LsJ4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$e */
    /* loaded from: classes2.dex */
    public static final class C14215e extends Lambda implements Function1<InterfaceC48572sJ4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<InterfaceC48572sJ4, Unit> f62408g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14215e(Function1<? super InterfaceC48572sJ4, Unit> function1) {
            super(1);
            this.f62408g = function1;
        }

        /* renamed from: a */
        public final void m59567a(InterfaceC48572sJ4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48572sJ4 interfaceC48572sJ4) {
            m59567a(interfaceC48572sJ4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LhY4;", "it", "", C17296a.f69688o, "(LhY4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$f */
    /* loaded from: classes2.dex */
    public static final class C14216f extends Lambda implements Function1<InterfaceC42185hY4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<InterfaceC42185hY4, Unit> f62409g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14216f(Function1<? super InterfaceC42185hY4, Unit> function1) {
            super(1);
            this.f62409g = function1;
        }

        /* renamed from: a */
        public final void m59566a(InterfaceC42185hY4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42185hY4 interfaceC42185hY4) {
            m59566a(interfaceC42185hY4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LhY4;", "it", "", C17296a.f69688o, "(LhY4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$g */
    /* loaded from: classes2.dex */
    public static final class C14217g extends Lambda implements Function1<InterfaceC42185hY4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f62410g;

        /* renamed from: h */
        public final /* synthetic */ int f62411h;

        /* renamed from: i */
        public final /* synthetic */ Intent f62412i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14217g(int i, int i2, Intent intent) {
            super(1);
            this.f62410g = i;
            this.f62411h = i2;
            this.f62412i = intent;
        }

        /* renamed from: a */
        public final void m59565a(InterfaceC42185hY4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            int i = this.f62410g;
            int i2 = this.f62411h;
            Intent intent = this.f62412i;
            C41318g46.m40163a("invoking ride presenter onActivityResult now (" + i + ", " + i2 + ", " + intent + ")", new Object[0]);
            it.onActivityResult(this.f62410g, this.f62411h, this.f62412i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42185hY4 interfaceC42185hY4) {
            m59565a(interfaceC42185hY4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LsJ4;", "it", "", C17296a.f69688o, "(LsJ4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$h */
    /* loaded from: classes2.dex */
    public static final class C14218h extends Lambda implements Function1<InterfaceC48572sJ4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f62413g;

        /* renamed from: h */
        public final /* synthetic */ int f62414h;

        /* renamed from: i */
        public final /* synthetic */ Intent f62415i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14218h(int i, int i2, Intent intent) {
            super(1);
            this.f62413g = i;
            this.f62414h = i2;
            this.f62415i = intent;
        }

        /* renamed from: a */
        public final void m59564a(InterfaceC48572sJ4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            int i = this.f62413g;
            int i2 = this.f62414h;
            Intent intent = this.f62415i;
            C41318g46.m40163a("invoking requirement present onActivityResult now (" + i + ", " + i2 + ", " + intent + ")", new Object[0]);
            it.onActivityResult(this.f62413g, this.f62414h, this.f62415i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48572sJ4 interfaceC48572sJ4) {
            m59564a(interfaceC48572sJ4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LhY4;", "it", "", C17296a.f69688o, "(LhY4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$i */
    /* loaded from: classes2.dex */
    public static final class C14219i extends Lambda implements Function1<InterfaceC42185hY4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Menu f62416g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14219i(Menu menu) {
            super(1);
            this.f62416g = menu;
        }

        /* renamed from: a */
        public final void m59563a(InterfaceC42185hY4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.mo35039d(this.f62416g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42185hY4 interfaceC42185hY4) {
            m59563a(interfaceC42185hY4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LhY4;", "ridePresenter", "", C17296a.f69688o, "(LhY4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$j */
    /* loaded from: classes2.dex */
    public static final class C14220j extends Lambda implements Function1<InterfaceC42185hY4, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Intent f62417g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14220j(Intent intent) {
            super(1);
            this.f62417g = intent;
        }

        /* renamed from: a */
        public final void m59562a(InterfaceC42185hY4 ridePresenter) {
            Intrinsics.checkNotNullParameter(ridePresenter, "ridePresenter");
            ridePresenter.mo35072a(this.f62417g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42185hY4 interfaceC42185hY4) {
            m59562a(interfaceC42185hY4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LhY4;", "it", "", C17296a.f69688o, "(LhY4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RideActivity$k */
    /* loaded from: classes2.dex */
    public static final class C14221k extends Lambda implements Function1<InterfaceC42185hY4, Unit> {
        public C14221k() {
            super(1);
        }

        /* renamed from: a */
        public final void m59561a(InterfaceC42185hY4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onResume(RideActivity.this.m58995p0());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42185hY4 interfaceC42185hY4) {
            m59561a(interfaceC42185hY4);
            return Unit.INSTANCE;
        }
    }

    public RideActivity() {
        super(true);
        Lazy lazy;
        this.f62359H = EnumC4283Jy.RIDER;
        this.f62360H0 = C39311cj4.activity_ride;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C14214d());
        this.f62362I0 = lazy;
    }

    /* renamed from: I1 */
    public static final void m59601I1(RideActivity this$0, Function1 action) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(action, "$action");
        this$0.m59602F1(new C14215e(action));
    }

    /* renamed from: L1 */
    public static final void m59597L1(RideActivity this$0, Function1 action) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(action, "$action");
        this$0.m59600J1(new C14216f(action));
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: A0 */
    public void mo58947A0(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.mo58947A0(map);
        m59600J1(new C14221k());
        MapPresenter mapPresenter = this.f62366K0;
        if (mapPresenter != null) {
            mapPresenter.onResume(m58995p0());
        }
        InterfaceC40882fL4 interfaceC40882fL4 = this.f62378S0;
        if (interfaceC40882fL4 != null) {
            interfaceC40882fL4.onResume(m58995p0());
        }
        GG3 gg3 = this.f62380T0;
        if (gg3 != null) {
            gg3.onResume();
        }
        InterfaceC41876h11 interfaceC41876h11 = this.f62369N0;
        if (interfaceC41876h11 != null) {
            interfaceC41876h11.onResume();
        }
        WireRideDetail m37560w = m59599K0().m37560w();
        if (m37560w != null && !m37560w.cancelled()) {
            C41318g46.m40157g("Consuming last known ride", new Object[0]);
            InterfaceC50008uk1 m59584h1 = m59584h1();
            InterfaceC37617Zr1 interfaceC37617Zr1 = this.f62382U0;
            if (interfaceC37617Zr1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flightBannerCoordinatorPresenter");
                interfaceC37617Zr1 = null;
            }
            m59584h1.mo8210a(interfaceC37617Zr1, AnnouncementContext.POST_RIDE, new C41707gk1.C22436h(m37560w.getRating(), Integer.valueOf(m37560w.getRide().durationSeconds()), null, null, 12, null));
        }
    }

    /* renamed from: B1 */
    public final Z95 m59608B1() {
        Z95 z95 = this.f62365K;
        if (z95 != null) {
            return z95;
        }
        Intrinsics.throwUninitializedPropertyAccessException("riderModalPresenterFactory");
        return null;
    }

    /* renamed from: C1 */
    public final InterfaceC50504va5 m59606C1() {
        InterfaceC50504va5 interfaceC50504va5 = this.f62402v0;
        if (interfaceC50504va5 != null) {
            return interfaceC50504va5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("riderProfilePresenterImplFactory");
        return null;
    }

    /* renamed from: D1 */
    public final InterfaceC50008uk1 m59605D1() {
        InterfaceC50008uk1 interfaceC50008uk1 = this.f62406z0;
        if (interfaceC50008uk1 != null) {
            return interfaceC50008uk1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sideMenuBannerAnnouncementPresenterFactory");
        return null;
    }

    /* renamed from: E0 */
    public final void m59604E0() {
        C36443Uq6 c36443Uq6 = this.f62394c1;
        C2136F5 c2136f5 = null;
        if (c36443Uq6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawerFooterBinding");
            c36443Uq6 = null;
        }
        RelativeLayout relativeLayout = c36443Uq6.f38110c.f6468b;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "drawerFooterBinding.sideMenuBanner.banner");
        C2136F5 c2136f52 = this.f62393b1;
        if (c2136f52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f52 = null;
        }
        Toolbar toolbar = c2136f52.f8666I;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
        C2136F5 c2136f53 = this.f62393b1;
        if (c2136f53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f53 = null;
        }
        DrawerLayout drawerLayout = c2136f53.f8681m;
        Intrinsics.checkNotNullExpressionValue(drawerLayout, "binding.drawer");
        C2136F5 c2136f54 = this.f62393b1;
        if (c2136f54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c2136f5 = c2136f54;
        }
        com.guness.widget.NavigationView navigationView = c2136f5.f8689u;
        Intrinsics.checkNotNullExpressionValue(navigationView, "binding.navigationView");
        U03 u03 = new U03(this, toolbar, drawerLayout, navigationView, relativeLayout, m58965X(), mo58955y());
        C03 mo104507a = m59586a1().mo104507a(m58963Z(), u03);
        u03.m82185cm(mo104507a);
        mo104507a.mo71220a();
        this.f62367L0 = mo104507a;
    }

    /* renamed from: F0 */
    public final InterfaceC30430y9 m59603F0() {
        InterfaceC30430y9 interfaceC30430y9 = this.f62371P;
        if (interfaceC30430y9 != null) {
            return interfaceC30430y9;
        }
        Intrinsics.throwUninitializedPropertyAccessException("alertPresenterFactory");
        return null;
    }

    /* renamed from: F1 */
    public final void m59602F1(final Function1<? super InterfaceC48572sJ4, Unit> function1) {
        InterfaceC48572sJ4 interfaceC48572sJ4 = this.f62376R0;
        if (interfaceC48572sJ4 != null) {
            if (interfaceC48572sJ4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requirementPresenter");
                interfaceC48572sJ4 = null;
            }
            function1.invoke(interfaceC48572sJ4);
            return;
        }
        m58967S().postDelayed(new Runnable() { // from class: cP4
            @Override // java.lang.Runnable
            public final void run() {
                RideActivity.m59601I1(RideActivity.this, function1);
            }
        }, 100L);
    }

    /* renamed from: J1 */
    public final void m59600J1(final Function1<? super InterfaceC42185hY4, Unit> function1) {
        InterfaceC42185hY4 interfaceC42185hY4 = this.f62368M0;
        if (interfaceC42185hY4 != null) {
            if (interfaceC42185hY4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ridePresenter");
                interfaceC42185hY4 = null;
            }
            function1.invoke(interfaceC42185hY4);
            return;
        }
        m58967S().postDelayed(new Runnable() { // from class: dP4
            @Override // java.lang.Runnable
            public final void run() {
                RideActivity.m59597L1(RideActivity.this, function1);
            }
        }, 100L);
    }

    /* renamed from: K0 */
    public final C22454gl m59599K0() {
        C22454gl c22454gl = this.f62353B0;
        if (c22454gl != null) {
            return c22454gl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
        return null;
    }

    /* renamed from: L0 */
    public final InterfaceC12495bn m59598L0() {
        InterfaceC12495bn interfaceC12495bn = this.f62352A0;
        if (interfaceC12495bn != null) {
            return interfaceC12495bn;
        }
        Intrinsics.throwUninitializedPropertyAccessException("areaManager");
        return null;
    }

    /* renamed from: M0 */
    public final HP4 m59596M0() {
        HP4 hp4 = this.f62390Z;
        if (hp4 != null) {
            return hp4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bannerPresenterFactory");
        return null;
    }

    /* renamed from: N0 */
    public final InterfaceC4417KO m59595N0() {
        InterfaceC4417KO interfaceC4417KO = this.f62400t0;
        if (interfaceC4417KO != null) {
            return interfaceC4417KO;
        }
        Intrinsics.throwUninitializedPropertyAccessException("birdPayPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity
    /* renamed from: Q */
    public EnumC4283Jy mo58969Q() {
        return this.f62359H;
    }

    /* renamed from: Q0 */
    public final O01 m59594Q0() {
        O01 o01 = this.f62354C0;
        if (o01 != null) {
            return o01;
        }
        Intrinsics.throwUninitializedPropertyAccessException("destinationManager");
        return null;
    }

    /* renamed from: R0 */
    public final InterfaceC42380hs1 m59593R0() {
        InterfaceC42380hs1 interfaceC42380hs1 = this.f62397q0;
        if (interfaceC42380hs1 != null) {
            return interfaceC42380hs1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("flightBannerCoordinatorImplFactory");
        return null;
    }

    /* renamed from: S0 */
    public final InterfaceC40078dz1 m59592S0() {
        InterfaceC40078dz1 interfaceC40078dz1 = this.f62388Y;
        if (interfaceC40078dz1 != null) {
            return interfaceC40078dz1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("freeRideDelegateFactory");
        return null;
    }

    /* renamed from: U0 */
    public final BK2 m59591U0() {
        BK2 bk2 = this.f62361I;
        if (bk2 != null) {
            return bk2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapMarkerOverridesManager");
        return null;
    }

    /* renamed from: V0 */
    public final MapPresenterImplFactory m59590V0() {
        MapPresenterImplFactory mapPresenterImplFactory = this.f62379T;
        if (mapPresenterImplFactory != null) {
            return mapPresenterImplFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapPresenterFactory");
        return null;
    }

    /* renamed from: X0 */
    public final InterfaceC46893pU4 m59589X0() {
        InterfaceC46893pU4 interfaceC46893pU4 = this.f62355D0;
        if (interfaceC46893pU4 != null) {
            return interfaceC46893pU4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapStateManager");
        return null;
    }

    /* renamed from: Y0 */
    public final IL2 m59588Y0() {
        IL2 il2 = this.f62357F0;
        if (il2 != null) {
            return il2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapStyler");
        return null;
    }

    /* renamed from: Z0 */
    public final I95 m59587Z0() {
        I95 i95 = this.f62377S;
        if (i95 != null) {
            return i95;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapUiFactory");
        return null;
    }

    /* renamed from: a1 */
    public final F03 m59586a1() {
        F03 f03 = this.f62373Q;
        if (f03 != null) {
            return f03;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigationDrawerPresenterFactory");
        return null;
    }

    @Override // com.google.android.material.navigation.NavigationView.InterfaceC17850c
    /* renamed from: b */
    public boolean mo49287b(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        C2136F5 c2136f5 = this.f62393b1;
        if (c2136f5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f5 = null;
        }
        c2136f5.f8681m.m67588d(8388611);
        InterfaceC38024aZ2 interfaceC38024aZ2 = this.f62367L0;
        if (interfaceC38024aZ2 != null) {
            return interfaceC38024aZ2.mo71219b(item);
        }
        return false;
    }

    /* renamed from: f1 */
    public final InterfaceC42031hH3 m59585f1() {
        InterfaceC42031hH3 interfaceC42031hH3 = this.f62396p0;
        if (interfaceC42031hH3 != null) {
            return interfaceC42031hH3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parkingPresenterImplFactory");
        return null;
    }

    /* renamed from: h1 */
    public final InterfaceC50008uk1 m59584h1() {
        InterfaceC50008uk1 interfaceC50008uk1 = this.f62405y0;
        if (interfaceC50008uk1 != null) {
            return interfaceC50008uk1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("postRideAnnouncementPresenterFactory");
        return null;
    }

    /* renamed from: i1 */
    public final InterfaceC41919h54 m59583i1() {
        InterfaceC41919h54 interfaceC41919h54 = this.f62398r0;
        if (interfaceC41919h54 != null) {
            return interfaceC41919h54;
        }
        Intrinsics.throwUninitializedPropertyAccessException("privateBirdPresenterImplFactory");
        return null;
    }

    /* renamed from: j1 */
    public final InterfaceC32292Cx4 m59582j1() {
        InterfaceC32292Cx4 interfaceC32292Cx4 = this.f62356E0;
        if (interfaceC32292Cx4 != null) {
            return interfaceC32292Cx4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rentalManager");
        return null;
    }

    /* renamed from: k1 */
    public final WJ4 m59581k1() {
        WJ4 wj4 = this.f62384W;
        if (wj4 != null) {
            return wj4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("requirementPresenterImplFactory");
        return null;
    }

    /* renamed from: l1 */
    public final InterfaceC39086cL4 m59580l1() {
        InterfaceC39086cL4 interfaceC39086cL4 = this.f62399s0;
        if (interfaceC39086cL4 != null) {
            return interfaceC39086cL4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reservationPaymentIntentDelegateFactory");
        return null;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: n0 */
    public MapView mo58944n0() {
        Object value = this.f62362I0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-googleMapView>(...)");
        return (MapView) value;
    }

    /* renamed from: n1 */
    public final AL4 m59579n1() {
        AL4 al4 = this.f62386X;
        if (al4 != null) {
            return al4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reservationPresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: o0 */
    public int mo58943o0() {
        return this.f62360H0;
    }

    /* renamed from: o1 */
    public final InterfaceC45114mU4 m59578o1() {
        InterfaceC45114mU4 interfaceC45114mU4 = this.f62375R;
        if (interfaceC45114mU4 != null) {
            return interfaceC45114mU4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rideMapStartDialogPresenterFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C2136F5 c2136f5 = this.f62393b1;
        InterfaceC42185hY4 interfaceC42185hY4 = null;
        C2136F5 c2136f52 = null;
        if (c2136f5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f5 = null;
        }
        if (c2136f5.f8681m.m67611C(8388611)) {
            C2136F5 c2136f53 = this.f62393b1;
            if (c2136f53 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c2136f52 = c2136f53;
            }
            c2136f52.f8681m.m67588d(8388611);
            return;
        }
        InterfaceC41876h11 interfaceC41876h11 = this.f62369N0;
        boolean z = false;
        if (interfaceC41876h11 != null && interfaceC41876h11.onBackPressed()) {
            z = true;
        }
        if (!z) {
            InterfaceC42185hY4 interfaceC42185hY42 = this.f62368M0;
            if (interfaceC42185hY42 != null) {
                if (interfaceC42185hY42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ridePresenter");
                } else {
                    interfaceC42185hY4 = interfaceC42185hY42;
                }
                if (interfaceC42185hY4.onBackPressed()) {
                    return;
                }
            }
            super.onBackPressed();
        }
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C32492Dt6 c32492Dt6;
        C2136F5 c2136f5;
        C36443Uq6 m80762a;
        super.onCreate(bundle);
        C2136F5 m107809a = C2136F5.m107809a(findViewById(C36585Vg4.drawer));
        Intrinsics.checkNotNullExpressionValue(m107809a, "bind(findViewById(R.id.drawer))");
        this.f62393b1 = m107809a;
        C36443Uq6 m80762a2 = C36443Uq6.m80762a(findViewById(C36585Vg4.footerRoot));
        Intrinsics.checkNotNullExpressionValue(m80762a2, "bind(findViewById(R.id.footerRoot))");
        this.f62394c1 = m80762a2;
        C2136F5 c2136f52 = this.f62393b1;
        if (c2136f52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f52 = null;
        }
        View m45931u = c2136f52.f8689u.m45931u();
        if (m45931u != null && (m80762a = C36443Uq6.m80762a(m45931u)) != null) {
            c32492Dt6 = m80762a.f38110c;
        } else {
            c32492Dt6 = null;
        }
        Intrinsics.checkNotNull(c32492Dt6);
        InterfaceC14212c.InterfaceC14213a m59539a = C14229a.m59539a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        C2136F5 c2136f53 = this.f62393b1;
        if (c2136f53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f5 = null;
        } else {
            c2136f5 = c2136f53;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        AbstractC11719f lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
        m59539a.mo59538a(m21419a, this, m45197b, m58963Z, c2136f5, c32492Dt6, supportFragmentManager, lifecycle, mo58956x()).mo59537a(this);
        TJ4 mo77135a = m59581k1().mo77135a(mo58956x(), this, m58963Z(), m59573x1(), mo58957w());
        mo77135a.m83859g0();
        this.f62376R0 = mo77135a;
        C2136F5 c2136f54 = this.f62393b1;
        if (c2136f54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f54 = null;
        }
        setSupportActionBar(c2136f54.f8666I);
        m59604E0();
        m59605D1().mo8210a(null, AnnouncementContext.SIDE_MENU, new C41707gk1.C22436h(null, null, MapMode.RIDER.toString(), null, 11, null));
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C36387Uk4.menu_rider_activity, menu);
        m59600J1(new C14219i(menu));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        InterfaceC48572sJ4 interfaceC48572sJ4 = this.f62376R0;
        InterfaceC42185hY4 interfaceC42185hY4 = null;
        if (interfaceC48572sJ4 != null) {
            if (interfaceC48572sJ4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requirementPresenter");
                interfaceC48572sJ4 = null;
            }
            interfaceC48572sJ4.onDestroy();
        }
        N95 n95 = this.f62364J0;
        if (n95 != null) {
            n95.onDestroy();
        }
        InterfaceC42185hY4 interfaceC42185hY42 = this.f62368M0;
        if (interfaceC42185hY42 != null) {
            if (interfaceC42185hY42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ridePresenter");
            } else {
                interfaceC42185hY4 = interfaceC42185hY42;
            }
            interfaceC42185hY4.onDestroy();
        }
        G95 g95 = this.f62395d1;
        if (g95 != null) {
            g95.onDestroy();
        }
        super.onDestroy();
    }

    @Override // co.bird.android.core.map.BaseMapActivity, p000.InterfaceC36350Ug3
    public void onMapReady(C39011cD1 map) {
        CameraPosition cameraPosition;
        InterfaceC48572sJ4 interfaceC48572sJ4;
        Set<? extends RideState.Status> mutableSetOf;
        InterfaceC48572sJ4 interfaceC48572sJ42;
        InterfaceC38875bz1 interfaceC38875bz1;
        L44 l44;
        C2136F5 c2136f5;
        InterfaceC48572sJ4 interfaceC48572sJ43;
        InterfaceC42185hY4 interfaceC42185hY4;
        Intrinsics.checkNotNullParameter(map, "map");
        super.onMapReady(map);
        m59588Y0().mo100666a(map, mo58955y().m82623f8().m73665a().getRiderMapConfig().getPoiAnnotations());
        C51721xd6 m61676l = map.m61676l();
        m61676l.m4915c(true);
        m61676l.m4917a(true);
        Unit unit = Unit.INSTANCE;
        boolean enableUserLocationV2 = mo58955y().m82623f8().m73665a().getRiderMapConfig().getEnableUserLocationV2();
        C2136F5 c2136f52 = this.f62393b1;
        if (c2136f52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f52 = null;
        }
        Toolbar toolbar = c2136f52.f8666I;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
        C2136F5 c2136f53 = this.f62393b1;
        if (c2136f53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f53 = null;
        }
        ImageView imageView = c2136f53.f8670b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.actionBarLogo");
        C51597xQ2 c51597xQ2 = new C51597xQ2(this, toolbar, imageView);
        I95 m59587Z0 = m59587Z0();
        LatLng m60885d = C39339cm2.m60885d(m58968R().mo43616p().m73665a());
        if (!C39339cm2.m60887b(m60885d)) {
            m60885d = null;
        }
        if (m60885d != null) {
            cameraPosition = CameraPosition.m50710v(m60885d, 17.0f);
        } else {
            cameraPosition = null;
        }
        ReactiveMapEventImpl reactiveMapEventImpl = new ReactiveMapEventImpl(map);
        MapView mo58944n0 = mo58944n0();
        C2136F5 c2136f54 = this.f62393b1;
        if (c2136f54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f54 = null;
        }
        H95 mo101077a = m59587Z0.mo101077a(this, cameraPosition, map, reactiveMapEventImpl, mo58944n0, c2136f54.f8688t, true, enableUserLocationV2, m59591U0(), false, mo58955y().m82623f8().m73665a().getParkingConfig().getEnableRiderParkingNestRadius());
        this.f62395d1 = mo101077a;
        C2136F5 c2136f55 = this.f62393b1;
        if (c2136f55 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f55 = null;
        }
        SingleBannerFlightView singleBannerFlightView = c2136f55.f8665H;
        Intrinsics.checkNotNullExpressionValue(singleBannerFlightView, "binding.singleBannerFlightView");
        C44752ls1 c44752ls1 = new C44752ls1(this, singleBannerFlightView);
        InterfaceC42380hs1 m59593R0 = m59593R0();
        InterfaceC40099e13 mo58957w = mo58957w();
        InterfaceC48572sJ4 interfaceC48572sJ44 = this.f62376R0;
        if (interfaceC48572sJ44 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requirementPresenter");
            interfaceC48572sJ4 = null;
        } else {
            interfaceC48572sJ4 = interfaceC48572sJ44;
        }
        C41194fs1 mo31746a = m59593R0.mo31746a(this, mo58957w, interfaceC48572sJ4, m58963Z(), c44752ls1, mo101077a);
        this.f62382U0 = mo31746a;
        m59572y1().mo8210a(mo31746a, AnnouncementContext.RIDER_MAP, new C41707gk1.C22436h(null, null, null, null, 15, null));
        m59575t1().mo8210a(mo31746a, AnnouncementContext.RIDE_STARTED, new C41707gk1.C22436h(null, null, null, null, 15, null));
        this.f62366K0 = m59590V0().create(m58995p0(), mo101077a, MapMode.RIDER, true);
        mutableSetOf = SetsKt__SetsKt.mutableSetOf(RideState.Status.STARTED);
        if (Intrinsics.areEqual(mo58955y().m82623f8().getValue().getRequestEndRidePhoto(), Boolean.FALSE)) {
            mutableSetOf.add(RideState.Status.ENDED);
        }
        Y95 mo71182a = m59608B1().mo71182a(m58963Z(), this, mutableSetOf);
        this.f62364J0 = mo71182a;
        if (mo71182a != null) {
            mo71182a.mo75509a();
        }
        m59574u1().mo95817a(m58963Z(), mo58957w()).m99226e();
        C2136F5 c2136f56 = this.f62393b1;
        if (c2136f56 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f56 = null;
        }
        PillButton pillButton = c2136f56.f8690v;
        Intrinsics.checkNotNullExpressionValue(pillButton, "binding.onDemandButton");
        JT3 jt3 = new JT3(new LT3(pillButton), m58963Z(), mo58955y(), m58965X(), m58975F(), m58970P(), m59582j1(), mo58957w(), m58974H(), m58968R());
        jt3.m100407o();
        this.f62385W0 = jt3;
        C41326g54 mo34480a = m59583i1().mo34480a(m58963Z(), new C46070o54(this));
        mo34480a.m40130B();
        this.f62387X0 = mo34480a;
        this.f62392a1 = m59592S0().mo42319a(m59573x1(), this);
        mo31746a.m40686f();
        C44521lU4 mo23609a = m59578o1().mo23609a(m58963Z(), m59573x1(), mo58957w());
        this.f62374Q0 = mo23609a;
        if (mo23609a != null) {
            mo23609a.mo27243a();
        }
        L25 m59577r1 = m59577r1();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        P75 m59573x1 = m59573x1();
        InterfaceC40099e13 mo58957w2 = mo58957w();
        DQ3 mo58956x = mo58956x();
        InterfaceC48572sJ4 interfaceC48572sJ45 = this.f62376R0;
        if (interfaceC48572sJ45 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requirementPresenter");
            interfaceC48572sJ42 = null;
        } else {
            interfaceC48572sJ42 = interfaceC48572sJ45;
        }
        InterfaceC38875bz1 interfaceC38875bz12 = this.f62392a1;
        if (interfaceC38875bz12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("freeRideDelegate");
            interfaceC38875bz1 = null;
        } else {
            interfaceC38875bz1 = interfaceC38875bz12;
        }
        L44 l442 = this.f62387X0;
        if (l442 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("privateBirdPresenter");
            l44 = null;
        } else {
            l44 = l442;
        }
        C42483i25 mo95981a = m59577r1.mo95981a(m58963Z, this, mo101077a, m59573x1, c51597xQ2, mo58957w2, mo58956x, interfaceC48572sJ42, interfaceC38875bz1, mo31746a, l44);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo95981a.m35166Q5(intent);
        this.f62368M0 = mo95981a;
        C2136F5 c2136f57 = this.f62393b1;
        if (c2136f57 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f5 = null;
        } else {
            c2136f5 = c2136f57;
        }
        C52548z11 c52548z11 = new C52548z11(new S11(this, c2136f5, mo101077a, m58968R(), mo58955y()), m59594Q0(), m58963Z(), m58975F(), m59598L0(), m59589X0(), m58968R(), mo58957w(), m59599K0(), mo58955y());
        if (getIntent().hasExtra("destination_latitude") && getIntent().hasExtra("destination_longitude")) {
            c52548z11.m2092F(getIntent().getDoubleExtra("destination_latitude", 0.0d), getIntent().getDoubleExtra("destination_longitude", 0.0d));
        }
        this.f62369N0 = c52548z11;
        m59576s1().mo34443a(m58963Z(), mo31746a, m59573x1()).m40059e();
        C2136F5 c2136f58 = this.f62393b1;
        if (c2136f58 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f58 = null;
        }
        LinearProgressIndicator linearProgressIndicator = c2136f58.f8663F;
        Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.secondaryProgressBar");
        HL4 hl4 = new HL4(this, linearProgressIndicator);
        this.f62383V0 = m59580l1().mo44385a(this, hl4);
        AL4 m59579n1 = m59579n1();
        LifecycleScopeProvider<EnumC7097RE> m58963Z2 = m58963Z();
        InterfaceC40099e13 mo58957w3 = mo58957w();
        InterfaceC48572sJ4 interfaceC48572sJ46 = this.f62376R0;
        if (interfaceC48572sJ46 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requirementPresenter");
            interfaceC48572sJ43 = null;
        } else {
            interfaceC48572sJ43 = interfaceC48572sJ46;
        }
        C52147yL4 mo114088a = m59579n1.mo114088a(this, m58963Z2, hl4, mo58957w3, interfaceC48572sJ43, mo31746a, this.f62383V0);
        this.f62378S0 = mo114088a;
        if (mo114088a != null) {
            mo114088a.mo3622a();
        }
        C2136F5 c2136f59 = this.f62393b1;
        if (c2136f59 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f59 = null;
        }
        ControlButton controlButton = c2136f59.f8661D;
        Intrinsics.checkNotNullExpressionValue(controlButton, "binding.rideButton");
        C2136F5 c2136f510 = this.f62393b1;
        if (c2136f510 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f510 = null;
        }
        TextView textView = c2136f510.f8692x;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.parkingPill");
        C2136F5 c2136f511 = this.f62393b1;
        if (c2136f511 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f511 = null;
        }
        TextView textView2 = c2136f511.f8691w;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.parkingAnnoucementPill");
        TH3 th3 = new TH3(this, controlButton, textView, textView2);
        InterfaceC42031hH3 m59585f1 = m59585f1();
        LifecycleScopeProvider<EnumC7097RE> m58963Z3 = m58963Z();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        C41438gH3 mo34245a = m59585f1.mo34245a(m58963Z3, m45197b, th3, mo101077a, mo58957w(), mo31746a);
        mo34245a.m39745R();
        this.f62380T0 = mo34245a;
        C2136F5 c2136f512 = this.f62393b1;
        if (c2136f512 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f512 = null;
        }
        BannerView rideBannerView = (BannerView) c2136f512.f8665H.findViewById(C52955zi4.bannerView);
        InterfaceC1880Ea m58975F = m58975F();
        Intrinsics.checkNotNullExpressionValue(rideBannerView, "rideBannerView");
        LP4 lp4 = new LP4(m58975F, rideBannerView);
        HP4 m59596M0 = m59596M0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z4 = m58963Z();
        InterfaceC42185hY4 interfaceC42185hY42 = this.f62368M0;
        if (interfaceC42185hY42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ridePresenter");
            interfaceC42185hY4 = null;
        } else {
            interfaceC42185hY4 = interfaceC42185hY42;
        }
        FP4 mo102417a = m59596M0.mo102417a(m58963Z4, interfaceC42185hY4, lp4, mo58957w(), mo31746a, getIntent().getStringExtra("ride_pass_link_code"));
        lp4.m96962b(mo102417a);
        mo102417a.m107221a();
        this.f62370O0 = mo102417a;
        C2136F5 c2136f513 = this.f62393b1;
        if (c2136f513 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f513 = null;
        }
        ViewStub viewStub = c2136f513.f8674f;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.alertContainerStub");
        C30045x9 mo1764a = m59603F0().mo1764a(m58963Z(), new C0897C9(this, viewStub));
        this.f62372P0 = mo1764a;
        if (mo1764a != null) {
            mo1764a.mo5795a();
        }
        C4060JO mo96973a = m59595N0().mo96973a(m58963Z(), mo101077a, mo58955y(), mo31746a);
        mo96973a.m100556H();
        this.f62389Y0 = mo96973a;
        C2136F5 c2136f514 = this.f62393b1;
        if (c2136f514 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f514 = null;
        }
        PillDropdownButton m54387b = c2136f514.f8665H.m54387b();
        C2136F5 c2136f515 = this.f62393b1;
        if (c2136f515 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2136f515 = null;
        }
        LinearProgressIndicator linearProgressIndicator2 = c2136f515.f8663F;
        Intrinsics.checkNotNullExpressionValue(linearProgressIndicator2, "binding.secondaryProgressBar");
        C49912ua5 mo6627a = m59606C1().mo6627a(new C52876za5(this, m54387b, linearProgressIndicator2), m58963Z());
        mo6627a.m10037j();
        this.f62391Z0 = mo6627a;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m59600J1(new C14220j(intent));
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        InterfaceC42185hY4 interfaceC42185hY4 = this.f62368M0;
        if (interfaceC42185hY4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ridePresenter");
            interfaceC42185hY4 = null;
        }
        if (!interfaceC42185hY4.mo35050c(item) && !super.onOptionsItemSelected(item)) {
            return false;
        }
        return true;
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        InterfaceC42185hY4 interfaceC42185hY4 = this.f62368M0;
        if (interfaceC42185hY4 != null) {
            if (interfaceC42185hY4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ridePresenter");
                interfaceC42185hY4 = null;
            }
            interfaceC42185hY4.onPause();
        }
        MapPresenter mapPresenter = this.f62366K0;
        if (mapPresenter != null) {
            mapPresenter.onPause();
        }
        super.onPause();
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: q0 */
    public void mo58942q0(int i, int i2, Intent intent, C39011cD1 map) {
        Address address;
        InterfaceC41876h11 interfaceC41876h11;
        Bundle extras;
        Intrinsics.checkNotNullParameter(map, "map");
        if (i == I35.DESTINATION_SEARCH.ordinal()) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                address = (Address) extras.getParcelable("key_address");
            } else {
                address = null;
            }
            if (address != null && (interfaceC41876h11 = this.f62369N0) != null) {
                double latitude = address.getLatitude();
                double longitude = address.getLongitude();
                String addressLine = address.getAddressLine(0);
                Intrinsics.checkNotNullExpressionValue(addressLine, "address.getAddressLine(0)");
                interfaceC41876h11.mo2071a(new Destination(latitude, longitude, addressLine));
                return;
            }
            return;
        }
        m59600J1(new C14217g(i, i2, intent));
        m59602F1(new C14218h(i, i2, intent));
        GG3 gg3 = this.f62380T0;
        if (gg3 != null) {
            gg3.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: r1 */
    public final L25 m59577r1() {
        L25 l25 = this.f62381U;
        if (l25 != null) {
            return l25;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ridePresenterImplFactory");
        return null;
    }

    /* renamed from: s1 */
    public final InterfaceC41930h65 m59576s1() {
        InterfaceC41930h65 interfaceC41930h65 = this.f62401u0;
        if (interfaceC41930h65 != null) {
            return interfaceC41930h65;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rideStartInBadAreaPresenterImplFactory");
        return null;
    }

    /* renamed from: t1 */
    public final InterfaceC50008uk1 m59575t1() {
        InterfaceC50008uk1 interfaceC50008uk1 = this.f62404x0;
        if (interfaceC50008uk1 != null) {
            return interfaceC50008uk1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rideStartedAnnouncementPresenterFactory");
        return null;
    }

    /* renamed from: u1 */
    public final L65 m59574u1() {
        L65 l65 = this.f62363J;
        if (l65 != null) {
            return l65;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rideStartedTutorialsPresenterFactory");
        return null;
    }

    /* renamed from: x1 */
    public final P75 m59573x1() {
        P75 p75 = this.f62358G0;
        if (p75 != null) {
            return p75;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rideUi");
        return null;
    }

    /* renamed from: y1 */
    public final InterfaceC50008uk1 m59572y1() {
        InterfaceC50008uk1 interfaceC50008uk1 = this.f62403w0;
        if (interfaceC50008uk1 != null) {
            return interfaceC50008uk1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("riderMapAnnouncementPresenterFactory");
        return null;
    }
}
