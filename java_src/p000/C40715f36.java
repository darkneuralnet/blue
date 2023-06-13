package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.Texture;
import com.google.android.filament.android.TextureHelper;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\u0011"}, m28432d2 = {"Lf36;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "imageFileLocation", "Lf36$a;", "type", "Lcom/google/android/filament/Texture;", C17296a.f69688o, "Ljava/nio/ByteBuffer;", "imageBuffer", "b", "Lcom/google/android/filament/Texture$InternalFormat;", "c", "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: f36  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40715f36 {

    /* renamed from: a */
    public static final C40715f36 f79352a = new C40715f36();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lf36$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: f36$a */
    /* loaded from: classes6.dex */
    public enum EnumC20180a {
        COLOR,
        NORMAL,
        DATA
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: f36$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C20181b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC20180a.values().length];
            try {
                iArr[EnumC20180a.COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC20180a.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC20180a.DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Ljava/nio/ByteBuffer;", "buffer", "Lcom/google/android/filament/Texture;", C17296a.f69688o, "(Ljava/nio/ByteBuffer;)Lcom/google/android/filament/Texture;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: f36$c */
    /* loaded from: classes6.dex */
    public static final class C20182c extends Lambda implements Function1<ByteBuffer, Texture> {

        /* renamed from: g */
        public final /* synthetic */ EnumC20180a f79357g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20182c(EnumC20180a enumC20180a) {
            super(1);
            this.f79357g = enumC20180a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Texture invoke(ByteBuffer byteBuffer) {
            C40715f36 c40715f36 = C40715f36.f79352a;
            Intrinsics.checkNotNull(byteBuffer);
            return c40715f36.m42217b(byteBuffer, this.f79357g);
        }
    }

    private C40715f36() {
    }

    /* renamed from: a */
    public final Texture m42218a(Context context, String imageFileLocation, EnumC20180a type) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageFileLocation, "imageFileLocation");
        Intrinsics.checkNotNullParameter(type, "type");
        return (Texture) C45042mM4.m25807e(context, imageFileLocation, new C20182c(type));
    }

    /* renamed from: b */
    public final Texture m42217b(ByteBuffer imageBuffer, EnumC20180a type) {
        boolean z;
        Intrinsics.checkNotNullParameter(imageBuffer, "imageBuffer");
        Intrinsics.checkNotNullParameter(type, "type");
        byte[] array = imageBuffer.array();
        int capacity = imageBuffer.capacity();
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (type == EnumC20180a.COLOR) {
            z = true;
        } else {
            z = false;
        }
        options.inPremultiplied = z;
        Unit unit = Unit.INSTANCE;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(array, 0, capacity, options);
        Texture.Builder levels = new Texture.Builder().width(decodeByteArray.getWidth()).height(decodeByteArray.getHeight()).sampler(Texture.Sampler.SAMPLER_2D).format(m42216c(type)).levels(KotlinVersion.MAX_COMPONENT_VALUE);
        Intrinsics.checkNotNullExpressionValue(levels, "Builder()\n            .w…            .levels(0xff)");
        Texture m43308a = C40122e36.m43308a(levels);
        TextureHelper.setBitmap(C39939dl1.m43784c(), m43308a, 0, decodeByteArray);
        m43308a.generateMipmaps(C39939dl1.m43784c());
        return m43308a;
    }

    /* renamed from: c */
    public final Texture.InternalFormat m42216c(EnumC20180a enumC20180a) {
        int i = C20181b.$EnumSwitchMapping$0[enumC20180a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return Texture.InternalFormat.RGBA8;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Texture.InternalFormat.RGBA8;
        }
        return Texture.InternalFormat.SRGB8_A8;
    }
}
