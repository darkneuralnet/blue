.class public final synthetic LTW1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/q$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/h;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/camera/core/impl/i;

.field public final synthetic d:LBR5;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/h;Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTW1;->a:Landroidx/camera/core/h;

    iput-object p2, p0, LTW1;->b:Ljava/lang/String;

    iput-object p3, p0, LTW1;->c:Landroidx/camera/core/impl/i;

    iput-object p4, p0, LTW1;->d:LBR5;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 6

    iget-object v0, p0, LTW1;->a:Landroidx/camera/core/h;

    iget-object v1, p0, LTW1;->b:Ljava/lang/String;

    iget-object v2, p0, LTW1;->c:Landroidx/camera/core/impl/i;

    iget-object v3, p0, LTW1;->d:LBR5;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroidx/camera/core/h;->Y(Landroidx/camera/core/h;Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V

    return-void
.end method
