.class public final Lma0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVf6;


# instance fields
.field public final b:Li51;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Li51;->b(Landroid/content/Context;)Li51;

    move-result-object p1

    iput-object p1, p0, Lma0;->b:Li51;

    return-void
.end method


# virtual methods
.method public a(LVf6$b;I)Landroidx/camera/core/impl/f;
    .locals 9

    invoke-static {}, Landroidx/camera/core/impl/m;->V()Landroidx/camera/core/impl/m;

    move-result-object v0

    new-instance v1, Landroidx/camera/core/impl/q$b;

    invoke-direct {v1}, Landroidx/camera/core/impl/q$b;-><init>()V

    sget-object v2, Lma0$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v2, v3

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v3, v8, :cond_2

    if-eq v3, v7, :cond_1

    if-eq v3, v6, :cond_1

    if-eq v3, v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/q$b;->u(I)Landroidx/camera/core/impl/q$b;

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v8}, Landroidx/camera/core/impl/q$b;->u(I)Landroidx/camera/core/impl/q$b;

    goto :goto_1

    :cond_2
    if-ne p2, v7, :cond_3

    move v3, v4

    goto :goto_0

    :cond_3
    move v3, v8

    :goto_0
    invoke-virtual {v1, v3}, Landroidx/camera/core/impl/q$b;->u(I)Landroidx/camera/core/impl/q$b;

    :goto_1
    sget-object v3, Landroidx/camera/core/impl/s;->v:Landroidx/camera/core/impl/f$a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    sget-object v1, Landroidx/camera/core/impl/s;->x:Landroidx/camera/core/impl/f$a;

    sget-object v3, Lla0;->a:Lla0;

    invoke-virtual {v0, v1, v3}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    new-instance v1, Landroidx/camera/core/impl/d$a;

    invoke-direct {v1}, Landroidx/camera/core/impl/d$a;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    if-eq v2, v8, :cond_6

    if-eq v2, v7, :cond_5

    if-eq v2, v6, :cond_5

    if-eq v2, v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/d$a;->s(I)V

    goto :goto_3

    :cond_5
    invoke-virtual {v1, v8}, Landroidx/camera/core/impl/d$a;->s(I)V

    goto :goto_3

    :cond_6
    if-ne p2, v7, :cond_7

    goto :goto_2

    :cond_7
    move v4, v7

    :goto_2
    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/d$a;->s(I)V

    :goto_3
    sget-object p2, Landroidx/camera/core/impl/s;->w:Landroidx/camera/core/impl/f$a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    sget-object p2, Landroidx/camera/core/impl/s;->y:Landroidx/camera/core/impl/f$a;

    sget-object v1, LVf6$b;->b:LVf6$b;

    if-ne p1, v1, :cond_8

    sget-object v1, LiX1;->c:LiX1;

    goto :goto_4

    :cond_8
    sget-object v1, LL90;->a:LL90;

    :goto_4
    invoke-virtual {v0, p2, v1}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    sget-object p2, LVf6$b;->c:LVf6$b;

    if-ne p1, p2, :cond_9

    sget-object p2, Landroidx/camera/core/impl/k;->r:Landroidx/camera/core/impl/f$a;

    iget-object v1, p0, Lma0;->b:Li51;

    invoke-virtual {v1}, Li51;->d()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_9
    iget-object p2, p0, Lma0;->b:Li51;

    invoke-virtual {p2}, Li51;->c()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Display;->getRotation()I

    move-result p2

    sget-object v1, Landroidx/camera/core/impl/k;->m:Landroidx/camera/core/impl/f$a;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    sget-object p2, LVf6$b;->e:LVf6$b;

    if-ne p1, p2, :cond_a

    sget-object p1, Landroidx/camera/core/impl/s;->C:Landroidx/camera/core/impl/f$a;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_a
    invoke-static {v0}, Landroidx/camera/core/impl/n;->T(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/n;

    move-result-object p1

    return-object p1
.end method
