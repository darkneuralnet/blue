.class public final LNz5$b;
.super Lsz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNz5;-><init>(Lwi2;Lco/bird/android/core/mvp/BaseActivity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017\u00a8\u0006\u0006"
    }
    d2 = {
        "Nz5$b",
        "Lsz5;",
        "",
        "payload",
        "",
        "send",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LNz5;


# direct methods
.method public constructor <init>(LNz5;)V
    .locals 0

    iput-object p1, p0, LNz5$b;->a:LNz5;

    invoke-direct {p0}, Lsz5;-><init>()V

    return-void
.end method


# virtual methods
.method public send(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "received event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, LNz5$b;->a:LNz5;

    invoke-static {v0}, LNz5;->access$getDeserializer$p(LNz5;)Lwi2;

    move-result-object v0

    new-instance v1, LNz5$b$a;

    invoke-direct {v1}, LNz5$b$a;-><init>()V

    invoke-virtual {v1}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "object : TypeToken<GenericShopEvent>() {}.type"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Lwi2;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqz5;

    invoke-interface {v0}, Lqz5;->getCommand()Lrz5;

    move-result-object v0

    iget-object v1, p0, LNz5$b;->a:LNz5;

    invoke-static {v1}, LNz5;->access$getDeserializer$p(LNz5;)Lwi2;

    move-result-object v1

    invoke-virtual {v0}, Lrz5;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lwi2;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqz5;

    iget-object v0, p0, LNz5$b;->a:LNz5;

    invoke-static {v0}, LNz5;->access$getEvents$p(LNz5;)Lma4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
