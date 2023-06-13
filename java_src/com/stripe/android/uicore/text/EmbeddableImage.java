package com.stripe.android.uicore.text;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/text/EmbeddableImage;", "", "()V", "Bitmap", "Drawable", "Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;", "Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class EmbeddableImage {
    public static final int $stable = 0;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;", "Lcom/stripe/android/uicore/text/EmbeddableImage;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Bitmap extends EmbeddableImage {
        public static final int $stable = 8;
        private final android.graphics.Bitmap bitmap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bitmap(android.graphics.Bitmap bitmap) {
            super(null);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
        }

        public static /* synthetic */ Bitmap copy$default(Bitmap bitmap, android.graphics.Bitmap bitmap2, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap2 = bitmap.bitmap;
            }
            return bitmap.copy(bitmap2);
        }

        public final android.graphics.Bitmap component1() {
            return this.bitmap;
        }

        public final Bitmap copy(android.graphics.Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return new Bitmap(bitmap);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Bitmap) && Intrinsics.areEqual(this.bitmap, ((Bitmap) obj).bitmap);
        }

        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public int hashCode() {
            return this.bitmap.hashCode();
        }

        public String toString() {
            android.graphics.Bitmap bitmap = this.bitmap;
            return "Bitmap(bitmap=" + bitmap + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;", "Lcom/stripe/android/uicore/text/EmbeddableImage;", "", "component1", "component2", "Lsm0;", "component3", "id", "contentDescription", "colorFilter", "copy", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "I", "getId", "()I", "getContentDescription", "Lsm0;", "getColorFilter", "()Lsm0;", "<init>", "(IILsm0;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Drawable extends EmbeddableImage {
        public static final int $stable = 0;
        private final C48841sm0 colorFilter;
        private final int contentDescription;

        /* renamed from: id */
        private final int f75479id;

        public /* synthetic */ Drawable(int i, int i2, C48841sm0 c48841sm0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? null : c48841sm0);
        }

        public static /* synthetic */ Drawable copy$default(Drawable drawable, int i, int i2, C48841sm0 c48841sm0, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = drawable.f75479id;
            }
            if ((i3 & 2) != 0) {
                i2 = drawable.contentDescription;
            }
            if ((i3 & 4) != 0) {
                c48841sm0 = drawable.colorFilter;
            }
            return drawable.copy(i, i2, c48841sm0);
        }

        public final int component1() {
            return this.f75479id;
        }

        public final int component2() {
            return this.contentDescription;
        }

        public final C48841sm0 component3() {
            return this.colorFilter;
        }

        public final Drawable copy(int i, int i2, C48841sm0 c48841sm0) {
            return new Drawable(i, i2, c48841sm0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                return this.f75479id == drawable.f75479id && this.contentDescription == drawable.contentDescription && Intrinsics.areEqual(this.colorFilter, drawable.colorFilter);
            }
            return false;
        }

        public final C48841sm0 getColorFilter() {
            return this.colorFilter;
        }

        public final int getContentDescription() {
            return this.contentDescription;
        }

        public final int getId() {
            return this.f75479id;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f75479id) * 31) + Integer.hashCode(this.contentDescription)) * 31;
            C48841sm0 c48841sm0 = this.colorFilter;
            return hashCode + (c48841sm0 == null ? 0 : c48841sm0.hashCode());
        }

        public String toString() {
            int i = this.f75479id;
            int i2 = this.contentDescription;
            C48841sm0 c48841sm0 = this.colorFilter;
            return "Drawable(id=" + i + ", contentDescription=" + i2 + ", colorFilter=" + c48841sm0 + ")";
        }

        public Drawable(int i, int i2, C48841sm0 c48841sm0) {
            super(null);
            this.f75479id = i;
            this.contentDescription = i2;
            this.colorFilter = c48841sm0;
        }
    }

    public /* synthetic */ EmbeddableImage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EmbeddableImage() {
    }
}
