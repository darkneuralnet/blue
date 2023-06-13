.class public final synthetic LxR5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/q$c;


# instance fields
.field public final synthetic a:LyR5;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/camera/core/impl/s;

.field public final synthetic d:LBR5;


# direct methods
.method public synthetic constructor <init>(LyR5;Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxR5;->a:LyR5;

    iput-object p2, p0, LxR5;->b:Ljava/lang/String;

    iput-object p3, p0, LxR5;->c:Landroidx/camera/core/impl/s;

    iput-object p4, p0, LxR5;->d:LBR5;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 6

    iget-object v0, p0, LxR5;->a:LyR5;

    iget-object v1, p0, LxR5;->b:Ljava/lang/String;

    iget-object v2, p0, LxR5;->c:Landroidx/camera/core/impl/s;

    iget-object v3, p0, LxR5;->d:LBR5;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, LyR5;->U(LyR5;Ljava/lang/String;Landroidx/camera/core/impl/s;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V

    return-void
.end method
