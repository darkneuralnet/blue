.class public final LvY2$f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LvY2$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0008\u0010\u0008\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "LvY2$f$a;",
        "",
        "LvY2$e;",
        "nativeAppInfo",
        "",
        "protocolVersion",
        "LvY2$f;",
        "a",
        "b",
        "<init>",
        "()V",
        "facebook-core_release"
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

    invoke-direct {p0}, LvY2$f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LvY2$e;I)LvY2$f;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    new-instance v0, LvY2$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LvY2$f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, p1}, LvY2$f;->a(LvY2$f;LvY2$e;)V

    invoke-static {v0, p2}, LvY2$f;->b(LvY2$f;I)V

    return-object v0
.end method

.method public final b()LvY2$f;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    new-instance v0, LvY2$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LvY2$f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, -0x1

    invoke-static {v0, v1}, LvY2$f;->b(LvY2$f;I)V

    return-object v0
.end method
