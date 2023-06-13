.class public final Lcom/stripe/android/link/injection/LinkActivityContractArgsModule$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/LinkActivityContractArgsModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/LinkActivityContractArgsModule$Companion;",
        "",
        "()V",
        "provideConfiguration",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "args",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "link_release"
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/link/injection/LinkActivityContractArgsModule$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule$Companion;

    invoke-direct {v0}, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule$Companion;->$$INSTANCE:Lcom/stripe/android/link/injection/LinkActivityContractArgsModule$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideConfiguration(Lcom/stripe/android/link/LinkActivityContract$Args;)Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getConfiguration$link_release()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-result-object p1

    return-object p1
.end method
