package p000;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010d\u001a\u00020\f\u0012\u0006\u0010N\u001a\u00020J\u0012\u0006\u0010R\u001a\u00020\u0006¢\u0006\u0004\be\u0010fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0016J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0016J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010\u00142\u0006\u0010&\u001a\u00020\tH\u0016J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\tH\u0016J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010&\u001a\u00020\tH\u0016J\u0010\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\tH\u0016J\u0010\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020\tH\u0016J\u0012\u00105\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u000104H\u0016J\u0012\u00108\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u000106H\u0016J\n\u0010:\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\tH\u0016J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0016J\u0010\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tH\u0016J\u001c\u0010E\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016J\"\u0010I\u001a\u00020\u00062\u0006\u0010G\u001a\u00020F2\u0006\u0010&\u001a\u00020\t2\b\u0010H\u001a\u0004\u0018\u00010CH\u0016R\u0017\u0010N\u001a\u00020J8\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010R\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010SR*\u0010[\u001a\u00020\f2\u0006\u0010U\u001a\u00020\f8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010SR\u0016\u0010]\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010OR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010O¨\u0006g"}, m28432d2 = {"LMs4;", "Landroid/view/inputmethod/InputConnection;", "LN91;", "editCommand", "", C17296a.f69688o, "", "b", "c", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, DateTokenConverter.CONVERTER_KEY, "LF16;", TransferTable.COLUMN_STATE, "Lj32;", "inputMethodManager", "f", "beginBatchEdit", "endBatchEdit", "closeConnection", "", Entry.TYPE_TEXT, "newCursorPosition", "commitText", "start", "end", "setComposingRegion", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "maxChars", "flags", "getTextBeforeCursor", "getTextAfterCursor", "getSelectedText", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "Landroid/os/Handler;", "getHandler", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "reqModes", "getCursorCapsMode", "", "action", "Landroid/os/Bundle;", MessageExtension.FIELD_DATA, "performPrivateCommand", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "Ld32;", "Ld32;", "getEventCallback", "()Ld32;", "eventCallback", "Z", "getAutoCorrect", "()Z", "autoCorrect", "I", "batchDepth", "value", "LF16;", "getMTextFieldValue$ui_release", "()LF16;", "e", "(LF16;)V", "mTextFieldValue", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "g", "Ljava/util/List;", "editCommands", "h", "isActive", "initState", "<init>", "(LF16;Ld32;Z)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,403:1\n80#1,5:404\n80#1,5:409\n80#1,5:414\n80#1,5:419\n80#1,5:424\n80#1,5:429\n80#1,5:434\n80#1,5:439\n80#1,5:444\n80#1,5:449\n80#1,5:454\n80#1,5:459\n80#1,5:464\n80#1,5:469\n80#1,5:474\n80#1,5:479\n80#1,5:484\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n139#1:404,5\n175#1:409,5\n180#1:414,5\n186#1:419,5\n194#1:424,5\n205#1:429,5\n211#1:434,5\n217#1:439,5\n223#1:444,5\n259#1:449,5\n295#1:454,5\n321#1:459,5\n344#1:464,5\n354#1:469,5\n366#1:474,5\n386#1:479,5\n395#1:484,5\n*E\n"})
/* renamed from: Ms4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inputmethod.InputConnectionC34587Ms4 implements InputConnection {

    /* renamed from: a */
    public final InterfaceC39526d32 f23699a;

    /* renamed from: b */
    public final boolean f23700b;

    /* renamed from: c */
    public int f23701c;

    /* renamed from: d */
    public F16 f23702d;

    /* renamed from: e */
    public int f23703e;

    /* renamed from: f */
    public boolean f23704f;

    /* renamed from: g */
    public final List<N91> f23705g;

    /* renamed from: h */
    public boolean f23706h;

    public inputmethod.InputConnectionC34587Ms4(F16 initState, InterfaceC39526d32 eventCallback, boolean z) {
        Intrinsics.checkNotNullParameter(initState, "initState");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.f23699a = eventCallback;
        this.f23700b = z;
        this.f23702d = initState;
        this.f23705g = new ArrayList();
        this.f23706h = true;
    }

    /* renamed from: a */
    public final void m94646a(N91 n91) {
        m94645b();
        try {
            this.f23705g.add(n91);
        } finally {
            m94644c();
        }
    }

    /* renamed from: b */
    public final boolean m94645b() {
        this.f23701c++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.f23706h;
        if (z) {
            return m94645b();
        }
        return z;
    }

    /* renamed from: c */
    public final boolean m94644c() {
        List<? extends N91> mutableList;
        int i = this.f23701c - 1;
        this.f23701c = i;
        if (i == 0 && (!this.f23705g.isEmpty())) {
            InterfaceC39526d32 interfaceC39526d32 = this.f23699a;
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f23705g);
            interfaceC39526d32.mo44655d(mutableList);
            this.f23705g.clear();
        }
        if (this.f23701c > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.f23706h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f23705g.clear();
        this.f23701c = 0;
        this.f23706h = false;
        this.f23699a.mo44656c(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f23706h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inputContentInfo, "inputContentInfo");
        boolean z = this.f23706h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f23706h;
        if (z) {
            return this.f23700b;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f23706h;
        if (z) {
            m94646a(new C46500op0(String.valueOf(charSequence), i));
        }
        return z;
    }

    /* renamed from: d */
    public final void m94643d(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f23706h;
        if (z) {
            m94646a(new YZ0(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f23706h;
        if (z) {
            m94646a(new ZZ0(i, i2));
            return true;
        }
        return z;
    }

    /* renamed from: e */
    public final void m94642e(F16 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23702d = value;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return m94644c();
    }

    /* renamed from: f */
    public final void m94641f(F16 state, InterfaceC43083j32 inputMethodManager) {
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        if (!this.f23706h) {
            return;
        }
        m94642e(state);
        if (this.f23704f) {
            inputMethodManager.mo29393d(this.f23703e, C46641p32.m20014a(state));
        }
        C48413s26 m108104f = state.m108104f();
        int i2 = -1;
        if (m108104f != null) {
            i = C48413s26.m14834l(m108104f.m14828r());
        } else {
            i = -1;
        }
        C48413s26 m108104f2 = state.m108104f();
        if (m108104f2 != null) {
            i2 = C48413s26.m14835k(m108104f2.m14828r());
        }
        inputMethodManager.mo29396a(C48413s26.m14834l(state.m108103g()), C48413s26.m14835k(state.m108103g()), i, i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.f23706h;
        if (z) {
            m94646a(new C47064pm1());
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.f23702d.m108102h(), C48413s26.m14834l(this.f23702d.m108103g()), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.f23704f = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.f23703e = i2;
        }
        return C46641p32.m20014a(this.f23702d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i) {
        if (C48413s26.m14838h(this.f23702d.m108103g())) {
            return null;
        }
        return G16.m105951a(this.f23702d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i, int i2) {
        return G16.m105950b(this.f23702d, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return G16.m105949c(this.f23702d, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.f23706h;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    m94646a(new C38256aw5(0, this.f23702d.m108102h().length()));
                    break;
                case 16908320:
                    m94643d(277);
                    break;
                case 16908321:
                    m94643d(278);
                    break;
                case 16908322:
                    m94643d(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int m107003a;
        boolean z = this.f23706h;
        if (z) {
            if (i != 0) {
                switch (i) {
                    case 2:
                        m107003a = FY1.f9619b.m107001c();
                        break;
                    case 3:
                        m107003a = FY1.f9619b.m106997g();
                        break;
                    case 4:
                        m107003a = FY1.f9619b.m106996h();
                        break;
                    case 5:
                        m107003a = FY1.f9619b.m107000d();
                        break;
                    case 6:
                        m107003a = FY1.f9619b.m107002b();
                        break;
                    case 7:
                        m107003a = FY1.f9619b.m106998f();
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        m107003a = FY1.f9619b.m107003a();
                        break;
                }
            } else {
                m107003a = FY1.f9619b.m107003a();
            }
            this.f23699a.mo44657b(m107003a);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f23706h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        boolean z = this.f23706h;
        if (z) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = this.f23706h;
        if (z) {
            this.f23699a.mo44658a(event);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.f23706h;
        if (z) {
            m94646a(new C35083Ov5(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f23706h;
        if (z) {
            m94646a(new C35317Pv5(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.f23706h;
        if (z) {
            m94646a(new C38256aw5(i, i2));
            return true;
        }
        return z;
    }
}
