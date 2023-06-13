.class public final Loe0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC61;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loe0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\tR-\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b8V@VX\u0096\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0012"
    }
    d2 = {
        "oe0$b",
        "LC61;",
        "LL61;",
        "a",
        "LL61;",
        "c",
        "()LL61;",
        "transform",
        "Lme0;",
        "()Lme0;",
        "canvas",
        "LxB5;",
        "value",
        "h",
        "()J",
        "b",
        "(J)V",
        "size",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LL61;

.field public final synthetic b:Loe0;


# direct methods
.method public constructor <init>(Loe0;)V
    .locals 0

    iput-object p1, p0, Loe0$b;->b:Loe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Lpe0;->a(LC61;)LL61;

    move-result-object p1

    iput-object p1, p0, Loe0$b;->a:LL61;

    return-void
.end method


# virtual methods
.method public a()Lme0;
    .locals 1

    iget-object v0, p0, Loe0$b;->b:Loe0;

    invoke-virtual {v0}, Loe0;->o()Loe0$a;

    move-result-object v0

    invoke-virtual {v0}, Loe0$a;->e()Lme0;

    move-result-object v0

    return-object v0
.end method

.method public b(J)V
    .locals 1

    iget-object v0, p0, Loe0$b;->b:Loe0;

    invoke-virtual {v0}, Loe0;->o()Loe0$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Loe0$a;->l(J)V

    return-void
.end method

.method public c()LL61;
    .locals 1

    iget-object v0, p0, Loe0$b;->a:LL61;

    return-object v0
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, Loe0$b;->b:Loe0;

    invoke-virtual {v0}, Loe0;->o()Loe0$a;

    move-result-object v0

    invoke-virtual {v0}, Loe0$a;->h()J

    move-result-wide v0

    return-wide v0
.end method
