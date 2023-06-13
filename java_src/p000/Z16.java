package p000;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.C11581c;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import p000.C38143al2;
import p000.C39329cl2;
import p000.FY1;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¨\u0006\u0010"}, m28432d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "i", "LGY1;", "imeOptions", "LF16;", "textFieldValue", "h", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "", "bits", "flag", "", "g", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Z16 */
/* loaded from: classes.dex */
public final class Z16 {
    /* renamed from: d */
    public static final Executor m73827d(final Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "<this>");
        return new Executor() { // from class: X16
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Z16.m73826e(choreographer, runnable);
            }
        };
    }

    /* renamed from: e */
    public static final void m73826e(Choreographer this_asExecutor, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this_asExecutor, "$this_asExecutor");
        this_asExecutor.postFrameCallback(new Choreographer.FrameCallback() { // from class: Y16
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Z16.m73825f(runnable, j);
            }
        });
    }

    /* renamed from: f */
    public static final void m73825f(Runnable runnable, long j) {
        runnable.run();
    }

    /* renamed from: g */
    public static final boolean m73824g(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: h */
    public static final void m73823h(EditorInfo editorInfo, GY1 imeOptions, F16 textFieldValue) {
        Intrinsics.checkNotNullParameter(editorInfo, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int m105018d = imeOptions.m105018d();
        FY1.C2347a c2347a = FY1.f9619b;
        int i = 6;
        if (FY1.m107007l(m105018d, c2347a.m107003a())) {
            if (!imeOptions.m105016f()) {
                i = 0;
            }
        } else if (FY1.m107007l(m105018d, c2347a.m106999e())) {
            i = 1;
        } else if (FY1.m107007l(m105018d, c2347a.m107001c())) {
            i = 2;
        } else if (FY1.m107007l(m105018d, c2347a.m107000d())) {
            i = 5;
        } else if (FY1.m107007l(m105018d, c2347a.m106998f())) {
            i = 7;
        } else if (FY1.m107007l(m105018d, c2347a.m106997g())) {
            i = 3;
        } else if (FY1.m107007l(m105018d, c2347a.m106996h())) {
            i = 4;
        } else if (!FY1.m107007l(m105018d, c2347a.m107002b())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int m105017e = imeOptions.m105017e();
        C39329cl2.C13662a c13662a = C39329cl2.f61189b;
        if (C39329cl2.m60919m(m105017e, c13662a.m60908h())) {
            editorInfo.inputType = 1;
        } else if (C39329cl2.m60919m(m105017e, c13662a.m60915a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (C39329cl2.m60919m(m105017e, c13662a.m60912d())) {
            editorInfo.inputType = 2;
        } else if (C39329cl2.m60919m(m105017e, c13662a.m60909g())) {
            editorInfo.inputType = 3;
        } else if (C39329cl2.m60919m(m105017e, c13662a.m60907i())) {
            editorInfo.inputType = 17;
        } else if (C39329cl2.m60919m(m105017e, c13662a.m60913c())) {
            editorInfo.inputType = 33;
        } else if (C39329cl2.m60919m(m105017e, c13662a.m60910f())) {
            editorInfo.inputType = 129;
        } else if (C39329cl2.m60919m(m105017e, c13662a.m60911e())) {
            editorInfo.inputType = 18;
        } else if (C39329cl2.m60919m(m105017e, c13662a.m60914b())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.m105016f() && m73824g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= DateUtils.FORMAT_NUMERIC_DATE;
            if (FY1.m107007l(imeOptions.m105018d(), c2347a.m107003a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (m73824g(editorInfo.inputType, 1)) {
            int m105019c = imeOptions.m105019c();
            C38143al2.C10851a c10851a = C38143al2.f51187a;
            if (C38143al2.m70787f(m105019c, c10851a.m70784a())) {
                editorInfo.inputType |= 4096;
            } else if (C38143al2.m70787f(m105019c, c10851a.m70781d())) {
                editorInfo.inputType |= 8192;
            } else if (C38143al2.m70787f(m105019c, c10851a.m70782c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.m105020b()) {
                editorInfo.inputType |= DateUtils.FORMAT_ABBREV_WEEKDAY;
            }
        }
        editorInfo.initialSelStart = C48413s26.m14832n(textFieldValue.m108103g());
        editorInfo.initialSelEnd = C48413s26.m14837i(textFieldValue.m108103g());
        X91.m77281f(editorInfo, textFieldValue.m108102h());
        editorInfo.imeOptions |= 33554432;
    }

    /* renamed from: i */
    public static final void m73822i(EditorInfo editorInfo) {
        if (!C11581c.m67521k()) {
            return;
        }
        C11581c.m67529c().m67508x(editorInfo);
    }
}
