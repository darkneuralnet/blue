package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import p000.AbstractC39507d13;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u0010B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m28432d2 = {"Lo4;", "Ld13;", "Lo4$b;", "l", "", "k", "destination", "Landroid/os/Bundle;", "args", "LTY2;", "navOptions", "Ld13$a;", "navigatorExtras", "LHY2;", "m", "Landroid/content/Context;", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/Activity;", DateTokenConverter.CONVERTER_KEY, "Landroid/app/Activity;", "hostActivity", "<init>", "(Landroid/content/Context;)V", "e", C17296a.f69688o, "b", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
@AbstractC39507d13.InterfaceC19661b("activity")
/* renamed from: o4 */
/* loaded from: classes.dex */
public class C26807o4 extends AbstractC39507d13<C26809b> {

    /* renamed from: e */
    public static final C26808a f101298e = new C26808a(null);

    /* renamed from: c */
    public final Context f101299c;

    /* renamed from: d */
    public final Activity f101300d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, m28432d2 = {"Lo4$a;", "", "", "EXTRA_NAV_CURRENT", "Ljava/lang/String;", "EXTRA_NAV_SOURCE", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "<init>", "()V", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: o4$a */
    /* loaded from: classes.dex */
    public static final class C26808a {
        public /* synthetic */ C26808a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26808a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u00178F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m28432d2 = {"Lo4$b;", "LHY2;", "", "E", "", "toString", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "Landroid/content/Intent;", "<set-?>", "m", "Landroid/content/Intent;", "I", "()Landroid/content/Intent;", "intent", "n", "Ljava/lang/String;", "H", "()Ljava/lang/String;", "dataPattern", "Landroid/content/ComponentName;", "component", "Landroid/content/ComponentName;", "G", "()Landroid/content/ComponentName;", "action", "F", "Ld13;", "activityNavigator", "<init>", "(Ld13;)V", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: o4$b */
    /* loaded from: classes.dex */
    public static class C26809b extends HY2 {

        /* renamed from: m */
        public Intent f101301m;

        /* renamed from: n */
        public String f101302n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26809b(AbstractC39507d13<? extends C26809b> activityNavigator) {
            super(activityNavigator);
            Intrinsics.checkNotNullParameter(activityNavigator, "activityNavigator");
        }

        @Override // p000.HY2
        /* renamed from: E */
        public boolean mo21859E() {
            return false;
        }

        /* renamed from: F */
        public final String m21858F() {
            Intent intent = this.f101301m;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        /* renamed from: G */
        public final ComponentName m21857G() {
            Intent intent = this.f101301m;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        /* renamed from: H */
        public final String m21856H() {
            return this.f101302n;
        }

        /* renamed from: I */
        public final Intent m21855I() {
            return this.f101301m;
        }

        @Override // p000.HY2
        public boolean equals(Object obj) {
            boolean z;
            if (obj == null || !(obj instanceof C26809b) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.f101301m;
            if (intent != null) {
                z = intent.filterEquals(((C26809b) obj).f101301m);
            } else if (((C26809b) obj).f101301m == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !Intrinsics.areEqual(this.f101302n, ((C26809b) obj).f101302n)) {
                return false;
            }
            return true;
        }

        @Override // p000.HY2
        public int hashCode() {
            int i;
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f101301m;
            int i2 = 0;
            if (intent != null) {
                i = intent.filterHashCode();
            } else {
                i = 0;
            }
            int i3 = (hashCode + i) * 31;
            String str = this.f101302n;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i3 + i2;
        }

        @Override // p000.HY2
        public String toString() {
            ComponentName m21857G = m21857G();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (m21857G != null) {
                sb.append(" class=");
                sb.append(m21857G.getClassName());
            } else {
                String m21858F = m21858F();
                if (m21858F != null) {
                    sb.append(" action=");
                    sb.append(m21858F);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
            return sb2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, m28432d2 = {"Lo4$c;", "Ld13$a;", "", C17296a.f69688o, "I", "b", "()I", "flags", "LE4;", "LE4;", "()LE4;", "activityOptions", "navigation-runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: o4$c */
    /* loaded from: classes.dex */
    public static final class C26810c implements AbstractC39507d13.InterfaceC19660a {

        /* renamed from: a */
        public final int f101303a;

        /* renamed from: b */
        public final C1727E4 f101304b;

        /* renamed from: a */
        public final C1727E4 m21854a() {
            return this.f101304b;
        }

        /* renamed from: b */
        public final int m21853b() {
            return this.f101303a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/content/Context;", "it", C17296a.f69688o, "(Landroid/content/Context;)Landroid/content/Context;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: o4$d */
    /* loaded from: classes.dex */
    public static final class C26811d extends Lambda implements Function1<Context, Context> {

        /* renamed from: g */
        public static final C26811d f101305g = new C26811d();

        public C26811d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Context invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public C26807o4(Context context) {
        Sequence generateSequence;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f101299c = context;
        generateSequence = SequencesKt__SequencesKt.generateSequence(context, C26811d.f101305g);
        Iterator it = generateSequence.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f101300d = (Activity) obj;
    }

    @Override // p000.AbstractC39507d13
    /* renamed from: k */
    public boolean mo21862k() {
        Activity activity = this.f101300d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC39507d13
    /* renamed from: l */
    public C26809b mo173a() {
        return new C26809b(this);
    }

    @Override // p000.AbstractC39507d13
    /* renamed from: m */
    public HY2 mo21863d(C26809b destination, Bundle bundle, TY2 ty2, AbstractC39507d13.InterfaceC19660a interfaceC19660a) {
        int coerceAtLeast;
        int coerceAtLeast2;
        Intent intent;
        int intExtra;
        boolean z;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.m21855I() != null) {
            Intent intent2 = new Intent(destination.m21855I());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String m21856H = destination.m21856H();
                if (m21856H != null && m21856H.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(m21856H);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + m21856H);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z2 = interfaceC19660a instanceof C26810c;
            if (z2) {
                intent2.addFlags(((C26810c) interfaceC19660a).m21853b());
            }
            if (this.f101300d == null) {
                intent2.addFlags(268435456);
            }
            if (ty2 != null && ty2.m83415g()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f101300d;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.m103774s());
            Resources resources = this.f101299c.getResources();
            if (ty2 != null) {
                int m83419c = ty2.m83419c();
                int m83418d = ty2.m83418d();
                if ((m83419c > 0 && Intrinsics.areEqual(resources.getResourceTypeName(m83419c), "animator")) || (m83418d > 0 && Intrinsics.areEqual(resources.getResourceTypeName(m83418d), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(m83419c) + " and popExit resource " + resources.getResourceName(m83418d) + " when launching " + destination);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", m83419c);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", m83418d);
                }
            }
            if (z2) {
                C1727E4 m21854a = ((C26810c) interfaceC19660a).m21854a();
                if (m21854a != null) {
                    NA0.m94291m(this.f101299c, intent2, m21854a.m109468a());
                } else {
                    this.f101299c.startActivity(intent2);
                }
            } else {
                this.f101299c.startActivity(intent2);
            }
            if (ty2 != null && this.f101300d != null) {
                int m83421a = ty2.m83421a();
                int m83420b = ty2.m83420b();
                if ((m83421a > 0 && Intrinsics.areEqual(resources.getResourceTypeName(m83421a), "animator")) || (m83420b > 0 && Intrinsics.areEqual(resources.getResourceTypeName(m83420b), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(m83421a) + " and exit resource " + resources.getResourceName(m83420b) + "when launching " + destination);
                    return null;
                } else if (m83421a >= 0 || m83420b >= 0) {
                    coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(m83421a, 0);
                    coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(m83420b, 0);
                    this.f101300d.overridePendingTransition(coerceAtLeast, coerceAtLeast2);
                    return null;
                } else {
                    return null;
                }
            }
            return null;
        }
        throw new IllegalStateException(("Destination " + destination.m103774s() + " does not have an Intent set.").toString());
    }
}
