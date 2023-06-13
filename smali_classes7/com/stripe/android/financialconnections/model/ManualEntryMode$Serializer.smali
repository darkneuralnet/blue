.class public final Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;
.super Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/ManualEntryMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer<",
        "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;",
        "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;",
        "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        "()V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-static {}, Lcom/stripe/android/financialconnections/model/ManualEntryMode;->values()[Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/financialconnections/model/ManualEntryMode;->UNKNOWN:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;-><init>([Ljava/lang/Enum;Ljava/lang/Enum;)V

    return-void
.end method
