.class public final synthetic LaX1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/h;

.field public final synthetic b:Landroidx/camera/core/h$i;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/h;Landroidx/camera/core/h$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LaX1;->a:Landroidx/camera/core/h;

    iput-object p2, p0, LaX1;->b:Landroidx/camera/core/h$i;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LaX1;->a:Landroidx/camera/core/h;

    iget-object v1, p0, LaX1;->b:Landroidx/camera/core/h$i;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/h;->a0(Landroidx/camera/core/h;Landroidx/camera/core/h$i;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
