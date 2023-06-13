.class public final Ltz5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\"\u001c\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0003\"\u001c\u0010\u0008\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0003\"\u001c\u0010\n\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0003\u00a8\u0006\u000b"
    }
    d2 = {
        "Ljava/lang/reflect/Type;",
        "kotlin.jvm.PlatformType",
        "a",
        "Ljava/lang/reflect/Type;",
        "REQUEST_CONTEXT_TYPE",
        "b",
        "REQUEST_PAYMENT_TYPE",
        "c",
        "CLOSE_VIEW_TYPE",
        "d",
        "UNKNOWN_TYPE",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/reflect/Type;

.field public static final b:Ljava/lang/reflect/Type;

.field public static final c:Ljava/lang/reflect/Type;

.field public static final d:Ljava/lang/reflect/Type;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltz5$b;

    invoke-direct {v0}, Ltz5$b;-><init>()V

    invoke-virtual {v0}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    sput-object v0, Ltz5;->a:Ljava/lang/reflect/Type;

    new-instance v0, Ltz5$c;

    invoke-direct {v0}, Ltz5$c;-><init>()V

    invoke-virtual {v0}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    sput-object v0, Ltz5;->b:Ljava/lang/reflect/Type;

    new-instance v0, Ltz5$a;

    invoke-direct {v0}, Ltz5$a;-><init>()V

    invoke-virtual {v0}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    sput-object v0, Ltz5;->c:Ljava/lang/reflect/Type;

    new-instance v0, Ltz5$d;

    invoke-direct {v0}, Ltz5$d;-><init>()V

    invoke-virtual {v0}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    sput-object v0, Ltz5;->d:Ljava/lang/reflect/Type;

    return-void
.end method

.method public static final synthetic access$getCLOSE_VIEW_TYPE$p()Ljava/lang/reflect/Type;
    .locals 1

    sget-object v0, Ltz5;->c:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public static final synthetic access$getREQUEST_CONTEXT_TYPE$p()Ljava/lang/reflect/Type;
    .locals 1

    sget-object v0, Ltz5;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public static final synthetic access$getREQUEST_PAYMENT_TYPE$p()Ljava/lang/reflect/Type;
    .locals 1

    sget-object v0, Ltz5;->b:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public static final synthetic access$getUNKNOWN_TYPE$p()Ljava/lang/reflect/Type;
    .locals 1

    sget-object v0, Ltz5;->d:Ljava/lang/reflect/Type;

    return-object v0
.end method
