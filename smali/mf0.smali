.class public final synthetic Lmf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/f$b;


# instance fields
.field public final synthetic a:Lnf0$a;

.field public final synthetic b:Landroidx/camera/core/impl/f;


# direct methods
.method public synthetic constructor <init>(Lnf0$a;Landroidx/camera/core/impl/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf0;->a:Lnf0$a;

    iput-object p2, p0, Lmf0;->b:Landroidx/camera/core/impl/f;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/impl/f$a;)Z
    .locals 2

    iget-object v0, p0, Lmf0;->a:Lnf0$a;

    iget-object v1, p0, Lmf0;->b:Landroidx/camera/core/impl/f;

    invoke-static {v0, v1, p1}, Lnf0$a;->a(Lnf0$a;Landroidx/camera/core/impl/f;Landroidx/camera/core/impl/f$a;)Z

    move-result p1

    return p1
.end method
