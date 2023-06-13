package p000;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Lzw3;", "Landroid/widget/Toast;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zw3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C53094zw3 extends Toast {

    /* renamed from: a */
    public static final C31593a f122502a = new C31593a(null);

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000f"}, m28432d2 = {"Lzw3$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "message", "", "duration", "gravity", "Lzw3$a$a;", "operatorToastStyle", "Lzw3;", C17296a.f69688o, "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: zw3$a */
    /* loaded from: classes4.dex */
    public static final class C31593a {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lzw3$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: zw3$a$a */
        /* loaded from: classes4.dex */
        public enum EnumC31594a {
            WHITE_ON_BLACK,
            BLACK_ON_WHITE
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: zw3$a$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C31595b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC31594a.values().length];
                try {
                    iArr[EnumC31594a.WHITE_ON_BLACK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC31594a.BLACK_ON_WHITE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C31593a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C53094zw3 makeText$default(C31593a c31593a, Context context, String str, int i, int i2, EnumC31594a enumC31594a, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                i2 = 80;
            }
            int i4 = i2;
            if ((i3 & 16) != 0) {
                enumC31594a = EnumC31594a.WHITE_ON_BLACK;
            }
            return c31593a.m100a(context, str, i, i4, enumC31594a);
        }

        /* renamed from: a */
        public final C53094zw3 m100a(Context context, String message, int i, int i2, EnumC31594a operatorToastStyle) {
            int dimensionPixelSize;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(operatorToastStyle, "operatorToastStyle");
            C53094zw3 c53094zw3 = new C53094zw3(context);
            c53094zw3.setDuration(i);
            c53094zw3.setText(message);
            if (Build.VERSION.SDK_INT < 30) {
                View view = c53094zw3.getView();
                if (view != null) {
                    Intrinsics.checkNotNullExpressionValue(view, "view");
                    TextView textView = (TextView) C49520tu6.m11243h(view, 16908299);
                    if (textView != null) {
                        int i3 = C31595b.$EnumSwitchMapping$0[operatorToastStyle.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                textView.setTextColor(NA0.m94301c(context, C32364Df4.birdNewRoad));
                                textView.setBackground(NA0.m94299e(context, C33309Hg4.operator_toast_background_white));
                            }
                        } else {
                            textView.setTextColor(NA0.m94301c(context, C32364Df4.white));
                            textView.setBackground(NA0.m94299e(context, C33309Hg4.operator_toast_background_matte_black));
                        }
                    }
                }
                return c53094zw3;
            }
            if (i2 == 80) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(C37044Xf4.command_center_toast_y_offset_bottom);
            } else {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(C37044Xf4.command_center_toast_y_offset_top);
            }
            c53094zw3.setGravity(i2 | 7, 0, dimensionPixelSize);
            return c53094zw3;
        }

        private C31593a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53094zw3(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 30) {
            setView(C40788fB0.m41762t(context, C45268mk4.toast_operator, null));
        }
    }
}
