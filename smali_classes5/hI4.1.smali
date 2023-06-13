.class public final LhI4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "LhI4;",
        "",
        "LNN1;",
        "b",
        "Landroid/content/Context;",
        "applicationContext",
        "",
        "a",
        "LNN1;",
        "transactionRepository",
        "<init>",
        "()V",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LhI4;

.field public static b:LNN1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LhI4;

    invoke-direct {v0}, LhI4;-><init>()V

    sput-object v0, LhI4;->a:LhI4;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LhI4;->b:LNN1;

    if-nez v0, :cond_0

    sget-object v0, Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;->p:Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase$a;

    invoke-virtual {v0, p1}, Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase$a;->a(Landroid/content/Context;)Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;

    move-result-object p1

    new-instance v0, LMN1;

    invoke-direct {v0, p1}, LMN1;-><init>(Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;)V

    sput-object v0, LhI4;->b:LNN1;

    :cond_0
    return-void
.end method

.method public final b()LNN1;
    .locals 2

    sget-object v0, LhI4;->b:LNN1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You can\'t access the transaction repository if you don\'t initialize it!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
