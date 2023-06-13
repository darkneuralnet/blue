package p000;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* renamed from: b32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38322b32 {

    /* renamed from: a */
    public final InterfaceC12283c f56836a;

    /* renamed from: b32$b */
    /* loaded from: classes.dex */
    public static final class C12282b implements InterfaceC12283c {

        /* renamed from: a */
        public final Uri f56838a;

        /* renamed from: b */
        public final ClipDescription f56839b;

        /* renamed from: c */
        public final Uri f56840c;

        public C12282b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f56838a = uri;
            this.f56839b = clipDescription;
            this.f56840c = uri2;
        }

        @Override // p000.C38322b32.InterfaceC12283c
        /* renamed from: a */
        public Object mo65053a() {
            return null;
        }

        @Override // p000.C38322b32.InterfaceC12283c
        /* renamed from: b */
        public Uri mo65052b() {
            return this.f56838a;
        }

        @Override // p000.C38322b32.InterfaceC12283c
        /* renamed from: c */
        public void mo65051c() {
        }

        @Override // p000.C38322b32.InterfaceC12283c
        /* renamed from: d */
        public Uri mo65050d() {
            return this.f56840c;
        }

        @Override // p000.C38322b32.InterfaceC12283c
        public ClipDescription getDescription() {
            return this.f56839b;
        }
    }

    /* renamed from: b32$c */
    /* loaded from: classes.dex */
    public interface InterfaceC12283c {
        /* renamed from: a */
        Object mo65053a();

        /* renamed from: b */
        Uri mo65052b();

        /* renamed from: c */
        void mo65051c();

        /* renamed from: d */
        Uri mo65050d();

        ClipDescription getDescription();
    }

    public C38322b32(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f56836a = new C12281a(uri, clipDescription, uri2);
        } else {
            this.f56836a = new C12282b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C38322b32 m65054f(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new C38322b32(new C12281a(obj));
    }

    /* renamed from: a */
    public Uri m65059a() {
        return this.f56836a.mo65052b();
    }

    /* renamed from: b */
    public ClipDescription m65058b() {
        return this.f56836a.getDescription();
    }

    /* renamed from: c */
    public Uri m65057c() {
        return this.f56836a.mo65050d();
    }

    /* renamed from: d */
    public void m65056d() {
        this.f56836a.mo65051c();
    }

    /* renamed from: e */
    public Object m65055e() {
        return this.f56836a.mo65053a();
    }

    /* renamed from: b32$a */
    /* loaded from: classes.dex */
    public static final class C12281a implements InterfaceC12283c {

        /* renamed from: a */
        public final InputContentInfo f56837a;

        public C12281a(Object obj) {
            this.f56837a = S22.m86077a(obj);
        }

        @Override // p000.C38322b32.InterfaceC12283c
        /* renamed from: a */
        public Object mo65053a() {
            return this.f56837a;
        }

        @Override // p000.C38322b32.InterfaceC12283c
        /* renamed from: b */
        public Uri mo65052b() {
            Uri contentUri;
            contentUri = this.f56837a.getContentUri();
            return contentUri;
        }

        @Override // p000.C38322b32.InterfaceC12283c
        /* renamed from: c */
        public void mo65051c() {
            this.f56837a.requestPermission();
        }

        @Override // p000.C38322b32.InterfaceC12283c
        /* renamed from: d */
        public Uri mo65050d() {
            Uri linkUri;
            linkUri = this.f56837a.getLinkUri();
            return linkUri;
        }

        @Override // p000.C38322b32.InterfaceC12283c
        public ClipDescription getDescription() {
            ClipDescription description;
            description = this.f56837a.getDescription();
            return description;
        }

        public C12281a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            W22.m78896a();
            this.f56837a = V22.m80474a(uri, clipDescription, uri2);
        }
    }

    public C38322b32(InterfaceC12283c interfaceC12283c) {
        this.f56836a = interfaceC12283c;
    }
}
