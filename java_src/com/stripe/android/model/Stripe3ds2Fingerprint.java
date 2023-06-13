package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.StripeIntent;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001$B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\nHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "Landroid/os/Parcelable;", "sdkData", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "(Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;)V", Stripe3ds2AuthParams.FIELD_SOURCE, "", "directoryServerName", "serverTransactionId", "directoryServerEncryption", "Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;)V", "getDirectoryServerEncryption", "()Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "getDirectoryServerName", "()Ljava/lang/String;", "getServerTransactionId", "getSource", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "DirectoryServerEncryption", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class Stripe3ds2Fingerprint implements Parcelable {
    public static final Parcelable.Creator<Stripe3ds2Fingerprint> CREATOR = new Creator();
    private final DirectoryServerEncryption directoryServerEncryption;
    private final String directoryServerName;
    private final String serverTransactionId;
    private final String source;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<Stripe3ds2Fingerprint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2Fingerprint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Stripe3ds2Fingerprint(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2Fingerprint[] newArray(int i) {
            return new Stripe3ds2Fingerprint[i];
        }
    }

    public Stripe3ds2Fingerprint(String source, String directoryServerName, String serverTransactionId, DirectoryServerEncryption directoryServerEncryption) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(serverTransactionId, "serverTransactionId");
        Intrinsics.checkNotNullParameter(directoryServerEncryption, "directoryServerEncryption");
        this.source = source;
        this.directoryServerName = directoryServerName;
        this.serverTransactionId = serverTransactionId;
        this.directoryServerEncryption = directoryServerEncryption;
    }

    public static /* synthetic */ Stripe3ds2Fingerprint copy$default(Stripe3ds2Fingerprint stripe3ds2Fingerprint, String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stripe3ds2Fingerprint.source;
        }
        if ((i & 2) != 0) {
            str2 = stripe3ds2Fingerprint.directoryServerName;
        }
        if ((i & 4) != 0) {
            str3 = stripe3ds2Fingerprint.serverTransactionId;
        }
        if ((i & 8) != 0) {
            directoryServerEncryption = stripe3ds2Fingerprint.directoryServerEncryption;
        }
        return stripe3ds2Fingerprint.copy(str, str2, str3, directoryServerEncryption);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.directoryServerName;
    }

    public final String component3() {
        return this.serverTransactionId;
    }

    public final DirectoryServerEncryption component4() {
        return this.directoryServerEncryption;
    }

    public final Stripe3ds2Fingerprint copy(String source, String directoryServerName, String serverTransactionId, DirectoryServerEncryption directoryServerEncryption) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(serverTransactionId, "serverTransactionId");
        Intrinsics.checkNotNullParameter(directoryServerEncryption, "directoryServerEncryption");
        return new Stripe3ds2Fingerprint(source, directoryServerName, serverTransactionId, directoryServerEncryption);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Stripe3ds2Fingerprint) {
            Stripe3ds2Fingerprint stripe3ds2Fingerprint = (Stripe3ds2Fingerprint) obj;
            return Intrinsics.areEqual(this.source, stripe3ds2Fingerprint.source) && Intrinsics.areEqual(this.directoryServerName, stripe3ds2Fingerprint.directoryServerName) && Intrinsics.areEqual(this.serverTransactionId, stripe3ds2Fingerprint.serverTransactionId) && Intrinsics.areEqual(this.directoryServerEncryption, stripe3ds2Fingerprint.directoryServerEncryption);
        }
        return false;
    }

    public final DirectoryServerEncryption getDirectoryServerEncryption() {
        return this.directoryServerEncryption;
    }

    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    public final String getServerTransactionId() {
        return this.serverTransactionId;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((((this.source.hashCode() * 31) + this.directoryServerName.hashCode()) * 31) + this.serverTransactionId.hashCode()) * 31) + this.directoryServerEncryption.hashCode();
    }

    public String toString() {
        String str = this.source;
        String str2 = this.directoryServerName;
        String str3 = this.serverTransactionId;
        DirectoryServerEncryption directoryServerEncryption = this.directoryServerEncryption;
        return "Stripe3ds2Fingerprint(source=" + str + ", directoryServerName=" + str2 + ", serverTransactionId=" + str3 + ", directoryServerEncryption=" + directoryServerEncryption + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.source);
        out.writeString(this.directoryServerName);
        out.writeString(this.serverTransactionId);
        this.directoryServerEncryption.writeToParcel(out, i);
    }

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0001'B/\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m28432d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "Landroid/os/Parcelable;", "directoryServerId", "", "dsCertificateData", "rootCertsData", "", "keyId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "directoryServerPublicKey", "Ljava/security/PublicKey;", "rootCerts", "Ljava/security/cert/X509Certificate;", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/util/List;Ljava/lang/String;)V", "getDirectoryServerId", "()Ljava/lang/String;", "getDirectoryServerPublicKey", "()Ljava/security/PublicKey;", "getKeyId", "getRootCerts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DirectoryServerEncryption implements Parcelable {
        private final String directoryServerId;
        private final PublicKey directoryServerPublicKey;
        private final String keyId;
        private final List<X509Certificate> rootCerts;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption$Companion;", "", "()V", "generateCertificate", "Ljava/security/cert/X509Certificate;", "certificateData", "", "generateCertificates", "", "certificatesData", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nStripe3ds2Fingerprint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stripe3ds2Fingerprint.kt\ncom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1549#2:72\n1620#2,3:73\n*S KotlinDebug\n*F\n+ 1 Stripe3ds2Fingerprint.kt\ncom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption$Companion\n*L\n57#1:72\n57#1:73,3\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final X509Certificate generateCertificate(String str) throws CertificateException {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                Intrinsics.checkNotNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return (X509Certificate) generateCertificate;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final List<X509Certificate> generateCertificates(List<String> list) throws CertificateException {
                int collectionSizeOrDefault;
                List<String> list2 = list;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (String str : list2) {
                    arrayList.add(DirectoryServerEncryption.Companion.generateCertificate(str));
                }
                return arrayList;
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<DirectoryServerEncryption> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                PublicKey publicKey = (PublicKey) parcel.readSerializable();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new DirectoryServerEncryption(readString, publicKey, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectoryServerEncryption[] newArray(int i) {
                return new DirectoryServerEncryption[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DirectoryServerEncryption(String directoryServerId, PublicKey directoryServerPublicKey, List<? extends X509Certificate> rootCerts, String str) {
            Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
            Intrinsics.checkNotNullParameter(directoryServerPublicKey, "directoryServerPublicKey");
            Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
            this.directoryServerId = directoryServerId;
            this.directoryServerPublicKey = directoryServerPublicKey;
            this.rootCerts = rootCerts;
            this.keyId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DirectoryServerEncryption copy$default(DirectoryServerEncryption directoryServerEncryption, String str, PublicKey publicKey, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = directoryServerEncryption.directoryServerId;
            }
            if ((i & 2) != 0) {
                publicKey = directoryServerEncryption.directoryServerPublicKey;
            }
            if ((i & 4) != 0) {
                list = directoryServerEncryption.rootCerts;
            }
            if ((i & 8) != 0) {
                str2 = directoryServerEncryption.keyId;
            }
            return directoryServerEncryption.copy(str, publicKey, list, str2);
        }

        public final String component1() {
            return this.directoryServerId;
        }

        public final PublicKey component2() {
            return this.directoryServerPublicKey;
        }

        public final List<X509Certificate> component3() {
            return this.rootCerts;
        }

        public final String component4() {
            return this.keyId;
        }

        public final DirectoryServerEncryption copy(String directoryServerId, PublicKey directoryServerPublicKey, List<? extends X509Certificate> rootCerts, String str) {
            Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
            Intrinsics.checkNotNullParameter(directoryServerPublicKey, "directoryServerPublicKey");
            Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
            return new DirectoryServerEncryption(directoryServerId, directoryServerPublicKey, rootCerts, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DirectoryServerEncryption) {
                DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) obj;
                return Intrinsics.areEqual(this.directoryServerId, directoryServerEncryption.directoryServerId) && Intrinsics.areEqual(this.directoryServerPublicKey, directoryServerEncryption.directoryServerPublicKey) && Intrinsics.areEqual(this.rootCerts, directoryServerEncryption.rootCerts) && Intrinsics.areEqual(this.keyId, directoryServerEncryption.keyId);
            }
            return false;
        }

        public final String getDirectoryServerId() {
            return this.directoryServerId;
        }

        public final PublicKey getDirectoryServerPublicKey() {
            return this.directoryServerPublicKey;
        }

        public final String getKeyId() {
            return this.keyId;
        }

        public final List<X509Certificate> getRootCerts() {
            return this.rootCerts;
        }

        public int hashCode() {
            int hashCode = ((((this.directoryServerId.hashCode() * 31) + this.directoryServerPublicKey.hashCode()) * 31) + this.rootCerts.hashCode()) * 31;
            String str = this.keyId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.directoryServerId;
            PublicKey publicKey = this.directoryServerPublicKey;
            List<X509Certificate> list = this.rootCerts;
            String str2 = this.keyId;
            return "DirectoryServerEncryption(directoryServerId=" + str + ", directoryServerPublicKey=" + publicKey + ", rootCerts=" + list + ", keyId=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.directoryServerId);
            out.writeSerializable(this.directoryServerPublicKey);
            List<X509Certificate> list = this.rootCerts;
            out.writeInt(list.size());
            for (X509Certificate x509Certificate : list) {
                out.writeSerializable(x509Certificate);
            }
            out.writeString(this.keyId);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DirectoryServerEncryption(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
            this(directoryServerId, r4, r0.generateCertificates(rootCertsData), str);
            Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
            Intrinsics.checkNotNullParameter(dsCertificateData, "dsCertificateData");
            Intrinsics.checkNotNullParameter(rootCertsData, "rootCertsData");
            Companion companion = Companion;
            PublicKey publicKey = companion.generateCertificate(dsCertificateData).getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "generateCertificate(dsCertificateData).publicKey");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2Fingerprint(StripeIntent.NextActionData.SdkData.Use3DS2 sdkData) throws CertificateException {
        this(sdkData.getSource(), sdkData.getServerName(), sdkData.getTransactionId(), new DirectoryServerEncryption(sdkData.getServerEncryption().getDirectoryServerId(), sdkData.getServerEncryption().getDsCertificateData(), sdkData.getServerEncryption().getRootCertsData(), sdkData.getServerEncryption().getKeyId()));
        Intrinsics.checkNotNullParameter(sdkData, "sdkData");
    }
}
