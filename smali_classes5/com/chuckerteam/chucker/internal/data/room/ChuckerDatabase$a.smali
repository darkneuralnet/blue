.class public final Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase$a;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;",
        "a",
        "",
        "DB_NAME",
        "Ljava/lang/String;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;
    .locals 2

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;

    const-string v1, "chucker.db"

    invoke-static {p1, v0, v1}, LDb5;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)LEb5$a;

    move-result-object p1

    invoke-virtual {p1}, LEb5$a;->e()LEb5$a;

    move-result-object p1

    invoke-virtual {p1}, LEb5$a;->d()LEb5;

    move-result-object p1

    check-cast p1, Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;

    return-object p1
.end method
