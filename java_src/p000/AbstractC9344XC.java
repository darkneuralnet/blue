package p000;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.BirdAction;
import co.bird.api.error.RetrofitException;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.callbacks.DialogCallbackExtKt;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.afollestad.materialdialogs.input.DialogInputExtKt;
import com.afollestad.materialdialogs.list.DialogMultiChoiceExtKt;
import com.afollestad.materialdialogs.list.DialogSingleChoiceExtKt;
import com.facebook.share.internal.C17296a;
import com.google.android.material.snackbar.Snackbar;
import com.stripe.android.financialconnections.domain.Entry;
import de.mateware.snacky.Snacky;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC24516r;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.subjects.C24554b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
import p000.AbstractC9344XC;
import p000.C30619yZ;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 ¿\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002À\u0001B\t¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0018\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002Js\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010!\u001a\u00020 *\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0012\u0010\"\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010#\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020 H\u0016J\u0012\u0010&\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010'\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\"\u001a\u00020 2\b\b\u0001\u0010\t\u001a\u00020\u0011H\u0016J\u0012\u0010#\u001a\u00020 2\b\b\u0001\u0010\t\u001a\u00020\u0011H\u0016J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\t\u001a\u00020\u0011H\u0016J\u0012\u0010&\u001a\u00020 2\b\b\u0001\u0010\t\u001a\u00020\u0011H\u0016J\u0012\u0010'\u001a\u00020 2\b\b\u0001\u0010\t\u001a\u00020\u0011H\u0016J\u0018\u0010*\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(H\u0016J\u0018\u0010*\u001a\u00020 2\b\b\u0001\u0010\t\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(JG\u00100\u001a\u00020 2\u0006\u0010+\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010-\u001a\u0004\u0018\u00010\u00112\b\u0010.\u001a\u0004\u0018\u00010\u00112\b\u0010/\u001a\u0004\u0018\u00010\b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b0\u00101J\u0018\u00104\u001a\u00020 2\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u0011H\u0016J\b\u00105\u001a\u00020 H\u0016J\u0010\u00106\u001a\u00020 2\u0006\u00103\u001a\u00020\u0011H\u0016J\u0010\u00109\u001a\u00020 2\u0006\u00108\u001a\u000207H\u0016J\u0012\u00109\u001a\u00020 2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016J\u0012\u0010<\u001a\u00020 2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010<\u001a\u00020 2\u0006\u0010>\u001a\u00020=H\u0016J\u0010\u0010@\u001a\u00020\u00112\b\b\u0001\u0010?\u001a\u00020\u0011J+\u0010D\u001a\u00020\b2\b\b\u0001\u0010A\u001a\u00020\u00112\u0012\u0010C\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060B\"\u00020\u0006¢\u0006\u0004\bD\u0010EJ\b\u0010F\u001a\u00020 H\u0016J3\u0010J\u001a\u00020\u00142\"\u0010I\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020H0G0B\"\n\u0012\u0006\b\u0001\u0012\u00020H0GH\u0016¢\u0006\u0004\bJ\u0010KJ\b\u0010L\u001a\u00020\u0014H\u0016JW\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0O2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0M2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\bQ\u0010RJw\u0010S\u001a\u00020 2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0017H\u0016¢\u0006\u0004\bS\u0010TJ&\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0O2\u0006\u0010V\u001a\u00020U2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016JZ\u0010X\u001a\u00020 2\u0006\u0010V\u001a\u00020H2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\b\u0010W\u001a\u0004\u0018\u00010\bH\u0016JZ\u0010S\u001a\u00020 2\u0006\u0010V\u001a\u00020H2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\b\u0010W\u001a\u0004\u0018\u00010\bH\u0016JZ\u0010\u001c\u001a\u00020\u00182\u0006\u0010V\u001a\u00020H2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\u0010W\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010Z\u001a\u00020 2\u0006\u0010V\u001a\u00020YH\u0016J&\u0010[\u001a\b\u0012\u0004\u0012\u00020P0O2\u0006\u0010V\u001a\u00020H2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J&\u0010\\\u001a\b\u0012\u0004\u0012\u00020P0O2\u0006\u0010V\u001a\u00020H2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J¾\u0001\u0010\\\u001a\b\u0012\u0004\u0012\u00020P0O2\b\b\u0001\u0010+\u001a\u00020\u00112\n\b\u0001\u0010]\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010^\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010_\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010`\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010b\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010c\u001a\u00020\u00142\u0017\u0010f\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020 0d¢\u0006\u0002\beH\u0016¢\u0006\u0004\b\\\u0010gJ.\u0010j\u001a\b\u0012\u0004\u0012\u00020\b0i2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\b0M2\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\u000fH\u0016Jm\u0010r\u001a\b\u0012\u0004\u0012\u00020q0O2\u0006\u0010\u0010\u001a\u00020\b2\b\u0010k\u001a\u0004\u0018\u00010\b2\u0006\u0010l\u001a\u00020\b2\u0006\u0010m\u001a\u00020\b2\b\u0010n\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010o\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010p\u001a\u00020\u0014H\u0016¢\u0006\u0004\br\u0010sJë\u0001\u0010\u0081\u0001\u001a\u00020 2\b\b\u0001\u0010+\u001a\u00020\u00112\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\u00112\u0006\u0010v\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\n\b\u0001\u0010w\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u00112\b\u0010x\u001a\u0004\u0018\u00010\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010y\u001a\u00020\u00112\n\b\u0001\u0010z\u001a\u0004\u0018\u00010\u00112\b\u0010{\u001a\u0004\u0018\u00010\b2\b\u0010|\u001a\u0004\u0018\u00010\b2\u000e\u0010}\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010~\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u0007\u0010\u0080\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001Jê\u0001\u0010\u0081\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u0002072\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\u00112\u0006\u0010v\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\n\b\u0001\u0010w\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u00112\b\u0010x\u001a\u0004\u0018\u00010\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010y\u001a\u00020\u00112\n\b\u0001\u0010z\u001a\u0004\u0018\u00010\u00112\b\u0010{\u001a\u0004\u0018\u00010\b2\b\u0010|\u001a\u0004\u0018\u00010\b2\u000e\u0010}\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010~\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u000e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00172\u0007\u0010\u0080\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0084\u0001J+\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020P0O2\u0006\u0010V\u001a\u00020H2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001Je\u0010\u0090\u0001\u001a\u00020 2\u0007\u0010\u0088\u0001\u001a\u00020$2@\u0010\u008e\u0001\u001a;\u0012\u0016\u0012\u00140\b¢\u0006\u000f\b\u008a\u0001\u0012\n\b\u008b\u0001\u0012\u0005\b\b(\u008c\u0001\u0012\u0016\u0012\u00140\b¢\u0006\u000f\b\u008a\u0001\u0012\n\b\u008b\u0001\u0012\u0005\b\b(\u008d\u0001\u0012\u0004\u0012\u00020 \u0018\u00010\u0089\u00012\u000f\u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0017H\u0016J\b\u0010<\u001a\u00020 H\u0016J\u0013\u0010\u0093\u0001\u001a\u00020 2\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001H\u0016J\u0013\u0010\u0096\u0001\u001a\u00020 2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0017R \u0010\u009b\u0001\u001a\u0002078TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R \u0010¤\u0001\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0098\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R!\u0010©\u0001\u001a\u00030¥\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u0098\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\u0017\u0010ª\u0001\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001a\u0010\\\u001a\u0005\u0018\u00010¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\\\u0010\u00ad\u0001R0\u0010°\u0001\u001a\u0005\u0018\u00010®\u00012\n\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u0019\u0010´\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010«\u0001R.\u0010µ\u0001\u001a\u0004\u0018\u00010H2\t\u0010¯\u0001\u001a\u0004\u0018\u00010H8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u0018\u0010¼\u0001\u001a\u00030¹\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001¨\u0006Á\u0001"}, m28432d2 = {"LXC;", "LaM5;", "Lh56;", "Ldl2;", "LS74;", "LH31;", "", "LLo6;", "", "message", "Lde/mateware/snacky/Snacky$Builder;", "kotlin.jvm.PlatformType", "snackBuilder", "Lcom/google/android/material/snackbar/Snackbar;", "persistentError", "", "title", "", "positiveText", "negativeText", "", "cancelable", "withHapticFeedback", "Lkotlin/Function0;", "Lio/reactivex/c;", "onOk", "onCancel", "onDismiss", "showDialogCompletable", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/Integer;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lio/reactivex/c;", "Lio/reactivex/subjects/b;", "response", "", "invoke", "snackToast", "error", "", "errorGeneric", "success", "warn", "Lf56;", "duration", "topToast", "customLayout", Entry.TYPE_IMAGE, "body", "imageRes", "bodyText", "customToast", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lf56;)V", "show", "hiddenState", "showProgress", "startProgress", "stopProgress", "Landroid/view/View;", "view", "showKeyboard", "Landroid/os/IBinder;", "windowToken", "hideKeyboard", "Landroid/widget/EditText;", "editor", "color", "getColor", "resId", "", "formatArgs", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "dismissDialog", "Lkotlin/reflect/KClass;", "LNy;", "dialogClasses", "dismissIfCurrentDialogIsInstanceOf", "([Lkotlin/reflect/KClass;)Z", "dialogShown", "", "agreements", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "agreementDialog", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;ZZ)Lio/reactivex/F;", "showDialog", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/Integer;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lf9;", "alert", "secondaryMessage", "showBirdDialog", "Lo12;", "showIndeterminateDialog", "birdDialog", "dialog", "positiveButton", "negativeButton", "titleIcon", "titleLabel", "messageLabel", "titleIconRes", "wrapInScrollView", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "viewSetup", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZZLkotlin/jvm/functions/Function1;)Lio/reactivex/F;", "selections", "Lio/reactivex/p;", "selectorDialog", "content", "hint", "prefill", "inputType", "allowEmptyInput", "singleLine", "LH31$b;", "dialogWithInput", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZ)Lio/reactivex/F;", "icon", "iconRes", "transparentBackground", "header", "headerText", "primaryButton", "secondaryButton", "primaryButtonText", "secondaryButtonText", "onPrimary", "onSecondary", "onShow", "dismissOnButtonClick", "showCustomDialog", "(ILjava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "customView", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "bottomSheetLayoutOverrideRes", "showBottomSheetAlert", "(LNy;Ljava/lang/Integer;)Lio/reactivex/F;", "e", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "errorKind", "errorDesc", "fireTrackEvent", "onNonRetrofitException", "showRetrofitExceptionDialog", "Lco/bird/android/model/constant/BirdAction;", "action", "showSuccessMessage", "", "milliseconds", "vibrate", "contentView$delegate", "Lkotlin/Lazy;", "getContentView", "()Landroid/view/View;", "contentView", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "toolbarHeight$delegate", "getToolbarHeight", "()I", "toolbarHeight", "Landroid/os/Vibrator;", "vibrator$delegate", "getVibrator", "()Landroid/os/Vibrator;", "vibrator", "snackDuration", "I", "Landroid/content/DialogInterface;", "Landroid/content/DialogInterface;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "<set-?>", "currentDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getCurrentDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "progressCount", "currentBirdDialog", "LNy;", "getCurrentBirdDialog", "()LNy;", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "()V", "Companion", C17296a.f69688o, "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRenderer.kt\nco/bird/android/core/base/ui/BaseRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1250:1\n1#2:1251\n*E\n"})
/* renamed from: XC */
/* loaded from: classes2.dex */
public abstract class AbstractC9344XC implements InterfaceC37910aM5, InterfaceC41921h56, InterfaceC39940dl2, S74, H31, InterfaceC34319Lo6 {
    public static final C9345a Companion = new C9345a(null);
    public static final long FAILURE_VIBRATE_DURATION = 1000;
    public static final long SUCCESS_VIBRATE_DURATION = 250;
    private final Lazy contentView$delegate;
    private AbstractC5751Ny currentBirdDialog;
    private MaterialDialog currentDialog;
    private DialogInterface dialog;
    private final Handler handler;
    private int progressCount;
    private final int snackDuration;
    private final Lazy toolbarHeight$delegate;
    private final Lazy vibrator$delegate;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LXC$a;", "", "", "FAILURE_VIBRATE_DURATION", "J", "SUCCESS_VIBRATE_DURATION", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: XC$a */
    /* loaded from: classes2.dex */
    public static final class C9345a {
        public /* synthetic */ C9345a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9345a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lco/bird/android/model/DialogResponse;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: XC$b */
    /* loaded from: classes2.dex */
    public static final class C9346b extends Lambda implements Function1<InterfaceC23444H<DialogResponse>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f42780h;

        /* renamed from: i */
        public final /* synthetic */ CharSequence f42781i;

        /* renamed from: j */
        public final /* synthetic */ List<String> f42782j;

        /* renamed from: k */
        public final /* synthetic */ CharSequence f42783k;

        /* renamed from: l */
        public final /* synthetic */ Integer f42784l;

        /* renamed from: m */
        public final /* synthetic */ Integer f42785m;

        /* renamed from: n */
        public final /* synthetic */ boolean f42786n;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$b$a */
        /* loaded from: classes2.dex */
        public static final class C9347a extends Lambda implements Function1<MaterialDialog, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f42787g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9347a(InterfaceC23444H<DialogResponse> interfaceC23444H) {
                super(1);
                this.f42787g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
                invoke2(materialDialog);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(MaterialDialog dialog) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                this.f42787g.onSuccess(DialogResponse.OK);
                dialog.setOnDismissListener(null);
                dialog.dismiss();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$b$b */
        /* loaded from: classes2.dex */
        public static final class C9348b extends Lambda implements Function1<MaterialDialog, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f42788g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9348b(InterfaceC23444H<DialogResponse> interfaceC23444H) {
                super(1);
                this.f42788g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
                invoke2(materialDialog);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(MaterialDialog dialog) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                this.f42788g.onSuccess(DialogResponse.CANCEL);
                dialog.setOnDismissListener(null);
                dialog.dismiss();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "", "<anonymous parameter 2>", "", C17296a.f69688o, "(Lcom/afollestad/materialdialogs/MaterialDialog;[ILjava/util/List;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: XC$b$c */
        /* loaded from: classes2.dex */
        public static final class C9349c extends Lambda implements Function3<MaterialDialog, int[], List<? extends CharSequence>, Unit> {

            /* renamed from: g */
            public static final C9349c f42789g = new C9349c();

            public C9349c() {
                super(3);
            }

            /* renamed from: a */
            public final void m77211a(MaterialDialog materialDialog, int[] iArr, List<? extends CharSequence> list) {
                Intrinsics.checkNotNullParameter(materialDialog, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(iArr, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(list, "<anonymous parameter 2>");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog, int[] iArr, List<? extends CharSequence> list) {
                m77211a(materialDialog, iArr, list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9346b(boolean z, CharSequence charSequence, List<String> list, CharSequence charSequence2, Integer num, Integer num2, boolean z2) {
            super(1);
            this.f42780h = z;
            this.f42781i = charSequence;
            this.f42782j = list;
            this.f42783k = charSequence2;
            this.f42784l = num;
            this.f42785m = num2;
            this.f42786n = z2;
        }

        /* renamed from: c */
        public static final void m77213c(InterfaceC23444H emitter, DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onSuccess(DialogResponse.DISMISS);
        }

        /* renamed from: d */
        public static final void m77212d(Ref.ObjectRef dialogBuilder) {
            Intrinsics.checkNotNullParameter(dialogBuilder, "$dialogBuilder");
            ((MaterialDialog) dialogBuilder.element).setOnDismissListener(null);
            ((MaterialDialog) dialogBuilder.element).dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<DialogResponse> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [T, com.afollestad.materialdialogs.MaterialDialog] */
        /* JADX WARN: Type inference failed for: r4v13, types: [T, com.afollestad.materialdialogs.MaterialDialog] */
        /* JADX WARN: Type inference failed for: r4v15, types: [T, com.afollestad.materialdialogs.MaterialDialog] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<DialogResponse> emitter) {
            boolean isBlank;
            String m14550k;
            String m14550k2;
            DialogInterface dialogInterface;
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            if (AbstractC9344XC.this.getActivity().isFinishing()) {
                emitter.onSuccess(DialogResponse.DISMISS);
                return;
            }
            if (this.f42780h && (dialogInterface = AbstractC9344XC.this.dialog) != null) {
                dialogInterface.dismiss();
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = DialogMultiChoiceExtKt.listItemsMultiChoice$default(MaterialDialog.title$default(new MaterialDialog(AbstractC9344XC.this.getActivity(), null, 2, null), null, this.f42781i.toString(), 1, null).noAutoDismiss().cancelable(this.f42780h), null, this.f42782j, null, null, false, false, C9349c.f42789g, 61, null);
            isBlank = StringsKt__StringsJVMKt.isBlank(this.f42783k);
            if (!isBlank) {
                MaterialDialog.message$default((MaterialDialog) objectRef.element, null, this.f42783k, null, 5, null);
            }
            DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: YC
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface2) {
                    AbstractC9344XC.C9346b.m77213c(InterfaceC23444H.this, dialogInterface2);
                }
            };
            m14550k = C28237sD.m14550k(this.f42784l, AbstractC9344XC.this.getActivity());
            if (m14550k != null) {
                objectRef.element = MaterialDialog.positiveButton$default((MaterialDialog) objectRef.element, null, m14550k, new C9347a(emitter), 1, null);
            }
            m14550k2 = C28237sD.m14550k(this.f42785m, AbstractC9344XC.this.getActivity());
            if (m14550k2 != null) {
                objectRef.element = MaterialDialog.negativeButton$default((MaterialDialog) objectRef.element, null, m14550k2, new C9348b(emitter), 1, null);
            }
            AbstractC9344XC.this.currentDialog = (MaterialDialog) objectRef.element;
            ((MaterialDialog) objectRef.element).show();
            Unit unit = Unit.INSTANCE;
            boolean z = this.f42786n;
            AbstractC9344XC abstractC9344XC = AbstractC9344XC.this;
            emitter.mo4878a(new InterfaceC23483f() { // from class: ZC
                @Override // io.reactivex.functions.InterfaceC23483f
                public final void cancel() {
                    AbstractC9344XC.C9346b.m77212d(Ref.ObjectRef.this);
                }
            });
            ((MaterialDialog) objectRef.element).setOnDismissListener(onDismissListener);
            if (z) {
                abstractC9344XC.getActivity().getWindow().getDecorView().performHapticFeedback(1, 2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lco/bird/android/model/DialogResponse;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRenderer.kt\nco/bird/android/core/base/ui/BaseRenderer$birdDialog$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1250:1\n1#2:1251\n*E\n"})
    /* renamed from: XC$c */
    /* loaded from: classes2.dex */
    public static final class C9350c extends Lambda implements Function1<InterfaceC23444H<DialogResponse>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f42791h;

        /* renamed from: i */
        public final /* synthetic */ boolean f42792i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC5751Ny f42793j;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$c$a */
        /* loaded from: classes2.dex */
        public static final class C9351a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f42794g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9351a(InterfaceC23444H<DialogResponse> interfaceC23444H) {
                super(0);
                this.f42794g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f42794g.onSuccess(DialogResponse.OK);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$c$b */
        /* loaded from: classes2.dex */
        public static final class C9352b extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f42795g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9352b(InterfaceC23444H<DialogResponse> interfaceC23444H) {
                super(0);
                this.f42795g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f42795g.onSuccess(DialogResponse.CANCEL);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$c$c */
        /* loaded from: classes2.dex */
        public static final class C9353c extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f42796g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9353c(InterfaceC23444H<DialogResponse> interfaceC23444H) {
                super(0);
                this.f42796g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f42796g.onSuccess(DialogResponse.DISMISS);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$c$d */
        /* loaded from: classes2.dex */
        public static final class C9354d extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC9344XC f42797g;

            /* renamed from: h */
            public final /* synthetic */ AbstractC5751Ny f42798h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9354d(AbstractC9344XC abstractC9344XC, AbstractC5751Ny abstractC5751Ny) {
                super(0);
                this.f42797g = abstractC9344XC;
                this.f42798h = abstractC5751Ny;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f42797g.currentBirdDialog = this.f42798h;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9350c(boolean z, boolean z2, AbstractC5751Ny abstractC5751Ny) {
            super(1);
            this.f42791h = z;
            this.f42792i = z2;
            this.f42793j = abstractC5751Ny;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<DialogResponse> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<DialogResponse> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            if (AbstractC9344XC.this.getActivity().isFinishing()) {
                emitter.onSuccess(DialogResponse.DISMISS);
                return;
            }
            if (this.f42791h) {
                AbstractC9344XC.this.dismissDialog();
            }
            AbstractC9344XC abstractC9344XC = AbstractC9344XC.this;
            int i = C33804Jj4.dialog_bird_general;
            boolean z = this.f42791h;
            boolean z2 = this.f42792i;
            Integer valueOf = Integer.valueOf(C37287Yg4.title);
            Integer valueOf2 = Integer.valueOf(C37287Yg4.message);
            CharSequence title = this.f42793j.title(AbstractC9344XC.this.getActivity());
            CharSequence message = this.f42793j.message(AbstractC9344XC.this.getActivity());
            int i2 = C37287Yg4.confirmButton;
            Integer valueOf3 = Integer.valueOf(C37287Yg4.secondaryButton);
            Integer mo3215a = this.f42793j.mo3215a();
            String string = mo3215a != null ? AbstractC9344XC.this.getActivity().getString(mo3215a.intValue()) : null;
            Integer negativeText = this.f42793j.getNegativeText();
            abstractC9344XC.showCustomDialog(i, (Integer) null, (Integer) null, false, z, z2, valueOf, valueOf2, title, message, i2, valueOf3, string, negativeText != null ? AbstractC9344XC.this.getActivity().getString(negativeText.intValue()) : null, (Function0<Unit>) new C9351a(emitter), (Function0<Unit>) new C9352b(emitter), (Function0<Unit>) new C9353c(emitter), (Function0<Unit>) new C9354d(AbstractC9344XC.this, this.f42793j), true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/view/View;", "b", "()Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: XC$d */
    /* loaded from: classes2.dex */
    public static final class C9355d extends Lambda implements Function0<View> {
        public C9355d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final View invoke() {
            return C40788fB0.m41779c(AbstractC9344XC.this.getActivity(), 16908290);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lco/bird/android/model/DialogResponse;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: XC$e */
    /* loaded from: classes2.dex */
    public static final class C9356e extends Lambda implements Function1<InterfaceC23444H<DialogResponse>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f42801h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC5751Ny f42802i;

        /* renamed from: j */
        public final /* synthetic */ boolean f42803j;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$e$a */
        /* loaded from: classes2.dex */
        public static final class C9357a extends Lambda implements Function1<MaterialDialog, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f42804g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9357a(InterfaceC23444H<DialogResponse> interfaceC23444H) {
                super(1);
                this.f42804g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
                invoke2(materialDialog);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(MaterialDialog dialog) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                this.f42804g.onSuccess(DialogResponse.OK);
                dialog.setOnDismissListener(null);
                dialog.dismiss();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$e$b */
        /* loaded from: classes2.dex */
        public static final class C9358b extends Lambda implements Function1<MaterialDialog, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f42805g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9358b(InterfaceC23444H<DialogResponse> interfaceC23444H) {
                super(1);
                this.f42805g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
                invoke2(materialDialog);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(MaterialDialog dialog) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                this.f42805g.onSuccess(DialogResponse.CANCEL);
                dialog.setOnDismissListener(null);
                dialog.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9356e(boolean z, AbstractC5751Ny abstractC5751Ny, boolean z2) {
            super(1);
            this.f42801h = z;
            this.f42802i = abstractC5751Ny;
            this.f42803j = z2;
        }

        /* renamed from: c */
        public static final void m77207c(InterfaceC23444H emitter, DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onSuccess(DialogResponse.DISMISS);
        }

        /* renamed from: d */
        public static final void m77206d(MaterialDialog dialogBuilder) {
            Intrinsics.checkNotNullParameter(dialogBuilder, "$dialogBuilder");
            dialogBuilder.setOnDismissListener(null);
            dialogBuilder.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<DialogResponse> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<DialogResponse> emitter) {
            String m14550k;
            String m14550k2;
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            if (AbstractC9344XC.this.getActivity().isFinishing()) {
                emitter.onSuccess(DialogResponse.DISMISS);
                return;
            }
            if (this.f42801h) {
                AbstractC9344XC.this.dismissDialog();
            }
            DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: aD
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AbstractC9344XC.C9356e.m77207c(InterfaceC23444H.this, dialogInterface);
                }
            };
            final MaterialDialog cancelable = MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(AbstractC9344XC.this.getActivity(), null, 2, null), null, this.f42802i.title(AbstractC9344XC.this.getActivity()).toString(), 1, null), null, this.f42802i.message(AbstractC9344XC.this.getActivity()), null, 5, null).noAutoDismiss().cancelable(this.f42801h);
            m14550k = C28237sD.m14550k(this.f42802i.mo3215a(), AbstractC9344XC.this.getActivity());
            if (m14550k != null) {
                MaterialDialog.positiveButton$default(cancelable, null, m14550k, new C9357a(emitter), 1, null);
            }
            m14550k2 = C28237sD.m14550k(this.f42802i.getNegativeText(), AbstractC9344XC.this.getActivity());
            if (m14550k2 != null) {
                MaterialDialog.negativeButton$default(cancelable, null, m14550k2, new C9358b(emitter), 1, null);
            }
            AbstractC9344XC.this.currentDialog = cancelable;
            cancelable.show();
            Unit unit = Unit.INSTANCE;
            boolean z = this.f42803j;
            AbstractC9344XC abstractC9344XC = AbstractC9344XC.this;
            emitter.mo4878a(new InterfaceC23483f() { // from class: bD
                @Override // io.reactivex.functions.InterfaceC23483f
                public final void cancel() {
                    AbstractC9344XC.C9356e.m77206d(MaterialDialog.this);
                }
            });
            cancelable.setOnDismissListener(onDismissListener);
            if (z) {
                abstractC9344XC.getActivity().getWindow().getDecorView().performHapticFeedback(1, 2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Lco/bird/android/model/DialogResponse;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRenderer.kt\nco/bird/android/core/base/ui/BaseRenderer$dialog$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1250:1\n1#2:1251\n*E\n"})
    /* renamed from: XC$f */
    /* loaded from: classes2.dex */
    public static final class C9359f extends Lambda implements Function1<InterfaceC23444H<DialogResponse>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f42807h;

        /* renamed from: i */
        public final /* synthetic */ boolean f42808i;

        /* renamed from: j */
        public final /* synthetic */ boolean f42809j;

        /* renamed from: k */
        public final /* synthetic */ Integer f42810k;

        /* renamed from: l */
        public final /* synthetic */ CharSequence f42811l;

        /* renamed from: m */
        public final /* synthetic */ Integer f42812m;

        /* renamed from: n */
        public final /* synthetic */ Integer f42813n;

        /* renamed from: o */
        public final /* synthetic */ Integer f42814o;

        /* renamed from: p */
        public final /* synthetic */ CharSequence f42815p;

        /* renamed from: q */
        public final /* synthetic */ Integer f42816q;

        /* renamed from: r */
        public final /* synthetic */ Integer f42817r;

        /* renamed from: s */
        public final /* synthetic */ Function1<View, Unit> f42818s;

        /* renamed from: t */
        public final /* synthetic */ boolean f42819t;

        /* renamed from: u */
        public final /* synthetic */ String f42820u;

        /* renamed from: v */
        public final /* synthetic */ String f42821v;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$f$a */
        /* loaded from: classes2.dex */
        public static final class C9360a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f42822g;

            /* renamed from: h */
            public final /* synthetic */ MaterialDialog f42823h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9360a(InterfaceC23444H<DialogResponse> interfaceC23444H, MaterialDialog materialDialog) {
                super(1);
                this.f42822g = interfaceC23444H;
                this.f42823h = materialDialog;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f42822g.onSuccess(DialogResponse.OK);
                this.f42823h.setOnDismissListener(null);
                this.f42823h.dismiss();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$f$b */
        /* loaded from: classes2.dex */
        public static final class C9361b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<DialogResponse> f42824g;

            /* renamed from: h */
            public final /* synthetic */ MaterialDialog f42825h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9361b(InterfaceC23444H<DialogResponse> interfaceC23444H, MaterialDialog materialDialog) {
                super(1);
                this.f42824g = interfaceC23444H;
                this.f42825h = materialDialog;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f42824g.onSuccess(DialogResponse.CANCEL);
                this.f42825h.setOnDismissListener(null);
                this.f42825h.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9359f(int i, boolean z, boolean z2, Integer num, CharSequence charSequence, Integer num2, Integer num3, Integer num4, CharSequence charSequence2, Integer num5, Integer num6, Function1<? super View, Unit> function1, boolean z3, String str, String str2) {
            super(1);
            this.f42807h = i;
            this.f42808i = z;
            this.f42809j = z2;
            this.f42810k = num;
            this.f42811l = charSequence;
            this.f42812m = num2;
            this.f42813n = num3;
            this.f42814o = num4;
            this.f42815p = charSequence2;
            this.f42816q = num5;
            this.f42817r = num6;
            this.f42818s = function1;
            this.f42819t = z3;
            this.f42820u = str;
            this.f42821v = str2;
        }

        /* renamed from: c */
        public static final void m77203c(MaterialDialog dialog) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            dialog.setOnDismissListener(null);
            dialog.dismiss();
        }

        /* renamed from: d */
        public static final void m77202d(InterfaceC23444H emitter, DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onSuccess(DialogResponse.DISMISS);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<DialogResponse> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<DialogResponse> emitter) {
            View view;
            TextView textView;
            TextView textView2;
            ImageView imageView;
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            if (AbstractC9344XC.this.getActivity().isFinishing()) {
                emitter.onSuccess(DialogResponse.DISMISS);
                return;
            }
            AbstractC9344XC.this.dismissDialog();
            final MaterialDialog cancelable = DialogCustomViewExtKt.customView$default(new MaterialDialog(AbstractC9344XC.this.getActivity(), null, 2, null), Integer.valueOf(this.f42807h), null, this.f42808i, false, false, false, 58, null).noAutoDismiss().cancelable(this.f42809j);
            cancelable.show();
            Unit unit = Unit.INSTANCE;
            boolean z = this.f42819t;
            AbstractC9344XC abstractC9344XC = AbstractC9344XC.this;
            if (z) {
                abstractC9344XC.getActivity().getWindow().getDecorView().performHapticFeedback(1, 2);
            }
            AbstractC9344XC.this.currentDialog = cancelable;
            emitter.mo4878a(new InterfaceC23483f() { // from class: cD
                @Override // io.reactivex.functions.InterfaceC23483f
                public final void cancel() {
                    AbstractC9344XC.C9359f.m77203c(MaterialDialog.this);
                }
            });
            DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: dD
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AbstractC9344XC.C9359f.m77202d(InterfaceC23444H.this, dialogInterface);
                }
            };
            try {
                view = DialogCustomViewExtKt.getCustomView(cancelable);
            } catch (Exception unused) {
                view = null;
            }
            Integer num = this.f42810k;
            if (num != null) {
                TextView textView3 = view != null ? (TextView) C49520tu6.m11238m(view, num.intValue()) : null;
                if (textView3 != null) {
                    textView3.setText(this.f42811l);
                }
            }
            Integer num2 = this.f42812m;
            if (num2 != null && this.f42813n != null && view != null && (imageView = (ImageView) C49520tu6.m11238m(view, num2.intValue())) != null) {
                Integer num3 = this.f42813n;
                C49520tu6.m11233r(imageView);
                imageView.setImageResource(num3.intValue());
            }
            Integer num4 = this.f42814o;
            if (num4 != null) {
                TextView textView4 = view != null ? (TextView) C49520tu6.m11238m(view, num4.intValue()) : null;
                if (textView4 != null) {
                    textView4.setText(this.f42815p);
                }
            }
            Integer num5 = this.f42816q;
            if (num5 != null && view != null && (textView2 = (TextView) C49520tu6.m11238m(view, num5.intValue())) != null) {
                String str = this.f42820u;
                if (str != null) {
                    textView2.setText(str);
                }
                C49520tu6.m11233r(textView2);
                C34585Ms2.m94661j(textView2, new C9360a(emitter, cancelable));
            }
            Integer num6 = this.f42817r;
            if (num6 != null && view != null && (textView = (TextView) C49520tu6.m11238m(view, num6.intValue())) != null) {
                String str2 = this.f42821v;
                C49520tu6.m11233r(textView);
                if (str2 != null) {
                    textView.setText(str2);
                }
                C34585Ms2.m94661j(textView, new C9361b(emitter, cancelable));
            }
            if (view != null) {
                this.f42818s.invoke(view);
            }
            cancelable.setOnDismissListener(onDismissListener);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "LH31$b;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: XC$g */
    /* loaded from: classes2.dex */
    public static final class C9362g extends Lambda implements Function1<InterfaceC23444H<H31.AbstractC3016b>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Integer f42827h;

        /* renamed from: i */
        public final /* synthetic */ String f42828i;

        /* renamed from: j */
        public final /* synthetic */ String f42829j;

        /* renamed from: k */
        public final /* synthetic */ String f42830k;

        /* renamed from: l */
        public final /* synthetic */ boolean f42831l;

        /* renamed from: m */
        public final /* synthetic */ String f42832m;

        /* renamed from: n */
        public final /* synthetic */ String f42833n;

        /* renamed from: o */
        public final /* synthetic */ String f42834o;

        /* renamed from: p */
        public final /* synthetic */ boolean f42835p;

        /* renamed from: q */
        public final /* synthetic */ boolean f42836q;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC$g$a */
        /* loaded from: classes2.dex */
        public static final class C9363a extends Lambda implements Function1<MaterialDialog, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<H31.AbstractC3016b> f42837g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9363a(InterfaceC23444H<H31.AbstractC3016b> interfaceC23444H) {
                super(1);
                this.f42837g = interfaceC23444H;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
                invoke2(materialDialog);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(MaterialDialog it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f42837g.onSuccess(H31.AbstractC3016b.C3017a.f12782a);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "<anonymous parameter 0>", "", "value", "", C17296a.f69688o, "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/CharSequence;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: XC$g$b */
        /* loaded from: classes2.dex */
        public static final class C9364b extends Lambda implements Function2<MaterialDialog, CharSequence, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC23444H<H31.AbstractC3016b> f42838g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9364b(InterfaceC23444H<H31.AbstractC3016b> interfaceC23444H) {
                super(2);
                this.f42838g = interfaceC23444H;
            }

            /* renamed from: a */
            public final void m77197a(MaterialDialog materialDialog, CharSequence value) {
                Intrinsics.checkNotNullParameter(materialDialog, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f42838g.onSuccess(new H31.AbstractC3016b.C3019c(value.toString()));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog, CharSequence charSequence) {
                m77197a(materialDialog, charSequence);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9362g(Integer num, String str, String str2, String str3, boolean z, String str4, String str5, String str6, boolean z2, boolean z3) {
            super(1);
            this.f42827h = num;
            this.f42828i = str;
            this.f42829j = str2;
            this.f42830k = str3;
            this.f42831l = z;
            this.f42832m = str4;
            this.f42833n = str5;
            this.f42834o = str6;
            this.f42835p = z2;
            this.f42836q = z3;
        }

        /* renamed from: c */
        public static final void m77199c(MaterialDialog dialog) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            dialog.setOnDismissListener(null);
            dialog.dismiss();
        }

        /* renamed from: d */
        public static final void m77198d(InterfaceC23444H emitter, DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onSuccess(H31.AbstractC3016b.C3018b.f12783a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<H31.AbstractC3016b> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<H31.AbstractC3016b> emitter) {
            EditText editText;
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            if (AbstractC9344XC.this.getActivity().isFinishing()) {
                emitter.onSuccess(H31.AbstractC3016b.C3018b.f12783a);
                return;
            }
            AbstractC9344XC.this.dismissDialog();
            Integer num = this.f42827h;
            final MaterialDialog input$default = DialogInputExtKt.input$default(MaterialDialog.title$default(new MaterialDialog(AbstractC9344XC.this.getActivity(), null, 2, null), null, this.f42828i, 1, null), this.f42829j, null, this.f42830k, null, num != null ? num.intValue() : 1, null, false, this.f42831l, new C9364b(emitter), 106, null);
            String str = this.f42832m;
            if (str != null) {
                MaterialDialog.message$default(input$default, null, str, null, 5, null);
            }
            String str2 = this.f42833n;
            if (str2 != null) {
                MaterialDialog.positiveButton$default(input$default, null, str2, null, 5, null);
            }
            String str3 = this.f42834o;
            if (str3 != null) {
                MaterialDialog.negativeButton$default(input$default, null, str3, new C9363a(emitter), 1, null);
            }
            AbstractC9344XC.this.currentDialog = input$default;
            input$default.show();
            Unit unit = Unit.INSTANCE;
            boolean z = this.f42835p;
            boolean z2 = this.f42836q;
            AbstractC9344XC abstractC9344XC = AbstractC9344XC.this;
            if (!z) {
                try {
                    editText = DialogInputExtKt.getInputField(input$default);
                } catch (Exception unused) {
                    editText = null;
                }
                if (editText != null) {
                    editText.setInputType(editText.getInputType() | DateUtils.FORMAT_NUMERIC_DATE);
                    editText.setGravity(80);
                }
            }
            emitter.mo4878a(new InterfaceC23483f() { // from class: eD
                @Override // io.reactivex.functions.InterfaceC23483f
                public final void cancel() {
                    AbstractC9344XC.C9362g.m77199c(MaterialDialog.this);
                }
            });
            input$default.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fD
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AbstractC9344XC.C9362g.m77198d(InterfaceC23444H.this, dialogInterface);
                }
            });
            if (z2) {
                abstractC9344XC.getActivity().getWindow().getDecorView().performHapticFeedback(1, 2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/r;", "", "emitter", "", "invoke", "(Lio/reactivex/r;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: XC$h */
    /* loaded from: classes2.dex */
    public static final class C9365h extends Lambda implements Function1<InterfaceC24516r<String>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ CharSequence f42840h;

        /* renamed from: i */
        public final /* synthetic */ List<String> f42841i;

        /* renamed from: j */
        public final /* synthetic */ boolean f42842j;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "", "which", "", Entry.TYPE_TEXT, "", C17296a.f69688o, "(Lcom/afollestad/materialdialogs/MaterialDialog;ILjava/lang/CharSequence;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: XC$h$a */
        /* loaded from: classes2.dex */
        public static final class C9366a extends Lambda implements Function3<MaterialDialog, Integer, CharSequence, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC24516r<String> f42843g;

            /* renamed from: h */
            public final /* synthetic */ AbstractC9344XC f42844h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9366a(InterfaceC24516r<String> interfaceC24516r, AbstractC9344XC abstractC9344XC) {
                super(3);
                this.f42843g = interfaceC24516r;
                this.f42844h = abstractC9344XC;
            }

            /* renamed from: a */
            public final void m77192a(MaterialDialog dialog, int i, CharSequence text) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                Intrinsics.checkNotNullParameter(text, "text");
                this.f42843g.onSuccess(text.toString());
                MaterialDialog currentDialog = this.f42844h.getCurrentDialog();
                if (currentDialog != null) {
                    currentDialog.setOnDismissListener(null);
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog, Integer num, CharSequence charSequence) {
                m77192a(materialDialog, num.intValue(), charSequence);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9365h(CharSequence charSequence, List<String> list, boolean z) {
            super(1);
            this.f42840h = charSequence;
            this.f42841i = list;
            this.f42842j = z;
        }

        /* renamed from: c */
        public static final void m77194c(Ref.ObjectRef dialog) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            ((MaterialDialog) dialog.element).setOnDismissListener(null);
            ((MaterialDialog) dialog.element).dismiss();
        }

        /* renamed from: d */
        public static final void m77193d(InterfaceC24516r emitter, Ref.ObjectRef dialog, DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            emitter.onComplete();
            ((MaterialDialog) dialog.element).setOnDismissListener(null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24516r<String> interfaceC24516r) {
            invoke2(interfaceC24516r);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [T, com.afollestad.materialdialogs.MaterialDialog] */
        /* JADX WARN: Type inference failed for: r3v8, types: [T, com.afollestad.materialdialogs.MaterialDialog] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC24516r<String> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            if (AbstractC9344XC.this.getActivity().isFinishing()) {
                emitter.onComplete();
                return;
            }
            AbstractC9344XC.this.dismissDialog();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? materialDialog = new MaterialDialog(AbstractC9344XC.this.getActivity(), null, 2, null);
            objectRef.element = materialDialog;
            CharSequence charSequence = this.f42840h;
            if (charSequence != null) {
                objectRef.element = MaterialDialog.message$default(materialDialog, null, charSequence, null, 5, null);
            }
            DialogSingleChoiceExtKt.listItemsSingleChoice$default((MaterialDialog) objectRef.element, null, this.f42841i, null, 0, false, new C9366a(emitter, AbstractC9344XC.this), 29, null);
            AbstractC9344XC.this.currentDialog = (MaterialDialog) objectRef.element;
            ((MaterialDialog) objectRef.element).show();
            Unit unit = Unit.INSTANCE;
            boolean z = this.f42842j;
            AbstractC9344XC abstractC9344XC = AbstractC9344XC.this;
            emitter.mo13821a(new InterfaceC23483f() { // from class: gD
                @Override // io.reactivex.functions.InterfaceC23483f
                public final void cancel() {
                    AbstractC9344XC.C9365h.m77194c(Ref.ObjectRef.this);
                }
            });
            ((MaterialDialog) objectRef.element).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hD
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AbstractC9344XC.C9365h.m77193d(InterfaceC24516r.this, objectRef, dialogInterface);
                }
            });
            if (z) {
                abstractC9344XC.getActivity().getWindow().getDecorView().performHapticFeedback(1, 2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$i */
    /* loaded from: classes2.dex */
    public static final class C9367i extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f42845g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9367i(Function0<Unit> function0) {
            super(0);
            this.f42845g = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function0<Unit> function0 = this.f42845g;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$j */
    /* loaded from: classes2.dex */
    public static final class C9368j extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f42846g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9368j(Function0<Unit> function0) {
            super(0);
            this.f42846g = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function0<Unit> function0 = this.f42846g;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$k */
    /* loaded from: classes2.dex */
    public static final class C9369k extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f42847g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9369k(Function0<Unit> function0) {
            super(0);
            this.f42847g = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function0<Unit> function0 = this.f42847g;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$l */
    /* loaded from: classes2.dex */
    public static final class C9370l extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ AbstractC5751Ny f42849h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9370l(AbstractC5751Ny abstractC5751Ny) {
            super(0);
            this.f42849h = abstractC5751Ny;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AbstractC9344XC.this.currentBirdDialog = this.f42849h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$m */
    /* loaded from: classes2.dex */
    public static final class C9371m extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f42850g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9371m(Function0<Unit> function0) {
            super(1);
            this.f42850g = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> function0 = this.f42850g;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$n */
    /* loaded from: classes2.dex */
    public static final class C9372n extends Lambda implements Function1<View, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f42851g;

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<MaterialDialog> f42852h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC9344XC f42853i;

        /* renamed from: j */
        public final /* synthetic */ Function0<Unit> f42854j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9372n(boolean z, Ref.ObjectRef<MaterialDialog> objectRef, AbstractC9344XC abstractC9344XC, Function0<Unit> function0) {
            super(1);
            this.f42851g = z;
            this.f42852h = objectRef;
            this.f42853i = abstractC9344XC;
            this.f42854j = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            if (this.f42851g && Intrinsics.areEqual(this.f42852h.element, this.f42853i.getCurrentDialog())) {
                this.f42853i.dismissDialog();
            }
            Function0<Unit> function0 = this.f42854j;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$o */
    /* loaded from: classes2.dex */
    public static final class C9373o extends Lambda implements Function1<View, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f42855g;

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<MaterialDialog> f42856h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC9344XC f42857i;

        /* renamed from: j */
        public final /* synthetic */ Function0<Unit> f42858j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9373o(boolean z, Ref.ObjectRef<MaterialDialog> objectRef, AbstractC9344XC abstractC9344XC, Function0<Unit> function0) {
            super(1);
            this.f42855g = z;
            this.f42856h = objectRef;
            this.f42857i = abstractC9344XC;
            this.f42858j = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            if (this.f42855g && Intrinsics.areEqual(this.f42856h.element, this.f42857i.getCurrentDialog())) {
                this.f42857i.dismissDialog();
            }
            Function0<Unit> function0 = this.f42858j;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$p */
    /* loaded from: classes2.dex */
    public static final class C9374p extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f42859g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9374p(Function0<Unit> function0) {
            super(1);
            this.f42859g = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> function0 = this.f42859g;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$q */
    /* loaded from: classes2.dex */
    public static final class C9375q extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f42860g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9375q(Function0<Unit> function0) {
            super(1);
            this.f42860g = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> function0 = this.f42860g;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$r */
    /* loaded from: classes2.dex */
    public static final class C9376r extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Function0<AbstractC23461c> f42862h;

        /* renamed from: i */
        public final /* synthetic */ C24554b f42863i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9376r(Function0<? extends AbstractC23461c> function0, C24554b c24554b) {
            super(1);
            this.f42862h = function0;
            this.f42863i = c24554b;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC9344XC.this.invoke(this.f42862h, this.f42863i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$s */
    /* loaded from: classes2.dex */
    public static final class C9377s extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Function0<AbstractC23461c> f42865h;

        /* renamed from: i */
        public final /* synthetic */ C24554b f42866i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9377s(Function0<? extends AbstractC23461c> function0, C24554b c24554b) {
            super(1);
            this.f42865h = function0;
            this.f42866i = c24554b;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC9344XC.this.invoke(this.f42865h, this.f42866i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XC$t */
    /* loaded from: classes2.dex */
    public static final class C9378t extends Lambda implements Function0<Integer> {
        public C9378t() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            TypedValue typedValue = new TypedValue();
            return Integer.valueOf(AbstractC9344XC.this.getActivity().getTheme().resolveAttribute(16843499, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, AbstractC9344XC.this.getActivity().getResources().getDisplayMetrics()) : 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/os/Vibrator;", "b", "()Landroid/os/Vibrator;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: XC$u */
    /* loaded from: classes2.dex */
    public static final class C9379u extends Lambda implements Function0<Vibrator> {
        public C9379u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Vibrator invoke() {
            Object systemService = AbstractC9344XC.this.getActivity().getSystemService("vibrator");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
    }

    public AbstractC9344XC() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C9355d());
        this.contentView$delegate = lazy;
        this.handler = new Handler(Looper.getMainLooper());
        lazy2 = LazyKt__LazyJVMKt.lazy(new C9378t());
        this.toolbarHeight$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C9379u());
        this.vibrator$delegate = lazy3;
        this.snackDuration = (int) TimeUnit.SECONDS.toMillis(5L);
    }

    private final int getToolbarHeight() {
        return ((Number) this.toolbarHeight$delegate.getValue()).intValue();
    }

    private final Vibrator getVibrator() {
        return (Vibrator) this.vibrator$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invoke(Function0<? extends AbstractC23461c> function0, C24554b c24554b) {
        AbstractC23461c abstractC23461c;
        if (function0 != null) {
            abstractC23461c = function0.invoke();
        } else {
            abstractC23461c = null;
        }
        if (abstractC23461c != null) {
            abstractC23461c.m33040o();
        }
        c24554b.onComplete();
        if (abstractC23461c == null) {
            c24554b.onComplete();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final Snackbar persistentError(String str) {
        if (str != null) {
            Snackbar error = snackBuilder(str).setDuration(-2).error();
            error.mo48864Y();
            return error;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCustomDialog$lambda$29$lambda$28(Function0 function0, DialogInterface dialogInterface) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final AbstractC23461c showDialogCompletable(CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, boolean z, boolean z2, Function0<? extends AbstractC23461c> function0, Function0<? extends AbstractC23461c> function02, final Function0<? extends AbstractC23461c> function03) {
        String m14550k;
        String m14550k2;
        final C24554b m31910m0 = C24554b.m31910m0();
        Intrinsics.checkNotNullExpressionValue(m31910m0, "create()");
        if (!getActivity().isFinishing()) {
            if (z) {
                dismissDialog();
            }
            MaterialDialog cancelable = MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(getActivity(), null, 2, null), null, charSequence.toString(), 1, null), null, charSequence2, null, 5, null).cancelable(z);
            m14550k = C28237sD.m14550k(num, getActivity());
            if (m14550k != null) {
                cancelable = MaterialDialog.positiveButton$default(cancelable, null, m14550k, new C9376r(function0, m31910m0), 1, null);
            }
            MaterialDialog materialDialog = cancelable;
            m14550k2 = C28237sD.m14550k(num2, getActivity());
            if (m14550k2 != null) {
                materialDialog = MaterialDialog.negativeButton$default(materialDialog, null, m14550k2, new C9377s(function02, m31910m0), 1, null);
            }
            this.currentDialog = materialDialog;
            materialDialog.show();
            Unit unit = Unit.INSTANCE;
            materialDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: UC
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AbstractC9344XC.showDialogCompletable$lambda$25$lambda$24(AbstractC9344XC.this, function03, m31910m0, dialogInterface);
                }
            });
            if (z2) {
                getActivity().getWindow().getDecorView().performHapticFeedback(1, 2);
                return m31910m0;
            }
            return m31910m0;
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n      Completable.complete()\n    }");
        return m33039p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialogCompletable$lambda$25$lambda$24(AbstractC9344XC this$0, Function0 function0, C24554b responseCompletable, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(responseCompletable, "$responseCompletable");
        this$0.invoke(function0, responseCompletable);
    }

    private final Snacky.Builder snackBuilder(String str) {
        return Snacky.builder().setView(getContentView()).setText(str).setDuration(this.snackDuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startProgress$lambda$10(AbstractC9344XC this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.progressCount++;
        S74.C7343a.showProgress$default(this$0, true, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopProgress$lambda$11(AbstractC9344XC this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int max = Math.max(this$0.progressCount - 1, 0);
        this$0.progressCount = max;
        if (max == 0) {
            this$0.showProgress(false, i);
        }
    }

    public AbstractC23442F<DialogResponse> agreementDialog(CharSequence title, CharSequence message, List<String> agreements, Integer num, Integer num2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        return C45832nh5.m23305k(new C9346b(z, title, agreements, message, num, num2, z2));
    }

    @Override // p000.H31
    public AbstractC23442F<DialogResponse> birdDialog(AbstractC5751Ny alert, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        return C45832nh5.m23305k(new C9350c(z, z2, alert));
    }

    @Override // p000.InterfaceC41921h56
    public void customToast(int i, Integer num, Integer num2, Integer num3, String str, EnumC40735f56 duration) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(duration, "duration");
        TextView textView = null;
        View inflate = LayoutInflater.from(getActivity()).inflate(i, (ViewGroup) null);
        if (num != null) {
            imageView = (ImageView) inflate.findViewById(num.intValue());
        } else {
            imageView = null;
        }
        if (num2 != null) {
            textView = (TextView) inflate.findViewById(num2.intValue());
        }
        if (imageView != null && num3 != null) {
            imageView.setImageResource(num3.intValue());
        }
        if (textView != null && str != null) {
            textView.setText(str);
        }
        Toast toast = new Toast(getActivity());
        toast.setDuration(duration.m42099c());
        toast.setView(inflate);
        toast.setGravity(48, 0, getToolbarHeight() + getActivity().getResources().getDimensionPixelOffset(C37044Xf4.top_toast_margin));
        toast.show();
    }

    @Override // p000.H31
    public AbstractC23442F<DialogResponse> dialog(AbstractC5751Ny alert, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        return C45832nh5.m23305k(new C9356e(z, alert, z2));
    }

    public boolean dialogShown() {
        MaterialDialog materialDialog = this.currentDialog;
        if (materialDialog != null && materialDialog.isShowing()) {
            return true;
        }
        DialogInterface dialogInterface = this.dialog;
        MaterialDialog materialDialog2 = dialogInterface instanceof MaterialDialog ? (MaterialDialog) dialogInterface : null;
        return materialDialog2 != null && materialDialog2.isShowing();
    }

    @Override // p000.H31
    public AbstractC23442F<H31.AbstractC3016b> dialogWithInput(String title, String str, String hint, String prefill, Integer num, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(prefill, "prefill");
        return C45832nh5.m23305k(new C9362g(num, title, hint, prefill, z, str, str2, str3, z3, z2));
    }

    public void dismissDialog() {
        if (!getActivity().isFinishing()) {
            DialogInterface dialogInterface = this.dialog;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            MaterialDialog materialDialog = this.currentDialog;
            if (materialDialog != null) {
                materialDialog.dismiss();
            }
            this.currentBirdDialog = null;
        }
    }

    @Override // p000.H31
    public boolean dismissIfCurrentDialogIsInstanceOf(KClass<? extends AbstractC5751Ny>... dialogClasses) {
        KClass kClass;
        boolean contains;
        Intrinsics.checkNotNullParameter(dialogClasses, "dialogClasses");
        AbstractC5751Ny abstractC5751Ny = this.currentBirdDialog;
        C41318g46.m40163a("(unlock) dismissIfCurrentDialogIsInstanceOf " + abstractC5751Ny + " is in " + dialogClasses, new Object[0]);
        AbstractC5751Ny abstractC5751Ny2 = this.currentBirdDialog;
        if (abstractC5751Ny2 != null) {
            kClass = Reflection.getOrCreateKotlinClass(abstractC5751Ny2.getClass());
        } else {
            kClass = null;
        }
        contains = ArraysKt___ArraysKt.contains(dialogClasses, kClass);
        if (contains) {
            C41318g46.m40163a("(unlock) dismissed dialog in dismissIfCurrentDialogIsInstanceOf", new Object[0]);
            dismissDialog();
        }
        return contains;
    }

    @Override // p000.InterfaceC37910aM5
    public void error(String str) {
        if (str != null) {
            snackBuilder(str).error().mo48864Y();
        }
    }

    @Override // p000.InterfaceC37910aM5
    public void errorGeneric() {
        String string = getActivity().getString(C45871nl4.error_generic_body);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.string.error_generic_body)");
        snackBuilder(string).error().mo48864Y();
    }

    public abstract AppCompatActivity getActivity();

    public final int getColor(int i) {
        return NA0.m94301c(getActivity().getApplicationContext(), i);
    }

    public View getContentView() {
        return (View) this.contentView$delegate.getValue();
    }

    public final AbstractC5751Ny getCurrentBirdDialog() {
        return this.currentBirdDialog;
    }

    public final MaterialDialog getCurrentDialog() {
        return this.currentDialog;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final String getString(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string = getActivity().getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(resId, *formatArgs)");
        return string;
    }

    public void hideKeyboard(IBinder iBinder) {
        if (iBinder != null) {
            Object systemService = getActivity().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(iBinder, 0);
        }
    }

    @Override // p000.H31
    public AbstractC24507p<String> selectorDialog(List<String> selections, boolean z, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(selections, "selections");
        return C45832nh5.m23309g(new C9365h(charSequence, selections, z));
    }

    @Override // p000.H31
    public void showBirdDialog(AbstractC5751Ny alert, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(alert, "alert");
        CharSequence message = alert.message(getActivity());
        if (str != null) {
            message = message + "\n\n" + str;
            Intrinsics.checkNotNullExpressionValue(message, "{\n      // The secondary…        .toString()\n    }");
        }
        CharSequence charSequence = message;
        int i = C33804Jj4.dialog_bird_general;
        Integer valueOf = Integer.valueOf(C37287Yg4.title);
        Integer valueOf2 = Integer.valueOf(C37287Yg4.message);
        CharSequence title = alert.title(getActivity());
        int i2 = C37287Yg4.confirmButton;
        Integer valueOf3 = Integer.valueOf(C37287Yg4.secondaryButton);
        Integer mo3215a = alert.mo3215a();
        if (mo3215a != null) {
            str2 = getActivity().getString(mo3215a.intValue());
        } else {
            str2 = null;
        }
        Integer negativeText = alert.getNegativeText();
        if (negativeText != null) {
            str3 = getActivity().getString(negativeText.intValue());
        } else {
            str3 = null;
        }
        showCustomDialog(i, (Integer) null, (Integer) null, false, z, z2, valueOf, valueOf2, title, charSequence, i2, valueOf3, str2, str3, (Function0<Unit>) new C9367i(function0), (Function0<Unit>) new C9368j(function02), (Function0<Unit>) new C9369k(function03), (Function0<Unit>) new C9370l(alert), true);
    }

    @Override // p000.H31
    public AbstractC23442F<DialogResponse> showBottomSheetAlert(AbstractC5751Ny alert, Integer num) {
        int i;
        Intrinsics.checkNotNullParameter(alert, "alert");
        if (getActivity().isFinishing()) {
            AbstractC23442F<DialogResponse> m33158H = AbstractC23442F.m33158H(DialogResponse.DISMISS);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(DialogResponse.DISMISS)");
            return m33158H;
        }
        dismissDialog();
        C30619yZ.C30622b c30622b = C30619yZ.f119735f;
        if (num != null) {
            i = num.intValue();
        } else {
            i = C33804Jj4.bottom_sheet_alert;
        }
        C30619yZ m3262a = c30622b.m3262a(alert, i);
        m3262a.show(getActivity().getSupportFragmentManager(), "BottomSheetAlertDialog");
        this.dialog = m3262a.getDialog();
        return m3262a.m3266N6();
    }

    @Override // p000.H31
    public void showCustomDialog(int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3, Integer num3, Integer num4, CharSequence charSequence, CharSequence charSequence2, int i2, Integer num5, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, boolean z4) {
        View inflate = LayoutInflater.from(getActivity()).inflate(i, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(activity).inflate(customLayout, null)");
        showCustomDialog(inflate, num, num2, z, z2, z3, num3, num4, charSequence, charSequence2, i2, num5, str, str2, function0, function02, function03, function04, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // p000.H31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showDialog(CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, final Function0<Unit> function03) {
        boolean z3;
        String m14550k;
        String m14550k2;
        boolean isBlank;
        boolean isBlank2;
        if (getActivity().isFinishing()) {
            return;
        }
        if (z) {
            dismissDialog();
        }
        MaterialDialog cancelable = new MaterialDialog(getActivity(), null, 2, null).cancelable(z);
        boolean z4 = false;
        if (charSequence != null) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank2) {
                z3 = true;
                if (z3) {
                    MaterialDialog.title$default(cancelable, null, charSequence.toString(), 1, null);
                }
                if (charSequence2 != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(charSequence2);
                    if (!isBlank) {
                        z4 = true;
                    }
                }
                if (z4) {
                    MaterialDialog.message$default(cancelable, null, charSequence2, null, 5, null);
                }
                m14550k = C28237sD.m14550k(num, getActivity());
                if (m14550k != null) {
                    cancelable = MaterialDialog.positiveButton$default(cancelable, null, m14550k, new C9374p(function0), 1, null);
                }
                MaterialDialog materialDialog = cancelable;
                m14550k2 = C28237sD.m14550k(num2, getActivity());
                if (m14550k2 != null) {
                    materialDialog = MaterialDialog.negativeButton$default(materialDialog, null, m14550k2, new C9375q(function02), 1, null);
                }
                this.currentDialog = materialDialog;
                materialDialog.show();
                Unit unit = Unit.INSTANCE;
                if (function03 != null) {
                    materialDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: VC
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            Function0.this.invoke();
                        }
                    });
                }
                if (z2) {
                    return;
                }
                getActivity().getWindow().getDecorView().performHapticFeedback(1, 2);
                return;
            }
        }
        z3 = false;
        if (z3) {
        }
        if (charSequence2 != null) {
        }
        if (z4) {
        }
        m14550k = C28237sD.m14550k(num, getActivity());
        if (m14550k != null) {
        }
        MaterialDialog materialDialog2 = cancelable;
        m14550k2 = C28237sD.m14550k(num2, getActivity());
        if (m14550k2 != null) {
        }
        this.currentDialog = materialDialog2;
        materialDialog2.show();
        Unit unit2 = Unit.INSTANCE;
        if (function03 != null) {
        }
        if (z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // p000.H31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showIndeterminateDialog(AbstractC46028o12 alert) {
        View view;
        MaterialDialog materialDialog;
        Intrinsics.checkNotNullParameter(alert, "alert");
        dismissDialog();
        if (!getActivity().isFinishing()) {
            TextView textView = null;
            MaterialDialog cancelable = DialogCustomViewExtKt.customView$default(new MaterialDialog(getActivity(), null, 2, null), Integer.valueOf(C45268mk4.dialog_indeterminate), null, false, false, false, false, 58, null).noAutoDismiss().cancelable(false);
            this.currentDialog = cancelable;
            C41318g46.m40163a("showing indeterminate alert dialog for lock probably", new Object[0]);
            cancelable.show();
            try {
                materialDialog = this.currentDialog;
            } catch (Exception unused) {
            }
            if (materialDialog != null) {
                view = DialogCustomViewExtKt.getCustomView(materialDialog);
                if (view != null) {
                    textView = (TextView) C49520tu6.m11238m(view, C52955zi4.title);
                }
                if (textView == null) {
                    textView.setText(alert.mo21979a(getActivity()).toString());
                    return;
                }
                return;
            }
            view = null;
            if (view != null) {
            }
            if (textView == null) {
            }
        }
    }

    public void showKeyboard(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object systemService = getActivity().getApplicationContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        view.requestFocus();
        ((InputMethodManager) systemService).showSoftInput(view, 0);
    }

    public void showProgress(boolean z, int i) {
        try {
            C49520tu6.m11232s(C40788fB0.m41779c(getActivity(), C37287Yg4.progressBar), z, i);
        } catch (Exception unused) {
            C41318g46.m40160d("Implemented ProgressUi, but did not provide R.id.progressBar of type ProgressBar", new Object[0]);
        }
    }

    @Override // p000.H31
    public void showRetrofitExceptionDialog(Throwable e, Function2<? super String, ? super String, Unit> function2, Function0<Unit> function0) {
        String m11932c;
        String str;
        Intrinsics.checkNotNullParameter(e, "e");
        if (e instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) e;
            C49375tg1 c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class);
            String str2 = "";
            if (function2 != null) {
                function2.invoke(retrofitException.m53928b().name(), (c49375tg1 == null || (r5 = c49375tg1.m11932c()) == null) ? "" : "");
            }
            if (retrofitException.m53928b() == RetrofitException.EnumC16708a.NETWORK) {
                str2 = getActivity().getString(C45871nl4.error_network);
            } else if (c49375tg1 != null && (m11932c = c49375tg1.m11932c()) != null) {
                str = m11932c;
                Intrinsics.checkNotNullExpressionValue(str, "if (e.kind == RetrofitEx…or?.message ?: \"\"\n      }");
                if (c49375tg1 != null || (r0 = c49375tg1.m11931d()) == null) {
                    String string = getActivity().getString(C45871nl4.something_went_wrong_dialog_title);
                    Intrinsics.checkNotNullExpressionValue(string, "activity.getString(co.bi…_went_wrong_dialog_title)");
                }
                H31.C3014a.showDialog$default(this, string, str, 17039360, null, false, false, null, null, null, 504, null);
                return;
            }
            str = str2;
            Intrinsics.checkNotNullExpressionValue(str, "if (e.kind == RetrofitEx…or?.message ?: \"\"\n      }");
            if (c49375tg1 != null) {
            }
            String string2 = getActivity().getString(C45871nl4.something_went_wrong_dialog_title);
            Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(co.bi…_went_wrong_dialog_title)");
            H31.C3014a.showDialog$default(this, string2, str, 17039360, null, false, false, null, null, null, 504, null);
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        if (function2 != null) {
            String simpleName = e.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "e.javaClass.simpleName");
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            function2.invoke(simpleName, message);
        }
    }

    public void showSuccessMessage(BirdAction action) {
        boolean z;
        Intrinsics.checkNotNullParameter(action, "action");
        String string = getActivity().getString(C19999eH.m43060a(action));
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(action.successText())");
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            success(string);
        }
    }

    @Override // p000.InterfaceC37910aM5
    public void snackToast(String str) {
        if (str != null) {
            snackBuilder(str).build().mo48864Y();
        }
    }

    @Override // p000.S74
    public void startProgress() {
        this.handler.post(new Runnable() { // from class: TC
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC9344XC.startProgress$lambda$10(AbstractC9344XC.this);
            }
        });
    }

    @Override // p000.S74
    public void stopProgress(final int i) {
        this.handler.post(new Runnable() { // from class: SC
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC9344XC.stopProgress$lambda$11(AbstractC9344XC.this, i);
            }
        });
    }

    @Override // p000.InterfaceC37910aM5
    public void success(String str) {
        if (str != null) {
            snackBuilder(str).success().mo48864Y();
        }
    }

    @Override // p000.InterfaceC41921h56
    public void topToast(CharSequence message, EnumC40735f56 duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(duration, "duration");
        View inflate = LayoutInflater.from(getActivity()).inflate(C45268mk4.toast_top, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setText(message);
        Toast makeText = Toast.makeText(getActivity(), (CharSequence) null, duration.m42099c());
        makeText.setView(textView);
        makeText.setGravity(48, 0, getToolbarHeight() + getActivity().getResources().getDimensionPixelOffset(C37044Xf4.top_toast_margin));
        makeText.show();
    }

    @Override // p000.InterfaceC34319Lo6
    @SuppressLint({"MissingPermission"})
    public void vibrate(long j) {
        VibrationEffect createOneShot;
        if (Build.VERSION.SDK_INT >= 26) {
            createOneShot = VibrationEffect.createOneShot(j, -1);
            getVibrator().vibrate(createOneShot);
            return;
        }
        getVibrator().vibrate(j);
    }

    @Override // p000.InterfaceC37910aM5
    public void warn(String str) {
        if (str != null) {
            snackBuilder(str).warning().mo48864Y();
        }
    }

    @Override // p000.H31
    public AbstractC23442F<DialogResponse> agreementDialog(AbstractC20244f9 alert, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        return agreementDialog(alert.title(getActivity()), alert.message(getActivity()), alert.mo11822b(getActivity()), alert.mo3215a(), alert.getNegativeText(), z, z2);
    }

    @Override // p000.H31
    public AbstractC23442F<DialogResponse> dialog(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Integer num6, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, boolean z3, Function1<? super View, Unit> viewSetup) {
        Intrinsics.checkNotNullParameter(viewSetup, "viewSetup");
        return C45832nh5.m23305k(new C9359f(i, z3, z, num4, charSequence, num3, num6, num5, charSequence2, num, num2, viewSetup, z2, str, str2));
    }

    @Override // p000.InterfaceC37910aM5
    public void error(Throwable error) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(error, "error");
        Resources resources = getActivity().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "activity.resources");
        String m11932c = C28237sD.m14549l(error, resources).m11932c();
        isBlank = StringsKt__StringsJVMKt.isBlank(m11932c);
        if (!(!isBlank)) {
            m11932c = null;
        }
        if (m11932c == null) {
            m11932c = getActivity().getResources().getString(C45871nl4.error_generic_body);
            Intrinsics.checkNotNullExpressionValue(m11932c, "activity.resources.getSt…tring.error_generic_body)");
        }
        snackBuilder(m11932c).error().mo48864Y();
    }

    @Override // p000.InterfaceC37910aM5
    public void snackToast(int i) {
        snackToast(getActivity().getString(i));
    }

    @Override // p000.InterfaceC37910aM5
    public void success(int i) {
        success(getActivity().getString(i));
    }

    @Override // p000.InterfaceC37910aM5
    public void warn(int i) {
        warn(getActivity().getString(i));
    }

    public void hideKeyboard(EditText editor) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        IBinder windowToken = editor.getWindowToken();
        if (windowToken != null) {
            Object systemService = getActivity().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
        }
    }

    public Snackbar persistentError(int i) {
        return persistentError(getActivity().getString(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
        if (r7 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v30, types: [T, com.afollestad.materialdialogs.MaterialDialog] */
    @Override // p000.H31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showCustomDialog(View customView, Integer num, Integer num2, boolean z, boolean z2, boolean z3, Integer num3, Integer num4, CharSequence charSequence, CharSequence charSequence2, int i, Integer num5, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, final Function0<Unit> function03, Function0<Unit> function04, boolean z4) {
        int i2;
        View view;
        Button button;
        Button button2;
        boolean isBlank;
        Unit unit;
        MaterialDialog materialDialog;
        Window window;
        Intrinsics.checkNotNullParameter(customView, "customView");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        boolean z5 = true;
        if (getActivity().isFinishing()) {
            i2 = 2;
        } else {
            dismissDialog();
            ?? onShow = DialogCallbackExtKt.onShow(DialogCustomViewExtKt.customView$default(new MaterialDialog(getActivity(), null, 2, null), null, customView, false, false, false, false, 57, null).cancelable(z2), new C9371m(function04));
            objectRef.element = onShow;
            this.currentDialog = onShow;
            onShow.show();
            Unit unit2 = Unit.INSTANCE;
            if (z && (window = ((MaterialDialog) objectRef.element).getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((MaterialDialog) objectRef.element).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: WC
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AbstractC9344XC.showCustomDialog$lambda$29$lambda$28(Function0.this, dialogInterface);
                }
            });
            if (z3) {
                i2 = 2;
                getActivity().getWindow().getDecorView().performHapticFeedback(1, 2);
            } else {
                i2 = 2;
            }
        }
        try {
            materialDialog = this.currentDialog;
        } catch (Exception unused) {
        }
        if (materialDialog != null) {
            view = DialogCustomViewExtKt.getCustomView(materialDialog);
            if (num != null) {
                ImageView imageView = view != null ? (ImageView) C49520tu6.m11238m(view, num.intValue()) : null;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    if (imageView != null) {
                        imageView.setImageResource(intValue);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                }
                if (imageView != null) {
                    C49520tu6.m11239l(imageView);
                    Unit unit3 = Unit.INSTANCE;
                }
            }
            if (num3 != null) {
                TextView textView = view != null ? (TextView) C49520tu6.m11238m(view, num3.intValue()) : null;
                if (textView != null) {
                    button = null;
                    C49520tu6.setTextAndVisibility$default(textView, charSequence, 0, i2, null);
                    if (num4 != null) {
                        num4.intValue();
                        TextView textView2 = view != null ? (TextView) C49520tu6.m11238m(view, num4.intValue()) : button;
                        if (textView2 != null) {
                            C49520tu6.setTextAndVisibility$default(textView2, charSequence2, 0, i2, button);
                        }
                    }
                    button2 = view != null ? (Button) C49520tu6.m11238m(view, i) : button;
                    if (button2 != null) {
                        C34585Ms2.m94661j(button2, new C9372n(z4, objectRef, this, function0));
                    }
                    if (str != null && button2 != null) {
                        button2.setText(str);
                    }
                    if (num5 != null) {
                        num5.intValue();
                        Button button3 = view != null ? (Button) C49520tu6.m11238m(view, num5.intValue()) : button;
                        if (button3 != null) {
                            if (str2 == null) {
                                CharSequence text = button3.getText();
                                Intrinsics.checkNotNullExpressionValue(text, "secondaryButtonView.text");
                                isBlank = StringsKt__StringsJVMKt.isBlank(text);
                                if (!(!isBlank)) {
                                    z5 = false;
                                }
                            }
                            C49520tu6.show$default(button3, z5, 0, i2, button);
                        }
                        if (button3 != null) {
                            C34585Ms2.m94661j(button3, new C9373o(z4, objectRef, this, function02));
                        }
                        if (str2 == null || button3 == null) {
                            return;
                        }
                        button3.setText(str2);
                        return;
                    }
                    return;
                }
            }
            button = null;
            if (num4 != null) {
            }
            if (view != null) {
            }
            if (button2 != null) {
            }
            if (str != null) {
                button2.setText(str);
            }
            if (num5 != null) {
            }
        }
        view = null;
        if (num != null) {
        }
        if (num3 != null) {
        }
        button = null;
        if (num4 != null) {
        }
        if (view != null) {
        }
        if (button2 != null) {
        }
        if (str != null) {
        }
        if (num5 != null) {
        }
    }

    public void showKeyboard(IBinder iBinder) {
        if (iBinder != null) {
            Object systemService = getActivity().getApplicationContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).toggleSoftInputFromWindow(iBinder, 2, 0);
        }
    }

    @Override // p000.InterfaceC37910aM5
    public void error(int i) {
        error(getActivity().getString(i));
    }

    @Override // p000.InterfaceC39940dl2
    public void hideKeyboard() {
        IBinder windowToken;
        View currentFocus = getActivity().getCurrentFocus();
        if (currentFocus == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(windowToken, "windowToken");
        Object systemService = getActivity().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
    }

    @Override // p000.InterfaceC41921h56
    public final void topToast(int i, EnumC40735f56 duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        String string = getActivity().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(message)");
        topToast(string, duration);
    }

    @Override // p000.H31
    public void showDialog(AbstractC5751Ny alert, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        CharSequence message = alert.message(getActivity());
        if (str != null) {
            message = message + "\n\n" + str;
            Intrinsics.checkNotNullExpressionValue(message, "{\n      // The secondary…        .toString()\n    }");
        }
        showDialog(alert.title(getActivity()), message, alert.mo3215a(), alert.getNegativeText(), z, z2, function0, function02, function03);
    }

    @Override // p000.H31
    public AbstractC23461c showDialogCompletable(AbstractC5751Ny alert, boolean z, boolean z2, Function0<? extends AbstractC23461c> function0, Function0<? extends AbstractC23461c> function02, Function0<? extends AbstractC23461c> function03, String str) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        CharSequence message = alert.message(getActivity());
        if (str != null) {
            message = message + "\n\n" + str;
            Intrinsics.checkNotNullExpressionValue(message, "{\n      // The secondary…        .toString()\n    }");
        }
        return showDialogCompletable(alert.title(getActivity()), message, alert.mo3215a(), alert.getNegativeText(), z, z2, function0, function02, function03);
    }
}
