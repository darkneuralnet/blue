package p000;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.SearchView;
import androidx.appcompat.app.AbstractC10999c;
import androidx.appcompat.app.AppCompatDelegateImpl;
import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0016J,\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J,\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\"\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\"\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\"\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LWs6;", "Lki;", "Landroid/view/LayoutInflater$Factory2;", "", "w", "Landroid/view/View;", "parent", "", "name", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "l", "onCreateView", "LL12;", "originalRequest", "LM12;", "d0", "c0", "Landroid/webkit/WebView;", "view", "b0", "Landroidx/appcompat/app/c;", "m", "Landroidx/appcompat/app/c;", "baseDelegate", "n", "Landroid/content/Context;", "baseContext", "LYG6;", "o", "LYG6;", "wrapContext", "<init>", "(Landroidx/appcompat/app/c;Landroid/content/Context;LYG6;)V", "viewpump_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Ws6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflater$Factory2C36929Ws6 extends C25217ki implements LayoutInflater.Factory2 {

    /* renamed from: m */
    public final AbstractC10999c f42231m;

    /* renamed from: n */
    public final Context f42232n;

    /* renamed from: o */
    public final YG6 f42233o;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/view/View;", "b", "()Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Ws6$a */
    /* loaded from: classes.dex */
    public static final class C9193a extends Lambda implements Function0<View> {

        /* renamed from: h */
        public final /* synthetic */ String f42235h;

        /* renamed from: i */
        public final /* synthetic */ Context f42236i;

        /* renamed from: j */
        public final /* synthetic */ AttributeSet f42237j;

        /* renamed from: k */
        public final /* synthetic */ View f42238k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9193a(String str, Context context, AttributeSet attributeSet, View view) {
            super(0);
            this.f42235h = str;
            this.f42236i = context;
            this.f42237j = attributeSet;
            this.f42238k = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final View invoke() {
            Object m116783constructorimpl;
            Object m116783constructorimpl2;
            LayoutInflater$Factory2C36929Ws6 layoutInflater$Factory2C36929Ws6 = LayoutInflater$Factory2C36929Ws6.this;
            View view = this.f42238k;
            String str = this.f42235h;
            Context context = this.f42236i;
            AttributeSet attributeSet = this.f42237j;
            try {
                Result.Companion companion = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(LayoutInflater$Factory2C36929Ws6.super.mo28595l(view, str, context, attributeSet));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            LayoutInflater$Factory2C36929Ws6 layoutInflater$Factory2C36929Ws62 = LayoutInflater$Factory2C36929Ws6.this;
            View view2 = this.f42238k;
            String str2 = this.f42235h;
            AttributeSet attributeSet2 = this.f42237j;
            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
                m116783constructorimpl = LayoutInflater$Factory2C36929Ws6.super.mo28595l(view2, str2, layoutInflater$Factory2C36929Ws62.f42232n, attributeSet2);
            }
            View view3 = (View) m116783constructorimpl;
            if (view3 == null) {
                try {
                    m116783constructorimpl2 = Result.m116783constructorimpl(LayoutInflater$Factory2C36929Ws6.this.m77751c0(this.f42236i, this.f42235h, this.f42237j));
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.Companion;
                    m116783constructorimpl2 = Result.m116783constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m116789isFailureimpl(m116783constructorimpl2)) {
                    m116783constructorimpl2 = null;
                }
                view3 = (View) m116783constructorimpl2;
            }
            if (Intrinsics.areEqual(this.f42235h, "WebView")) {
                view3 = new WebView(LayoutInflater$Factory2C36929Ws6.this.f42231m.mo28596i(this.f42236i), this.f42237j);
            }
            if ((view3 instanceof WebView) && !Intrinsics.areEqual(this.f42235h, "WebView")) {
                view3 = LayoutInflater$Factory2C36929Ws6.this.m77752b0((WebView) view3, this.f42236i, this.f42237j);
            }
            if (Intrinsics.areEqual(this.f42235h, "SearchView")) {
                return new SearchView(this.f42236i, this.f42237j);
            }
            return view3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LayoutInflater$Factory2C36929Ws6(AbstractC10999c baseDelegate, Context baseContext, YG6 yg6) {
        super(baseDelegate, yg6);
        Intrinsics.checkNotNullParameter(baseDelegate, "baseDelegate");
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        this.f42231m = baseDelegate;
        this.f42232n = baseContext;
        this.f42233o = yg6;
    }

    /* renamed from: b0 */
    public final View m77752b0(WebView webView, Context context, AttributeSet attributeSet) {
        Object obj;
        Constructor<?> constructor;
        boolean z;
        Constructor<?>[] constructors = webView.getClass().getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "view.javaClass.constructors");
        int length = constructors.length;
        int i = 0;
        while (true) {
            obj = null;
            if (i < length) {
                constructor = constructors[i];
                i++;
                if (constructor.getParameterTypes().length == 2 && Intrinsics.areEqual(constructor.getParameterTypes()[0], Context.class) && Intrinsics.areEqual(constructor.getParameterTypes()[1], AttributeSet.class)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                constructor = null;
                break;
            }
        }
        if (constructor != null) {
            obj = constructor.newInstance(this.f42231m.mo28596i(context), attributeSet);
        }
        return (View) obj;
    }

    /* renamed from: c0 */
    public final View m77751c0(Context context, String str, AttributeSet attributeSet) {
        View createView;
        if (Build.VERSION.SDK_INT >= 29) {
            createView = LayoutInflater.from(context).createView(context, str, null, attributeSet);
            return createView;
        } else if (Intrinsics.areEqual(str, "ViewStub")) {
            return null;
        } else {
            return new C39387cp2(context).m45072b(context, str, attributeSet);
        }
    }

    /* renamed from: d0 */
    public final M12 m77750d0(L12 l12) {
        List<InterfaceC41927h62> m80684a = C36461Us6.f38200a.m80684a();
        if (m80684a == null) {
            m80684a = CollectionsKt__CollectionsKt.emptyList();
        }
        return new C42520i62(m80684a, 0, l12).mo34447a(l12);
    }

    @Override // p000.C25217ki, androidx.appcompat.app.AbstractC10999c
    /* renamed from: l */
    public View mo28595l(View view, String name, Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        return m77750d0(new L12(name, context, attrs, view, new C9193a(name, context, attrs, view))).m96008d();
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String name, Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        return mo28595l(view, name, context, attrs);
    }

    @Override // p000.C25217ki, androidx.appcompat.app.AbstractC10999c
    /* renamed from: w */
    public void mo28589w() {
        LayoutInflater from = LayoutInflater.from(this.f42232n);
        if (from.getFactory() == null) {
            C50029um2.m9787a(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install ViewPump's");
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        return mo28595l(null, name, context, attrs);
    }
}
