package zendesk.belvedere;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C31132j;
/* renamed from: zendesk.belvedere.b */
/* loaded from: classes8.dex */
public class C31098b extends Fragment {

    /* renamed from: b */
    public WeakReference<KeyboardHelper> f121812b = new WeakReference<>(null);

    /* renamed from: c */
    public List<WeakReference<InterfaceC31100b>> f121813c = new ArrayList();

    /* renamed from: d */
    public List<WeakReference<InterfaceC31102d>> f121814d = new ArrayList();

    /* renamed from: e */
    public List<WeakReference<InterfaceC31101c>> f121815e = new ArrayList();

    /* renamed from: f */
    public C31121h f121816f = null;

    /* renamed from: g */
    public BelvedereUi.UiConfig f121817g = null;

    /* renamed from: h */
    public boolean f121818h = false;

    /* renamed from: i */
    public C31132j f121819i;

    /* renamed from: j */
    public G80<List<MediaResult>> f121820j;

    /* renamed from: zendesk.belvedere.b$a */
    /* loaded from: classes8.dex */
    public class C31099a extends G80<List<MediaResult>> {
        public C31099a() {
        }

        @Override // p000.G80
        public void success(List<MediaResult> list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (MediaResult mediaResult : list) {
                if (mediaResult.m780i() <= C31098b.this.f121817g.m862c() || C31098b.this.f121817g.m862c() == -1) {
                    arrayList.add(mediaResult);
                }
            }
            if (arrayList.size() != list.size()) {
                Toast.makeText(C31098b.this.getContext(), C44092kl4.belvedere_image_stream_file_too_large, 0).show();
            }
            C31098b.this.m752I9(arrayList);
        }
    }

    /* renamed from: zendesk.belvedere.b$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31100b {
        void onDismissed();

        void onMediaDeselected(List<MediaResult> list);

        void onMediaSelected(List<MediaResult> list);

        void onVisible();
    }

    /* renamed from: zendesk.belvedere.b$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC31101c {
        void onScroll(int i, int i2, float f);
    }

    /* renamed from: zendesk.belvedere.b$d */
    /* loaded from: classes8.dex */
    public interface InterfaceC31102d {
        /* renamed from: a */
        void m742a(List<MediaResult> list);
    }

    /* renamed from: A9 */
    public KeyboardHelper m757A9() {
        return this.f121812b.get();
    }

    /* renamed from: B9 */
    public void m756B9(List<MediaIntent> list, C31132j.InterfaceC31136d interfaceC31136d) {
        this.f121819i.m653i(this, list, interfaceC31136d);
    }

    /* renamed from: D9 */
    public boolean m755D9() {
        return this.f121816f != null;
    }

    /* renamed from: E9 */
    public void m754E9() {
        this.f121820j = null;
        for (WeakReference<InterfaceC31100b> weakReference : this.f121813c) {
            InterfaceC31100b interfaceC31100b = weakReference.get();
            if (interfaceC31100b != null) {
                interfaceC31100b.onDismissed();
            }
        }
    }

    /* renamed from: G9 */
    public void m753G9(List<MediaResult> list) {
        for (WeakReference<InterfaceC31100b> weakReference : this.f121813c) {
            InterfaceC31100b interfaceC31100b = weakReference.get();
            if (interfaceC31100b != null) {
                interfaceC31100b.onMediaDeselected(list);
            }
        }
    }

    /* renamed from: I9 */
    public void m752I9(List<MediaResult> list) {
        for (WeakReference<InterfaceC31100b> weakReference : this.f121813c) {
            InterfaceC31100b interfaceC31100b = weakReference.get();
            if (interfaceC31100b != null) {
                interfaceC31100b.onMediaSelected(list);
            }
        }
    }

    /* renamed from: J9 */
    public void m751J9(List<MediaResult> list) {
        for (WeakReference<InterfaceC31102d> weakReference : this.f121814d) {
            InterfaceC31102d interfaceC31102d = weakReference.get();
            if (interfaceC31102d != null) {
                interfaceC31102d.m742a(list);
            }
        }
    }

    /* renamed from: N6 */
    public void m750N6(InterfaceC31100b interfaceC31100b) {
        this.f121813c.add(new WeakReference<>(interfaceC31100b));
    }

    /* renamed from: P9 */
    public void m749P9(int i, int i2, float f) {
        for (WeakReference<InterfaceC31101c> weakReference : this.f121815e) {
            InterfaceC31101c interfaceC31101c = weakReference.get();
            if (interfaceC31101c != null) {
                interfaceC31101c.onScroll(i, i2, f);
            }
        }
    }

    /* renamed from: S9 */
    public void m748S9() {
        for (WeakReference<InterfaceC31100b> weakReference : this.f121813c) {
            InterfaceC31100b interfaceC31100b = weakReference.get();
            if (interfaceC31100b != null) {
                interfaceC31100b.onVisible();
            }
        }
    }

    /* renamed from: T9 */
    public void m747T9(C31121h c31121h, BelvedereUi.UiConfig uiConfig) {
        this.f121816f = c31121h;
        if (uiConfig != null) {
            this.f121817g = uiConfig;
        }
    }

    /* renamed from: da */
    public void m745da(KeyboardHelper keyboardHelper) {
        this.f121812b = new WeakReference<>(keyboardHelper);
    }

    public void dismiss() {
        if (m755D9()) {
            this.f121816f.dismiss();
        }
    }

    /* renamed from: ea */
    public boolean m744ea() {
        return this.f121818h;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f121820j = new C31099a();
        C31096a.m764c(requireContext()).m762e(i, i2, intent, this.f121820j, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f121819i = new C31132j();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C31121h c31121h = this.f121816f;
        if (c31121h != null) {
            c31121h.dismiss();
            this.f121818h = true;
            return;
        }
        this.f121818h = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f121819i.m651k(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* renamed from: t8 */
    public void m743t8(InterfaceC31101c interfaceC31101c) {
        this.f121815e.add(new WeakReference<>(interfaceC31101c));
    }
}
