package p000;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p000.C44930mA0;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: U22 */
/* loaded from: classes.dex */
public final class U22 {

    /* renamed from: U22$a */
    /* loaded from: classes.dex */
    public class C8178a extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8180c f36743a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8178a(InputConnection inputConnection, boolean z, InterfaceC8180c interfaceC8180c) {
            super(inputConnection, z);
            this.f36743a = interfaceC8180c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f36743a.mo82044a(C38322b32.m65054f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: U22$b */
    /* loaded from: classes.dex */
    public class C8179b extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8180c f36744a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8179b(InputConnection inputConnection, boolean z, InterfaceC8180c interfaceC8180c) {
            super(inputConnection, z);
            this.f36744a = interfaceC8180c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (U22.m82046e(str, bundle, this.f36744a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: U22$c */
    /* loaded from: classes.dex */
    public interface InterfaceC8180c {
        /* renamed from: a */
        boolean mo82044a(C38322b32 c38322b32, int i, Bundle bundle);
    }

    /* renamed from: b */
    public static InterfaceC8180c m82049b(final View view) {
        HZ3.m103731g(view);
        return new InterfaceC8180c() { // from class: T22
            @Override // p000.U22.InterfaceC8180c
            /* renamed from: a */
            public final boolean mo82044a(C38322b32 c38322b32, int i, Bundle bundle) {
                boolean m82045f;
                m82045f = U22.m82045f(view, c38322b32, i, bundle);
                return m82045f;
            }
        };
    }

    /* renamed from: c */
    public static InputConnection m82048c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m82047d(inputConnection, editorInfo, m82049b(view));
    }

    @Deprecated
    /* renamed from: d */
    public static InputConnection m82047d(InputConnection inputConnection, EditorInfo editorInfo, InterfaceC8180c interfaceC8180c) {
        C37259Yd3.m74777d(inputConnection, "inputConnection must be non-null");
        C37259Yd3.m74777d(editorInfo, "editorInfo must be non-null");
        C37259Yd3.m74777d(interfaceC8180c, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new C8178a(inputConnection, false, interfaceC8180c);
        }
        if (X91.m77286a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new C8179b(inputConnection, false, interfaceC8180c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: e */
    public static boolean m82046e(String str, Bundle bundle, InterfaceC8180c interfaceC8180c) {
        boolean z;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z = true;
        }
        if (z) {
            str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        } else {
            str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
            if (z) {
                str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            } else {
                str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(str3);
                if (z) {
                    str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                } else {
                    str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                if (z) {
                    str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                } else {
                    str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                }
                Uri uri2 = (Uri) bundle.getParcelable(str5);
                if (z) {
                    str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                } else {
                    str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                }
                int i = bundle.getInt(str6);
                if (z) {
                    str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                } else {
                    str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                }
                Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                if (uri != null && clipDescription != null) {
                    r0 = interfaceC8180c.mo82044a(new C38322b32(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(r0, null);
                }
                return r0;
            } catch (Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m82045f(View view, C38322b32 c38322b32, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                c38322b32.m65056d();
                InputContentInfo m86077a = S22.m86077a(c38322b32.m65055e());
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", m86077a);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        if (C38790bq6.m62472l0(view, new C44930mA0.C25923a(new ClipData(c38322b32.m65058b(), new ClipData.Item(c38322b32.m65059a())), 2).m26211d(c38322b32.m65057c()).m26213b(bundle).m26214a()) != null) {
            return false;
        }
        return true;
    }
}
