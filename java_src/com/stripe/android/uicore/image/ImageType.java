package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum PNG uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001d\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/uicore/image/ImageType;", "", "suffixes", "", "", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V", "getCompressFormat", "()Landroid/graphics/Bitmap$CompressFormat;", "getSuffixes", "()Ljava/util/List;", "PNG", "WEBP", "JPEG", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ImageType {
    private static final /* synthetic */ ImageType[] $VALUES;
    public static final Companion Companion;
    public static final ImageType JPEG;
    public static final ImageType PNG;
    public static final ImageType WEBP;
    private final Bitmap.CompressFormat compressFormat;
    private final List<String> suffixes;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/image/ImageType$Companion;", "", "()V", "fromUrl", "Lcom/stripe/android/uicore/image/ImageType;", "url", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/uicore/image/ImageType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1282#2:125\n1283#2:129\n1747#3,3:126\n*S KotlinDebug\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/uicore/image/ImageType$Companion\n*L\n112#1:125\n112#1:129\n113#1:126,3\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImageType fromUrl(String url) {
            ImageType[] values;
            boolean z;
            boolean endsWith;
            Intrinsics.checkNotNullParameter(url, "url");
            for (ImageType imageType : ImageType.values()) {
                List<String> suffixes = imageType.getSuffixes();
                if (!(suffixes instanceof Collection) || !suffixes.isEmpty()) {
                    for (String str : suffixes) {
                        z = true;
                        endsWith = StringsKt__StringsJVMKt.endsWith(url, str, true);
                        if (endsWith) {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    return imageType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ImageType[] $values() {
        return new ImageType[]{PNG, WEBP, JPEG};
    }

    static {
        List listOf;
        List listOf2;
        List listOf3;
        listOf = CollectionsKt__CollectionsJVMKt.listOf("png");
        PNG = new ImageType("PNG", 0, listOf, Bitmap.CompressFormat.PNG);
        listOf2 = CollectionsKt__CollectionsJVMKt.listOf("webp");
        WEBP = new ImageType("WEBP", 1, listOf2, Bitmap.CompressFormat.WEBP);
        listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"jpeg", "jpg"});
        JPEG = new ImageType("JPEG", 2, listOf3, Bitmap.CompressFormat.JPEG);
        $VALUES = $values();
        Companion = new Companion(null);
    }

    private ImageType(String str, int i, List list, Bitmap.CompressFormat compressFormat) {
        this.suffixes = list;
        this.compressFormat = compressFormat;
    }

    public static ImageType valueOf(String str) {
        return (ImageType) Enum.valueOf(ImageType.class, str);
    }

    public static ImageType[] values() {
        return (ImageType[]) $VALUES.clone();
    }

    public final Bitmap.CompressFormat getCompressFormat() {
        return this.compressFormat;
    }

    public final List<String> getSuffixes() {
        return this.suffixes;
    }
}
