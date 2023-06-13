.class public final LtY7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgj$a;


# instance fields
.field public final synthetic a:LC68;


# direct methods
.method public constructor <init>(LC68;)V
    .locals 0

    iput-object p1, p0, LtY7;->a:LC68;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 0

    iget-object p1, p0, LtY7;->a:LC68;

    iget-object p1, p1, LC68;->a:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    sget-object p3, LjQ7;->a:LNH8;

    invoke-static {p2}, Leu8;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_1

    move-object p2, p3

    :cond_1
    const-string p3, "events"

    invoke-virtual {p1, p3, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, LtY7;->a:LC68;

    invoke-static {p2}, LC68;->a(LC68;)Lba$b;

    move-result-object p2

    const/4 p3, 0x2

    invoke-interface {p2, p3, p1}, Lba$b;->onMessageTriggered(ILandroid/os/Bundle;)V

    return-void
.end method
