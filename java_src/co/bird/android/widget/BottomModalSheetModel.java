package co.bird.android.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.widget.BottomModalSheetLayout;
import com.facebook.share.internal.C17296a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bº\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b>\u0010?JÃ\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\u0019\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b*\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b6\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b7\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b8\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b0\u0010-R2\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00108\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b&\u0010;R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b,\u0010<\u001a\u0004\b.\u0010=¨\u0006@"}, m28432d2 = {"Lco/bird/android/widget/BottomModalSheetModel;", "Landroid/os/Parcelable;", "", "titleString", "", "title", "subtitle", "Lco/bird/android/widget/BottomModalSheetLayout$a;", "buttonMode", "primaryButton", "secondaryButton", "primaryButtonBackgroundDrawable", "primaryButtonTextColor", "secondaryButtonBackgroundDrawable", "secondaryButtonTextColor", "iconDrawableRes", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/widget/BottomModalSheetLayout;", "bottomModalSheetLayoutInvoker", "", "cancelable", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/widget/BottomModalSheetLayout$a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;)Lco/bird/android/widget/BottomModalSheetModel;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "n", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "m", "e", "Lco/bird/android/widget/BottomModalSheetLayout$a;", "()Lco/bird/android/widget/BottomModalSheetLayout$a;", "f", "g", "j", "h", "i", "k", "l", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/widget/BottomModalSheetLayout$a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BottomModalSheetModel implements Parcelable {
    public static final Parcelable.Creator<BottomModalSheetModel> CREATOR = new C16467b();

    /* renamed from: b */
    public final String f67186b;

    /* renamed from: c */
    public final Integer f67187c;

    /* renamed from: d */
    public final String f67188d;

    /* renamed from: e */
    public final BottomModalSheetLayout.EnumC16464a f67189e;

    /* renamed from: f */
    public final Integer f67190f;

    /* renamed from: g */
    public final Integer f67191g;

    /* renamed from: h */
    public final Integer f67192h;

    /* renamed from: i */
    public final Integer f67193i;

    /* renamed from: j */
    public final Integer f67194j;

    /* renamed from: k */
    public final Integer f67195k;

    /* renamed from: l */
    public final Integer f67196l;

    /* renamed from: m */
    public final Function1<Context, BottomModalSheetLayout> f67197m;

    /* renamed from: n */
    public final Boolean f67198n;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/widget/BottomModalSheetLayout;", C17296a.f69688o, "(Landroid/content/Context;)Lco/bird/android/widget/BottomModalSheetLayout;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.BottomModalSheetModel$a */
    /* loaded from: classes4.dex */
    public static final class C16466a extends Lambda implements Function1<Context, BottomModalSheetLayout> {

        /* renamed from: g */
        public static final C16466a f67199g = new C16466a();

        public C16466a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BottomModalSheetLayout invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new BottomModalSheetLayout(context);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.BottomModalSheetModel$b */
    /* loaded from: classes4.dex */
    public static final class C16467b implements Parcelable.Creator<BottomModalSheetModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BottomModalSheetModel createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            BottomModalSheetLayout.EnumC16464a valueOf3 = BottomModalSheetLayout.EnumC16464a.valueOf(parcel.readString());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Function1 function1 = (Function1) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BottomModalSheetModel(readString, valueOf2, readString2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, function1, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final BottomModalSheetModel[] newArray(int i) {
            return new BottomModalSheetModel[i];
        }
    }

    public BottomModalSheetModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* renamed from: a */
    public final BottomModalSheetModel m54740a(String str, Integer num, String str2, BottomModalSheetLayout.EnumC16464a buttonMode, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Function1<? super Context, ? extends BottomModalSheetLayout> bottomModalSheetLayoutInvoker, Boolean bool) {
        Intrinsics.checkNotNullParameter(buttonMode, "buttonMode");
        Intrinsics.checkNotNullParameter(bottomModalSheetLayoutInvoker, "bottomModalSheetLayoutInvoker");
        return new BottomModalSheetModel(str, num, str2, buttonMode, num2, num3, num4, num5, num6, num7, num8, bottomModalSheetLayoutInvoker, bool);
    }

    /* renamed from: b */
    public final Function1<Context, BottomModalSheetLayout> m54739b() {
        return this.f67197m;
    }

    /* renamed from: c */
    public final BottomModalSheetLayout.EnumC16464a m54738c() {
        return this.f67189e;
    }

    /* renamed from: d */
    public final Boolean m54737d() {
        return this.f67198n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Integer m54736e() {
        return this.f67196l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BottomModalSheetModel) {
            BottomModalSheetModel bottomModalSheetModel = (BottomModalSheetModel) obj;
            return Intrinsics.areEqual(this.f67186b, bottomModalSheetModel.f67186b) && Intrinsics.areEqual(this.f67187c, bottomModalSheetModel.f67187c) && Intrinsics.areEqual(this.f67188d, bottomModalSheetModel.f67188d) && this.f67189e == bottomModalSheetModel.f67189e && Intrinsics.areEqual(this.f67190f, bottomModalSheetModel.f67190f) && Intrinsics.areEqual(this.f67191g, bottomModalSheetModel.f67191g) && Intrinsics.areEqual(this.f67192h, bottomModalSheetModel.f67192h) && Intrinsics.areEqual(this.f67193i, bottomModalSheetModel.f67193i) && Intrinsics.areEqual(this.f67194j, bottomModalSheetModel.f67194j) && Intrinsics.areEqual(this.f67195k, bottomModalSheetModel.f67195k) && Intrinsics.areEqual(this.f67196l, bottomModalSheetModel.f67196l) && Intrinsics.areEqual(this.f67197m, bottomModalSheetModel.f67197m) && Intrinsics.areEqual(this.f67198n, bottomModalSheetModel.f67198n);
        }
        return false;
    }

    /* renamed from: g */
    public final Integer m54735g() {
        return this.f67190f;
    }

    /* renamed from: h */
    public final Integer m54734h() {
        return this.f67192h;
    }

    public int hashCode() {
        String str = this.f67186b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f67187c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f67188d;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f67189e.hashCode()) * 31;
        Integer num2 = this.f67190f;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f67191g;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f67192h;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f67193i;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f67194j;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f67195k;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f67196l;
        int hashCode10 = (((hashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31) + this.f67197m.hashCode()) * 31;
        Boolean bool = this.f67198n;
        return hashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: i */
    public final Integer m54733i() {
        return this.f67193i;
    }

    /* renamed from: j */
    public final Integer m54732j() {
        return this.f67191g;
    }

    /* renamed from: k */
    public final Integer m54731k() {
        return this.f67194j;
    }

    /* renamed from: l */
    public final Integer m54730l() {
        return this.f67195k;
    }

    /* renamed from: m */
    public final String m54729m() {
        return this.f67188d;
    }

    /* renamed from: n */
    public final Integer m54728n() {
        return this.f67187c;
    }

    /* renamed from: o */
    public final String m54727o() {
        return this.f67186b;
    }

    public String toString() {
        String str = this.f67186b;
        Integer num = this.f67187c;
        String str2 = this.f67188d;
        BottomModalSheetLayout.EnumC16464a enumC16464a = this.f67189e;
        Integer num2 = this.f67190f;
        Integer num3 = this.f67191g;
        Integer num4 = this.f67192h;
        Integer num5 = this.f67193i;
        Integer num6 = this.f67194j;
        Integer num7 = this.f67195k;
        Integer num8 = this.f67196l;
        Function1<Context, BottomModalSheetLayout> function1 = this.f67197m;
        Boolean bool = this.f67198n;
        return "BottomModalSheetModel(titleString=" + str + ", title=" + num + ", subtitle=" + str2 + ", buttonMode=" + enumC16464a + ", primaryButton=" + num2 + ", secondaryButton=" + num3 + ", primaryButtonBackgroundDrawable=" + num4 + ", primaryButtonTextColor=" + num5 + ", secondaryButtonBackgroundDrawable=" + num6 + ", secondaryButtonTextColor=" + num7 + ", iconDrawableRes=" + num8 + ", bottomModalSheetLayoutInvoker=" + function1 + ", cancelable=" + bool + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f67186b);
        Integer num = this.f67187c;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f67188d);
        out.writeString(this.f67189e.name());
        Integer num2 = this.f67190f;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.f67191g;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.f67192h;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.f67193i;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num5.intValue());
        }
        Integer num6 = this.f67194j;
        if (num6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num6.intValue());
        }
        Integer num7 = this.f67195k;
        if (num7 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num7.intValue());
        }
        Integer num8 = this.f67196l;
        if (num8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num8.intValue());
        }
        out.writeSerializable((Serializable) this.f67197m);
        Boolean bool = this.f67198n;
        if (bool == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool.booleanValue() ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomModalSheetModel(String str, Integer num, String str2, BottomModalSheetLayout.EnumC16464a buttonMode, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Function1<? super Context, ? extends BottomModalSheetLayout> bottomModalSheetLayoutInvoker, Boolean bool) {
        Intrinsics.checkNotNullParameter(buttonMode, "buttonMode");
        Intrinsics.checkNotNullParameter(bottomModalSheetLayoutInvoker, "bottomModalSheetLayoutInvoker");
        this.f67186b = str;
        this.f67187c = num;
        this.f67188d = str2;
        this.f67189e = buttonMode;
        this.f67190f = num2;
        this.f67191g = num3;
        this.f67192h = num4;
        this.f67193i = num5;
        this.f67194j = num6;
        this.f67195k = num7;
        this.f67196l = num8;
        this.f67197m = bottomModalSheetLayoutInvoker;
        this.f67198n = bool;
    }

    public /* synthetic */ BottomModalSheetModel(String str, Integer num, String str2, BottomModalSheetLayout.EnumC16464a enumC16464a, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Function1 function1, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? BottomModalSheetLayout.EnumC16464a.NONE : enumC16464a, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : num5, (i & 256) != 0 ? null : num6, (i & 512) != 0 ? null : num7, (i & 1024) != 0 ? null : num8, (i & 2048) != 0 ? C16466a.f67199g : function1, (i & 4096) == 0 ? bool : null);
    }
}
