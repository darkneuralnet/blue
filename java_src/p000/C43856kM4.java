package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.InputStream;
import p000.WU2;
/* renamed from: kM4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C43856kM4<Data> implements WU2<Integer, Data> {

    /* renamed from: a */
    public final WU2<Uri, Data> f94289a;

    /* renamed from: b */
    public final Resources f94290b;

    /* renamed from: kM4$a */
    /* loaded from: classes5.dex */
    public static final class C25148a implements XU2<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f94291a;

        public C25148a(Resources resources) {
            this.f94291a = resources;
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Integer, AssetFileDescriptor> mo19945b(QW2 qw2) {
            return new C43856kM4(this.f94291a, qw2.m88449d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: kM4$b */
    /* loaded from: classes5.dex */
    public static class C25149b implements XU2<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f94292a;

        public C25149b(Resources resources) {
            this.f94292a = resources;
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Integer, ParcelFileDescriptor> mo19945b(QW2 qw2) {
            return new C43856kM4(this.f94292a, qw2.m88449d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: kM4$c */
    /* loaded from: classes5.dex */
    public static class C25150c implements XU2<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f94293a;

        public C25150c(Resources resources) {
            this.f94293a = resources;
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Integer, InputStream> mo19945b(QW2 qw2) {
            return new C43856kM4(this.f94293a, qw2.m88449d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: kM4$d */
    /* loaded from: classes5.dex */
    public static class C25151d implements XU2<Integer, Uri> {

        /* renamed from: a */
        public final Resources f94294a;

        public C25151d(Resources resources) {
            this.f94294a = resources;
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Integer, Uri> mo19945b(QW2 qw2) {
            return new C43856kM4(this.f94294a, C39874de6.m43953c());
        }
    }

    public C43856kM4(Resources resources, WU2<Uri, Data> wu2) {
        this.f94290b = resources;
        this.f94289a = wu2;
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<Data> mo19951b(Integer num, int i, int i2, C48964sy3 c48964sy3) {
        Uri m29046d = m29046d(num);
        if (m29046d == null) {
            return null;
        }
        return this.f94289a.mo19951b(m29046d, i, i2, c48964sy3);
    }

    /* renamed from: d */
    public final Uri m29046d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f94290b.getResourcePackageName(num.intValue()) + JsonPointer.SEPARATOR + this.f94290b.getResourceTypeName(num.intValue()) + JsonPointer.SEPARATOR + this.f94290b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
                return null;
            }
            return null;
        }
    }

    @Override // p000.WU2
    /* renamed from: e */
    public boolean mo19952a(Integer num) {
        return true;
    }
}
