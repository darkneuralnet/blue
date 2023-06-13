.class public final Lcom/stripe/android/stripe3ds2/SdkVersion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/SdkVersion;",
        "",
        "()V",
        "VERSION_CODE",
        "",
        "VERSION_NAME",
        "",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/stripe3ds2/SdkVersion;

.field public static final VERSION_CODE:I = 0x18

.field public static final VERSION_NAME:Ljava/lang/String; = "6.1.7"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/SdkVersion;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/SdkVersion;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/SdkVersion;->INSTANCE:Lcom/stripe/android/stripe3ds2/SdkVersion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
