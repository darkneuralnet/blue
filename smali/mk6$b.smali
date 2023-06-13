.class public final Lmk6$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk6;->d(Lvf;FF)Lxf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "mk6$b",
        "Lxf;",
        "",
        "index",
        "Ltu1;",
        "a",
        "Ltu1;",
        "anim",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Ltu1;


# direct methods
.method public constructor <init>(FF)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Ltu1;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Ltu1;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, p0, Lmk6$b;->a:Ltu1;

    return-void
.end method


# virtual methods
.method public a(I)Ltu1;
    .locals 0

    iget-object p1, p0, Lmk6$b;->a:Ltu1;

    return-object p1
.end method

.method public bridge synthetic get(I)Lju1;
    .locals 0

    invoke-virtual {p0, p1}, Lmk6$b;->a(I)Ltu1;

    move-result-object p1

    return-object p1
.end method
