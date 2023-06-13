package com.michaelflisar.lumberjack;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonPointer;
import com.michaelflisar.lumberjack.interfaces.IFileLoggingSetup;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m28432d2 = {"Lcom/michaelflisar/lumberjack/FileLoggingSetup;", "Lcom/michaelflisar/lumberjack/interfaces/IFileLoggingSetup;", "", C17296a.f69688o, "()Ljava/lang/String;", "folder", "", "b", "()Z", "logOnBackgroundThread", "Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;", "c", "()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;", "setup", "<init>", "()V", "DateFiles", "NumberedFiles", "Setup", "Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;", "Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;", "lumberjack-filelogger_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* loaded from: classes6.dex */
public abstract class FileLoggingSetup implements IFileLoggingSetup {

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\t8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r¨\u0006\u001e"}, m28432d2 = {"Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;", "Lcom/michaelflisar/lumberjack/FileLoggingSetup;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "", "b", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "folder", "", "c", "Z", "()Z", "logOnBackgroundThread", "Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;", DateTokenConverter.CONVERTER_KEY, "Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;", "()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;", "setup", "e", "getPattern", "pattern", "<init>", "(Ljava/lang/String;ZLcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V", "lumberjack-filelogger_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class DateFiles extends FileLoggingSetup {
        public static final Parcelable.Creator<DateFiles> CREATOR = new C18569a();

        /* renamed from: b */
        public final String f74954b;

        /* renamed from: c */
        public final boolean f74955c;

        /* renamed from: d */
        public final Setup f74956d;

        /* renamed from: e */
        public final String f74957e;

        @Metadata(m28431k = 3, m28430mv = {1, 5, 1}, m28428xi = 48)
        /* renamed from: com.michaelflisar.lumberjack.FileLoggingSetup$DateFiles$a */
        /* loaded from: classes6.dex */
        public static final class C18569a implements Parcelable.Creator<DateFiles> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final DateFiles createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateFiles(parcel.readString(), parcel.readInt() != 0, Setup.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final DateFiles[] newArray(int i) {
                return new DateFiles[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateFiles(String folder, boolean z, Setup setup) {
            super(null);
            Intrinsics.checkNotNullParameter(folder, "folder");
            Intrinsics.checkNotNullParameter(setup, "setup");
            this.f74954b = folder;
            this.f74955c = z;
            this.f74956d = setup;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s_\\d{8}.%s", Arrays.copyOf(new Object[]{mo45919c().m45913b(), mo45919c().m45914a()}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            this.f74957e = format;
        }

        @Override // com.michaelflisar.lumberjack.FileLoggingSetup
        /* renamed from: a */
        public String mo45921a() {
            return this.f74954b;
        }

        @Override // com.michaelflisar.lumberjack.FileLoggingSetup
        /* renamed from: b */
        public boolean mo45920b() {
            return this.f74955c;
        }

        @Override // com.michaelflisar.lumberjack.FileLoggingSetup
        /* renamed from: c */
        public Setup mo45919c() {
            return this.f74956d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f74954b);
            out.writeInt(this.f74955c ? 1 : 0);
            this.f74956d.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0019"}, m28432d2 = {"Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "I", DateTokenConverter.CONVERTER_KEY, "()I", "logsToKeep", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "logPattern", "fileName", "e", C17296a.f69688o, "fileExtension", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lumberjack-filelogger_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Setup implements Parcelable {
        public static final Parcelable.Creator<Setup> CREATOR = new C18571a();

        /* renamed from: b */
        public final int f74964b;

        /* renamed from: c */
        public final String f74965c;

        /* renamed from: d */
        public final String f74966d;

        /* renamed from: e */
        public final String f74967e;

        @Metadata(m28431k = 3, m28430mv = {1, 5, 1}, m28428xi = 48)
        /* renamed from: com.michaelflisar.lumberjack.FileLoggingSetup$Setup$a */
        /* loaded from: classes6.dex */
        public static final class C18571a implements Parcelable.Creator<Setup> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Setup createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Setup(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Setup[] newArray(int i) {
                return new Setup[i];
            }
        }

        public Setup() {
            this(0, null, null, null, 15, null);
        }

        /* renamed from: a */
        public final String m45914a() {
            return this.f74967e;
        }

        /* renamed from: b */
        public final String m45913b() {
            return this.f74966d;
        }

        /* renamed from: c */
        public final String m45912c() {
            return this.f74965c;
        }

        /* renamed from: d */
        public final int m45911d() {
            return this.f74964b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.f74964b);
            out.writeString(this.f74965c);
            out.writeString(this.f74966d);
            out.writeString(this.f74967e);
        }

        public Setup(int i, String logPattern, String fileName, String fileExtension) {
            Intrinsics.checkNotNullParameter(logPattern, "logPattern");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
            this.f74964b = i;
            this.f74965c = logPattern;
            this.f74966d = fileName;
            this.f74967e = fileExtension;
        }

        public /* synthetic */ Setup(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 7 : i, (i2 & 2) != 0 ? "%d %marker%-5level %msg%n" : str, (i2 & 4) != 0 ? "log" : str2, (i2 & 8) != 0 ? "log" : str3);
        }
    }

    public /* synthetic */ FileLoggingSetup(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo45921a();

    /* renamed from: b */
    public abstract boolean mo45920b();

    /* renamed from: c */
    public abstract Setup mo45919c();

    private FileLoggingSetup() {
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b \u0010!B9\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b \u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\t8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006%"}, m28432d2 = {"Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;", "Lcom/michaelflisar/lumberjack/FileLoggingSetup;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "", "b", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "folder", "", "c", "Z", "()Z", "logOnBackgroundThread", DateTokenConverter.CONVERTER_KEY, "e", "sizeLimit", "Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;", "Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;", "()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;", "setup", "f", "getPattern", "pattern", "g", "baseFilePath", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V", "lumberjack-filelogger_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class NumberedFiles extends FileLoggingSetup {
        public static final Parcelable.Creator<NumberedFiles> CREATOR = new C18570a();

        /* renamed from: b */
        public final String f74958b;

        /* renamed from: c */
        public final boolean f74959c;

        /* renamed from: d */
        public final String f74960d;

        /* renamed from: e */
        public final Setup f74961e;

        /* renamed from: f */
        public final String f74962f;

        /* renamed from: g */
        public final String f74963g;

        @Metadata(m28431k = 3, m28430mv = {1, 5, 1}, m28428xi = 48)
        /* renamed from: com.michaelflisar.lumberjack.FileLoggingSetup$NumberedFiles$a */
        /* loaded from: classes6.dex */
        public static final class C18570a implements Parcelable.Creator<NumberedFiles> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final NumberedFiles createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NumberedFiles(parcel.readString(), parcel.readInt() != 0, parcel.readString(), Setup.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final NumberedFiles[] newArray(int i) {
                return new NumberedFiles[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NumberedFiles(String folder, boolean z, String sizeLimit, Setup setup) {
            super(null);
            Intrinsics.checkNotNullParameter(folder, "folder");
            Intrinsics.checkNotNullParameter(sizeLimit, "sizeLimit");
            Intrinsics.checkNotNullParameter(setup, "setup");
            this.f74958b = folder;
            this.f74959c = z;
            this.f74960d = sizeLimit;
            this.f74961e = setup;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s\\d*.%s", Arrays.copyOf(new Object[]{mo45919c().m45913b(), mo45919c().m45914a()}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            this.f74962f = format;
            this.f74963g = mo45921a() + JsonPointer.SEPARATOR + mo45919c().m45913b() + CoreConstants.DOT + mo45919c().m45914a();
        }

        @Override // com.michaelflisar.lumberjack.FileLoggingSetup
        /* renamed from: a */
        public String mo45921a() {
            return this.f74958b;
        }

        @Override // com.michaelflisar.lumberjack.FileLoggingSetup
        /* renamed from: b */
        public boolean mo45920b() {
            return this.f74959c;
        }

        @Override // com.michaelflisar.lumberjack.FileLoggingSetup
        /* renamed from: c */
        public Setup mo45919c() {
            return this.f74961e;
        }

        /* renamed from: d */
        public final String m45918d() {
            return this.f74963g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final String m45917e() {
            return this.f74960d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f74958b);
            out.writeInt(this.f74959c ? 1 : 0);
            out.writeString(this.f74960d);
            this.f74961e.writeToParcel(out, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ NumberedFiles(Context context, String str, boolean z, String str2, Setup setup, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, r0, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "1MB" : str2, (i & 16) != 0 ? new Setup(0, null, null, null, 15, null) : setup);
            String str3;
            if ((i & 2) != 0) {
                str3 = context.getFileStreamPath("").getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(str3, "constructor(context: Context,\n                    folder: String = context.getFileStreamPath(\"\").absolutePath,\n                    logOnBackgroundThread: Boolean = true,\n                    sizeLimit: String = \"1MB\",\n                    setup: Setup = Setup()) : this(folder, logOnBackgroundThread, sizeLimit, setup)");
            } else {
                str3 = str;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public NumberedFiles(Context context, String folder, boolean z, String sizeLimit, Setup setup) {
            this(folder, z, sizeLimit, setup);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(folder, "folder");
            Intrinsics.checkNotNullParameter(sizeLimit, "sizeLimit");
            Intrinsics.checkNotNullParameter(setup, "setup");
        }
    }
}
