.class public interface abstract Lcom/stripe/android/core/networking/ConnectionFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/ConnectionFactory$Companion;,
        Lcom/stripe/android/core/networking/ConnectionFactory$Default;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bJ\u0016\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H&\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/ConnectionFactory;",
        "",
        "create",
        "Lcom/stripe/android/core/networking/StripeConnection;",
        "",
        "request",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "createForFile",
        "Ljava/io/File;",
        "outputFile",
        "Companion",
        "Default",
        "stripe-core_release"
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
.field public static final synthetic Companion:Lcom/stripe/android/core/networking/ConnectionFactory$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/core/networking/ConnectionFactory$Companion;->$$INSTANCE:Lcom/stripe/android/core/networking/ConnectionFactory$Companion;

    sput-object v0, Lcom/stripe/android/core/networking/ConnectionFactory;->Companion:Lcom/stripe/android/core/networking/ConnectionFactory$Companion;

    return-void
.end method


# virtual methods
.method public abstract create(Lcom/stripe/android/core/networking/StripeRequest;)Lcom/stripe/android/core/networking/StripeConnection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            ")",
            "Lcom/stripe/android/core/networking/StripeConnection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;
        }
    .end annotation
.end method

.method public abstract createForFile(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;)Lcom/stripe/android/core/networking/StripeConnection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Ljava/io/File;",
            ")",
            "Lcom/stripe/android/core/networking/StripeConnection<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;
        }
    .end annotation
.end method
