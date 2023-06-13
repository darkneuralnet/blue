package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bo.app.C12861l0;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.File;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p053io.CloseableKt;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\u0014"}, m28432d2 = {"Lbo/app/h;", "", "", "key", "c", "Landroid/graphics/Bitmap;", "b", "bitmap", "", C17296a.f69688o, "", "Ljava/io/File;", "directory", "", "appVersion", "valueCount", "", "maxSize", "<init>", "(Ljava/io/File;IIJ)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.h */
/* loaded from: classes.dex */
public final class C12692h {

    /* renamed from: a */
    private final C12861l0 f58549a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h$a */
    /* loaded from: classes.dex */
    public static final class C12693a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58550b;

        /* renamed from: c */
        final /* synthetic */ String f58551c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12693a(String str, String str2) {
            super(0);
            this.f58550b = str;
            this.f58551c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Error while retrieving disk for key " + this.f58550b + " diskKey " + this.f58551c;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h$b */
    /* loaded from: classes.dex */
    public static final class C12694b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58552b;

        /* renamed from: c */
        final /* synthetic */ String f58553c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12694b(String str, String str2) {
            super(0);
            this.f58552b = str;
            this.f58553c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get bitmap from disk cache for key " + this.f58552b + " diskKey " + this.f58553c;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h$c */
    /* loaded from: classes.dex */
    public static final class C12695c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58554b;

        /* renamed from: c */
        final /* synthetic */ String f58555c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12695c(String str, String str2) {
            super(0);
            this.f58554b = str;
            this.f58555c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to load image from disk cache: " + this.f58554b + JsonPointer.SEPARATOR + this.f58555c;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h$d */
    /* loaded from: classes.dex */
    public static final class C12696d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58556b;

        /* renamed from: c */
        final /* synthetic */ String f58557c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12696d(String str, String str2) {
            super(0);
            this.f58556b = str;
            this.f58557c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Error while producing output stream or compressing bitmap for key " + this.f58556b + " diskKey " + this.f58557c;
        }
    }

    public C12692h(File file, int i, int i2, long j) {
        C12861l0 m63396a = C12861l0.m63396a(file, i, i2, j);
        Intrinsics.checkNotNullExpressionValue(m63396a, "open(directory, appVersion, valueCount, maxSize)");
        this.f58549a = m63396a;
    }

    /* renamed from: c */
    private final String m63657c(String str) {
        return String.valueOf(str.hashCode());
    }

    /* renamed from: a */
    public final void m63659a(String key, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        String m63657c = m63657c(key);
        try {
            C12861l0.C12864c m63394a = this.f58549a.m63394a(m63657c);
            OutputStream m63373a = m63394a.m63373a(0);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, m63373a);
            m63373a.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(m63373a, null);
            m63394a.m63370b();
        } catch (Throwable th) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, th, false, new C12696d(key, m63657c), 4, null);
        }
    }

    /* renamed from: b */
    public final Bitmap m63658b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String m63657c = m63657c(key);
        try {
            C12861l0.C12866d m63390b = this.f58549a.m63390b(m63657c);
            Bitmap decodeStream = BitmapFactory.decodeStream(m63390b.m63368a(0));
            CloseableKt.closeFinally(m63390b, null);
            return decodeStream;
        } catch (Throwable th) {
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.E, th, false, new C12694b(key, m63657c), 4, null);
            C43664k20.m29442e(c43664k20, this, null, null, false, new C12695c(key, m63657c), 7, null);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m63660a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String m63657c = m63657c(key);
        try {
            C12861l0.C12866d m63390b = this.f58549a.m63390b(m63657c);
            boolean z = m63390b != null;
            CloseableKt.closeFinally(m63390b, null);
            return z;
        } catch (Throwable th) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, th, false, new C12693a(key, m63657c), 4, null);
            return false;
        }
    }
}
