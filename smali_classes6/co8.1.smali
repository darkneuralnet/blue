.class public final synthetic Lco8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcs8;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcs8;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco8;->b:Lcs8;

    iput-object p2, p0, Lco8;->c:Ljava/lang/String;

    iput-object p3, p0, Lco8;->d:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lco8;->b:Lcs8;

    iget-object v1, p0, Lco8;->c:Ljava/lang/String;

    iget-object v2, p0, Lco8;->d:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lcs8;->h5(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
