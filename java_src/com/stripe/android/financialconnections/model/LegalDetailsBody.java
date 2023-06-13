package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b \u0010!B-\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0010\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LegalDetailsBody;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "Lcom/stripe/android/financialconnections/model/Bullet;", "component1", "bullets", "copy", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/util/List;", "getBullets", "()Ljava/util/List;", "getBullets$annotations", "()V", "<init>", "(Ljava/util/List;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/util/List;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class LegalDetailsBody implements Parcelable {
    private final List<Bullet> bullets;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LegalDetailsBody> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LegalDetailsBody$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/LegalDetailsBody;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<LegalDetailsBody> serializer() {
            return LegalDetailsBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<LegalDetailsBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegalDetailsBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Bullet.CREATOR.createFromParcel(parcel));
            }
            return new LegalDetailsBody(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegalDetailsBody[] newArray(int i) {
            return new LegalDetailsBody[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LegalDetailsBody(int i, @InterfaceC36694Vs5("bullets") List list, C38819bt5 c38819bt5) {
        if (1 != (i & 1)) {
            C52838zW3.m1275b(i, 1, LegalDetailsBody$$serializer.INSTANCE.getDescriptor());
        }
        this.bullets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegalDetailsBody copy$default(LegalDetailsBody legalDetailsBody, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = legalDetailsBody.bullets;
        }
        return legalDetailsBody.copy(list);
    }

    @InterfaceC36694Vs5("bullets")
    public static /* synthetic */ void getBullets$annotations() {
    }

    @JvmStatic
    public static final void write$Self(LegalDetailsBody self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1126y(serialDesc, 0, new C27999ro(Bullet$$serializer.INSTANCE), self.bullets);
    }

    public final List<Bullet> component1() {
        return this.bullets;
    }

    public final LegalDetailsBody copy(List<Bullet> bullets) {
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        return new LegalDetailsBody(bullets);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LegalDetailsBody) && Intrinsics.areEqual(this.bullets, ((LegalDetailsBody) obj).bullets);
    }

    public final List<Bullet> getBullets() {
        return this.bullets;
    }

    public int hashCode() {
        return this.bullets.hashCode();
    }

    public String toString() {
        List<Bullet> list = this.bullets;
        return "LegalDetailsBody(bullets=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<Bullet> list = this.bullets;
        out.writeInt(list.size());
        for (Bullet bullet : list) {
            bullet.writeToParcel(out, i);
        }
    }

    public LegalDetailsBody(List<Bullet> bullets) {
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        this.bullets = bullets;
    }
}
