.class public final synthetic Le11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lf11;

.field public final synthetic c:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lf11;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le11;->b:Lf11;

    iput-object p2, p0, Le11;->c:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le11;->b:Lf11;

    iget-object v1, p0, Le11;->c:Landroid/content/Intent;

    invoke-static {v0, v1}, Lf11;->b(Lf11;Landroid/content/Intent;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
