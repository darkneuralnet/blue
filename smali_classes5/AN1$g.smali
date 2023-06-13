.class public final LAN1$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAN1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "LAN1$g;",
        "",
        "LWT2;",
        "method",
        "b",
        "",
        "",
        "SUPPORTED_DECODING",
        "Ljava/util/List;",
        "<init>",
        "()V",
        "fuel"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
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

    invoke-direct {p0}, LAN1$g;-><init>()V

    return-void
.end method

.method public static final synthetic a(LAN1$g;LWT2;)LWT2;
    .locals 0

    invoke-virtual {p0, p1}, LAN1$g;->b(LWT2;)LWT2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LWT2;)LWT2;
    .locals 1

    sget-object v0, LWT2;->j:LWT2;

    if-ne p1, v0, :cond_0

    sget-object p1, LWT2;->e:LWT2;

    :cond_0
    return-object p1
.end method
