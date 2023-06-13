.class public final Lcom/stripe/android/view/ActivityStarter$Args$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/ActivityStarter$Args;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0005\u0010\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/view/ActivityStarter$Args$Companion;",
        "",
        "()V",
        "EXTRA",
        "",
        "getEXTRA$annotations",
        "payments-core_release"
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/view/ActivityStarter$Args$Companion;

.field public static final EXTRA:Ljava/lang/String; = "extra_activity_args"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/view/ActivityStarter$Args$Companion;

    invoke-direct {v0}, Lcom/stripe/android/view/ActivityStarter$Args$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/view/ActivityStarter$Args$Companion;->$$INSTANCE:Lcom/stripe/android/view/ActivityStarter$Args$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getEXTRA$annotations()V
    .locals 0

    return-void
.end method
